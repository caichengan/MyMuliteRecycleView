package com.diandianguanjia.mymuliterecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class RecycleViewMuliteActivity extends AppCompatActivity implements MyAdapter.OnItemClickListener {

    private String []titles={"asejhf","skdlrf","sekcjfwakejdre","sferbgerf","dfsrftg"};
    private static final String TAG = "RecycleViewMuliteActivi";
    List<ModleDats.DataBean.ItemsBean>  data=new ArrayList<>();
    private MyAdapter adapter;

    public static final String URL_PATH="http://dxy.com/app/i/feed/index/list?hardName=Google%20Nexus%205%20-%205.1.0%20-%20API%2022%20-%201080x1920&u=&bv=2015&ac=d5424fa6-adff-4b0a-8917-4264daf4a348&vc=5.1.9&vs=5.1&mc=00000000600ba4e6ffffffff99d603a9";
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


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
        getDatas();





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
