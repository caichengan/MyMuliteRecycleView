package com.diandianguanjia.mymuliterecycleview.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.diandianguanjia.mymuliterecycleview.R;
import com.diandianguanjia.mymuliterecycleview.fireway.RecycleSectionActivity;
import com.diandianguanjia.mymuliterecycleview.fourway.RecycleActivity;
import com.diandianguanjia.mymuliterecycleview.oneway.RecycleViewMuliteActivity;
import com.diandianguanjia.mymuliterecycleview.threeway.RecycleThreeWayMuliteActivity;
import com.diandianguanjia.mymuliterecycleview.twoway.RecycleTwoWayMuliteActivity;

/**
 * Created by an on 2017/9/15.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

       TextView recycle01= (TextView) findViewById(R.id.recycle01);
       TextView recycle02= (TextView) findViewById(R.id.recycle02);
       TextView recycle03= (TextView) findViewById(R.id.recycle03);
       TextView recycle04= (TextView) findViewById(R.id.recycle04);
       TextView recycle05= (TextView) findViewById(R.id.recycle05);
        recycle01.setOnClickListener(this);
        recycle02.setOnClickListener(this);
        recycle03.setOnClickListener(this);
        recycle04.setOnClickListener(this);
        recycle05.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.recycle01:
                startActivity(new Intent(this,RecycleViewMuliteActivity.class));
                break;
            case R.id.recycle02:
                startActivity(new Intent(this,RecycleTwoWayMuliteActivity.class));
                break;
            case R.id.recycle03:
                startActivity(new Intent(this,RecycleThreeWayMuliteActivity.class));
                break;
            case R.id.recycle04:
                startActivity(new Intent(this,RecycleActivity.class));
                break;
            case R.id.recycle05:

                startActivity(new Intent(this,RecycleSectionActivity.class));
                break;
        }

    }
}
