package com.diandianguanjia.mymuliterecycleview.twoway;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.diandianguanjia.mymuliterecycleview.R;

/**
 * Created by an on 2017/9/15.
 */

class RecycleViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private LayoutInflater mLayoutInflater;
    private Context mContext;
    private String []titles;
    //建立枚举类
    private enum ITEM_TYPE{
        ITEM1,
        ITEM2
    }

    public RecycleViewAdapter(Context conext, String[] titles){
        this.mContext=conext;
        this.titles=titles;

        mLayoutInflater=LayoutInflater.from(conext);
    }

    private static final String TAG = "RecycleViewAdapter";

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //加载itemView的时候根据不同的item加载不同的布局

        Log.i(TAG, "viewType: "+viewType);
        Log.i(TAG, "onCreateViewHolder: "+ITEM_TYPE.ITEM1.ordinal());
        if (viewType==ITEM_TYPE.ITEM1.ordinal()){
            return new Item1ViewHolder(mLayoutInflater.inflate(R.layout.item_recycle_01,parent,false));
        }else{
            return new Item2ViewHolder(mLayoutInflater.inflate(R.layout.item_recycle_02,parent,false));
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        if (holder instanceof Item1ViewHolder){
            ((Item1ViewHolder) holder).tv01.setText(titles[position]);
            //图片 TODO

        }else if (holder instanceof Item2ViewHolder){
            ((Item2ViewHolder) holder).tv02.setText(titles[position]);
        }

    }

    @Override
    public int getItemCount() {
        return titles==null?0:titles.length;

    }

    @Override
    public int getItemViewType(int position) {


        return position%2==0?ITEM_TYPE.ITEM1.ordinal():ITEM_TYPE.ITEM2.ordinal();
    }

    public static class Item1ViewHolder extends RecyclerView.ViewHolder{

       private TextView tv01;
       private ImageView img01;
       public Item1ViewHolder(View itemView) {
           super(itemView);

           tv01= (TextView) itemView.findViewById(R.id.tv_item1_text);
           img01= (ImageView) itemView.findViewById(R.id.iv_item1_pic);
       }
   }

    public static class Item2ViewHolder extends RecyclerView.ViewHolder{

        private TextView tv02;
        public Item2ViewHolder(View itemView) {
            super(itemView);

            tv02= (TextView) itemView.findViewById(R.id.tv_item2_text);
        }
    }
}
