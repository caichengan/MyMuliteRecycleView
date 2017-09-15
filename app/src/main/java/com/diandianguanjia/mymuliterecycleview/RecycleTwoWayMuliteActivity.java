package com.diandianguanjia.mymuliterecycleview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class RecycleTwoWayMuliteActivity extends AppCompatActivity implements MyAdapter.OnItemClickListener {

    private String []titles={"asejhf","skdlrf","sekcjfwakejdre","sferbgerf","dfsrftg"};
    private static final String TAG = "RecycleViewMuliteActivi";

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


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


    }



    @Override
    public void setItemClickListener(int position) {

        Log.i(TAG, "setItemClickListener: "+position);
    }
}
