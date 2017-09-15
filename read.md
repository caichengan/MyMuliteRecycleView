#### 实现RecycleView的三种简单多布局方法

1、第一种 RecycleView多布局的实现

      setContentView(R.layout.activity_recycle_view_mulite);
        recyclerView = (RecyclerView) findViewById(R.id.recycleViewlist);
        /**
         * 第一种 RecycleView多布局的实现
         */
        GridLayoutManager gridLayoutManager=new GridLayoutManager(RecycleViewMuliteActivity.this,2);
        adapter=new MyAdapter(RecycleViewMuliteActivity.this,data);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                int spansize=1;
                switch (adapter.getItemViewType(position)){
                    case 1:
                        spansize=2;
                    case 2:
                        spansize=2;
                }
                return spansize;
            }
        });
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
        adapter.setClickListener(RecycleViewMuliteActivity.this);
		//获取数据源
        getDatas();

2、第二种 RecycleView实现多布局

	   setContentView(R.layout.activity_recycle_view_mulite);
        recyclerView = (RecyclerView) findViewById(R.id.recycleViewlist);
       /* *
         * 第二种 RecycleView实现多布局*/
        //LinearLayout的垂直布局
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
       //GridLayout的布局
        /*recyclerView.setLayoutManager(new GridLayoutManager(this, 2));*/
        RecycleViewAdapter adapter=new RecycleViewAdapter(this,titles);
        recyclerView.setAdapter(adapter);

3、第三种 RecycleView实现多布局（嵌套多个RecycleView）
	 
 	    setContentView(R.layout.activity_recycle_mulite);
        recyclerViewLin=(ViewPager) findViewById(R.id.recycleViewPager);
        tvList=(TextView) findViewById(R.id.tvList);
        recyclerViewList=(RecyclerView) findViewById(R.id.recycleViewList);
        tvGrid=(TextView) findViewById(R.id.tvGrid);
        recyclerViewLinGrid=(RecyclerView) findViewById(R.id.recycleViewGrid);

        dataLists=new ArrayList<>();
        dataGrids=new ArrayList<>();
        for (int i = 0; i < 5; i++) {

            RecycleListMode mode=new RecycleListMode();
            mode.setId(i+"");
            mode.setName("张三");
            mode.setTitle("很谨慎");
            mode.setContent("烧热后方可温热后付款计划热客户反馈热火");
            mode.setImgURL("");

            dataLists.add(mode);
        }

        for (int i = 0; i < 15; i++) {

            RecycleListMode mode=new RecycleListMode();
            mode.setId(i+"");
            mode.setName("李四");
            mode.setTitle("很杀人蜂空间谨慎");
            mode.setContent("烧热后方可温热后付款计划热客户反馈热火");
            mode.setImgURL("");

            dataGrids.add(mode);
        }


        recyclerViewList.setLayoutManager(new LinearLayoutManager(this));
        RecycleListAdapter adapter=new RecycleListAdapter(this,dataLists);
        recyclerViewList.setAdapter(adapter);

        recyclerViewLinGrid.setLayoutManager(new GridLayoutManager(this,2));
        RecycleListAdapter adapter2=new RecycleListAdapter(this,dataGrids);
        recyclerViewLinGrid.setAdapter(adapter2);

    