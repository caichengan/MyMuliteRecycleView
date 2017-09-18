package com.diandianguanjia.mymuliterecycleview.threeway;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.diandianguanjia.mymuliterecycleview.R;
import com.diandianguanjia.mymuliterecycleview.oneway.RecycleListMode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by an on 2017/9/15.
 */

public class RecycleThreeWayMuliteActivity extends AppCompatActivity{

    ImageView recyclerViewLin;
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
        recyclerViewLin=(ImageView) findViewById(R.id.recycleViewPager);

        recyclerViewList=(RecyclerView) findViewById(R.id.recycleViewList);
        tvGrid=(TextView) findViewById(R.id.tvGrid);
        recyclerViewLinGrid=(RecyclerView) findViewById(R.id.recycleViewGrid);

        dataLists=new ArrayList<>();
        dataGrids=new ArrayList<>();


            RecycleListMode mode=new RecycleListMode();
            mode.setId("");
            mode.setName("满66减30三合一海鲜");
            mode.setContent("（虾仁+鱿鱼须+墨鱼花）185g/包)");
            mode.setPrice("¥ 19.90");
            mode.setImgURL("https://img.alicdn.com/imgextra/i1/1910146537/TB2y03MabSGJuJjSZFqXXXo2pXa_!!1910146537.jpg_430x430q90.jpg");
        dataLists.add(mode);

        RecycleListMode mode1=new RecycleListMode();
        mode1.setId("");
        mode1.setName("【天猫超市】泸州老窖奥普蓝");
        mode1.setContent("原浆啤酒320ml*6罐(蓝罐) 六连包");
        mode1.setPrice("¥ 24.90");
        mode1.setImgURL("https://img.alicdn.com/imgextra/i3/725677994/TB1franSVXXXXX9XFXXXXXXXXXX_!!0-item_pic.jpg_430x430q90.jpg");

        dataLists.add(mode1);
        RecycleListMode mode2=new RecycleListMode();
        mode2.setId("");
        mode2.setName("满66减30三合一海鲜");
        mode2.setContent("（虾仁+鱿鱼须+墨鱼花）185g/包)");
        mode2.setImgURL("https://img.alicdn.com/imgextra/i1/1910146537/TB2y03MabSGJuJjSZFqXXXo2pXa_!!1910146537.jpg_430x430q90.jpg");

        dataLists.add(mode2);
        RecycleListMode mode3=new RecycleListMode();
        mode3.setId("");
        mode3.setName("满66减30三合一海鲜");
        mode3.setContent("（虾仁+鱿鱼须+墨鱼花）185g/包)");
        mode3.setImgURL("https://img.alicdn.com/imgextra/i1/1910146537/TB2y03MabSGJuJjSZFqXXXo2pXa_!!1910146537.jpg_430x430q90.jpg");

        dataLists.add(mode3);


        for (int i = 0; i < 15; i++) {

           /* RecycleListMode mode4=new RecycleListMode();
            mode4.setId(i+"");
            mode4.setName("李四");
            mode4.setName("很杀人蜂空间谨慎");
            mode4.setContent("烧热后方可温热后付款计划热客户反馈热火");
            mode4.setImgURL("");*/

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
