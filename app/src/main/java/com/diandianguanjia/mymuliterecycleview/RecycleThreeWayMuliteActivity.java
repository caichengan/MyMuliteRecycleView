package com.diandianguanjia.mymuliterecycleview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by an on 2017/9/15.
 */

public class RecycleThreeWayMuliteActivity extends AppCompatActivity{

    ViewPager recyclerViewLin;
            TextView tvList;
    RecyclerView recyclerViewList;
            TextView tvGrid;
    RecyclerView recyclerViewLinGrid;

    private List<RecycleListMode> dataLists;
    private List<RecycleListMode> dataGrids;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
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

    }
}
