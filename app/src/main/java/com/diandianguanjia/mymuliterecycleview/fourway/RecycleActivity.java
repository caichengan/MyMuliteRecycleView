package com.diandianguanjia.mymuliterecycleview.fourway;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.diandianguanjia.mymuliterecycleview.R;
import com.diandianguanjia.mymuliterecycleview.oneway.RecycleListMode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by an on 2017/9/16.
 */

public class RecycleActivity extends AppCompatActivity{

    private List<RecycleListMode> listRecyDatas;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_recycle_view_mulite);
        recyclerView = (RecyclerView) findViewById(R.id.recycleViewlist);

        initDatas();

    }

    private void initDatas() {
        /**
         * 模拟数据实现商城  RecycleView  的多布局实现
         */
        listRecyDatas = new ArrayList<>();

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


        RecycleListMode mode4=new RecycleListMode();
        mode4.setId("");
        mode4.setStyle(2);
        mode4.setPrice("¥ 19.90");
        mode4.setName("满66减30三合一海鲜");
        mode4.setContent("（虾仁+鱿鱼须+墨鱼花）185g/包)");
        mode4.setImgURL("https://img.alicdn.com/imgextra/i1/1910146537/TB2y03MabSGJuJjSZFqXXXo2pXa_!!1910146537.jpg_430x430q90.jpg");
        listRecyDatas.add(mode4);

        for (int i = 0; i < 10; i++) {
            RecycleListMode mode5=new RecycleListMode();
            mode5.setId("");
            mode5.setStyle(2);
            mode5.setPrice("¥ 19.90");
            mode5.setName("满66减30三合一海鲜");
            mode5.setContent("（虾仁+鱿鱼须+墨鱼花）185g/包)");
            mode5.setImgURL("https://img.alicdn.com/imgextra/i1/1910146537/TB2y03MabSGJuJjSZFqXXXo2pXa_!!1910146537.jpg_430x430q90.jpg");
            listRecyDatas.add(mode5);
        }


        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);

        final QBaseRecycleAdapter adapter=new QBaseRecycleAdapter(listRecyDatas);

        recyclerView.setAdapter(adapter);


    }
}
