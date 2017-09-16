package com.diandianguanjia.mymuliterecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class  RecycleViewMuliteActivity extends AppCompatActivity implements MyAdapter.OnItemClickListener {

    private String []titles={"asejhf","skdlrf","sekcjfwakejdre","sferbgerf","dfsrftg"};
    private static final String TAG = "RecycleViewMuliteActivi";
    List<ModleDats.DataBean.ItemsBean>  data=new ArrayList<>();
    private MyAdapter adapter;

    public static final String URL_PATH="http://dxy.com/app/i/feed/index/list?hardName=Google%20Nexus%205%20-%205.1.0%20-%20API%2022%20-%201080x1920&u=&bv=2015&ac=d5424fa6-adff-4b0a-8917-4264daf4a348&vc=5.1.9&vs=5.1&mc=00000000600ba4e6ffffffff99d603a9";
    private RecyclerView recyclerView;
    private int spansize=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_recycle_view_mulite);
        recyclerView = (RecyclerView) findViewById(R.id.recycleViewlist);

        /**
         * 模拟数据实现商城  RecycleView  的多布局实现
         */
        final List<RecycleListMode> listRecyDatas=new ArrayList<>();
        RecycleListMode mode0=new RecycleListMode();
        mode0.setStyle(0);
        mode0.setImgURL("https://img.alicdn.com/simba/img/TB1Kod0SXXXXXbPXFXXSutbFXXX.jpg");
        listRecyDatas.add(mode0);

        RecycleListMode mode=new RecycleListMode();
        mode.setId("");
        mode.setName("满66减30三合一海鲜");
        mode.setContent("（虾仁+鱿鱼须+墨鱼花）185g/包)");
        mode.setPrice("¥ 19.90");
        mode.setStyle(1);
        mode.setImgURL("https://img.alicdn.com/imgextra/i1/1910146537/TB2y03MabSGJuJjSZFqXXXo2pXa_!!1910146537.jpg_430x430q90.jpg");
        listRecyDatas.add(mode);

        RecycleListMode mode1=new RecycleListMode();
        mode1.setId("");
        mode1.setStyle(1);
        mode1.setName("【天猫超市】泸州老窖奥普蓝");
        mode1.setContent("原浆啤酒320ml*6罐(蓝罐) 六连包");
        mode1.setPrice("¥ 24.90");
        mode1.setImgURL("https://img.alicdn.com/imgextra/i3/725677994/TB1franSVXXXXX9XFXXXXXXXXXX_!!0-item_pic.jpg_430x430q90.jpg");
        listRecyDatas.add(mode1);

        RecycleListMode mode2=new RecycleListMode();
        mode2.setId("");
        mode2.setStyle(1);
        mode2.setPrice("¥ 19.90");
        mode2.setName("满66减30三合一海鲜");
        mode2.setContent("（虾仁+鱿鱼须+墨鱼花）185g/包)");
        mode2.setImgURL("https://img.alicdn.com/imgextra/i1/1910146537/TB2y03MabSGJuJjSZFqXXXo2pXa_!!1910146537.jpg_430x430q90.jpg");
        listRecyDatas.add(mode2);

        RecycleListMode mode3=new RecycleListMode();
        mode3.setId("");
        mode3.setStyle(1);
        mode3.setPrice("¥ 19.90");
        mode3.setName("满66减30三合一海鲜");
        mode3.setContent("（虾仁+鱿鱼须+墨鱼花）185g/包)");
        mode3.setImgURL("https://img.alicdn.com/imgextra/i1/1910146537/TB2y03MabSGJuJjSZFqXXXo2pXa_!!1910146537.jpg_430x430q90.jpg");
        listRecyDatas.add(mode3);

        RecycleListMode mode6=new RecycleListMode();
        mode6.setId("");
        mode6.setStyle(3);
        mode6.setPrice("");
        mode6.setName("超值优惠，首买送家电");
        mode6.setContent("接口和首付款计划开始无法互联网");
        listRecyDatas.add(mode6);

        RecycleListMode mode4=new RecycleListMode();
        mode4.setId("");
        mode4.setStyle(2);
        mode4.setPrice("¥ 19.90");
        mode4.setName("满66减30三合一海鲜");
        mode4.setContent("（虾仁+鱿鱼须+墨鱼花）185g/包)");
        mode4.setImgURL("https://img.alicdn.com/imgextra/i1/1910146537/TB2y03MabSGJuJjSZFqXXXo2pXa_!!1910146537.jpg_430x430q90.jpg");
        listRecyDatas.add(mode4);
        RecycleListMode mode5=new RecycleListMode();
        mode5.setId("");
        mode5.setStyle(2);
        mode5.setPrice("¥ 19.90");
        mode5.setName("满66减30三合一海鲜");
        mode5.setContent("（虾仁+鱿鱼须+墨鱼花）185g/包)");
        mode5.setImgURL("https://img.alicdn.com/imgextra/i1/1910146537/TB2y03MabSGJuJjSZFqXXXo2pXa_!!1910146537.jpg_430x430q90.jpg");
        listRecyDatas.add(mode5);

        for (int i = 0; i < 9; i++) {
            RecycleListMode mode7=new RecycleListMode();
            mode7.setId("");
            mode7.setStyle(4);
            mode7.setPrice("¥ 19.90");
            mode7.setName("满66减30三合一海鲜");
            mode7.setContent("（虾仁+鱿鱼须+墨鱼花）185g/包)");
            mode7.setImgURL("https://img.alicdn.com/imgextra/i1/1910146537/TB2y03MabSGJuJjSZFqXXXo2pXa_!!1910146537.jpg_430x430q90.jpg");
            listRecyDatas.add(mode7);
        }

        GridLayoutManager gridLayoutManager=new GridLayoutManager(RecycleViewMuliteActivity.this,6);
        final RecycleViewMulitAdapter recycleAdapter=new RecycleViewMulitAdapter(this,listRecyDatas);


        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {

                switch (recycleAdapter.getItemViewType(position)){
                    case 0:
                        spansize=6;
                        break;
                    case 1:
                        spansize=3;
                        break;
                    case 2:
                        spansize=3;
                        break;
                    case 3:
                        spansize=6;
                        break;
                    case 4:
                        spansize=2;


                }
                Log.i(TAG, "getSpanSize: "+spansize);
                return spansize;
            }
        });
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(recycleAdapter);
        recycleAdapter.setClickListener(new RecycleViewMulitAdapter.OnItemClickListener() {
            @Override
            public void setItemClickListener(int position) {

                String name = listRecyDatas.get(position).getName();
                Log.i(TAG, "setItemClickListener: "+name);
            }
        });



      /*  *//**
         * 第一种 RecycleView多布局的实现
         *//*
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
        getDatas();*/





    }

    private void   getDatas() {

        Log.e(TAG, "getData: 3" );
        OkHttpClient okHttpClient=new OkHttpClient();
        final Request request=new Request.Builder().url(URL_PATH).build();

        Call call=okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                Log.i(TAG, "onResponse: ");
                Log.i(TAG, "onResponse: ");
                String string = response.body().string();

                Gson gson=new Gson();

                Log.i(TAG, "---onResponse: "+string);

                //ModleDats modleDats = gson.fromJson(toJson, ModleDats.class);
                ModleDats modleDats = gson.fromJson(string, ModleDats.class);
                final List<ModleDats.DataBean.ItemsBean> items = modleDats.getData().getItems();
                Log.i(TAG, "onResponse: "+modleDats.getData().getItems().size());


                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        adapter.addRes(items);
                    }
                });


            }
        });



    }

    @Override
    public void setItemClickListener(int position) {

        Log.i(TAG, "setItemClickListener: "+position);
    }
}
