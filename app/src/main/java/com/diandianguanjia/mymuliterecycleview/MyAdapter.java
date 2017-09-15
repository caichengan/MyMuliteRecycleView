package com.diandianguanjia.mymuliterecycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static android.R.attr.cacheColorHint;
import static android.R.attr.data;

/**
 * Created by an on 2017/9/15.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> implements View.OnClickListener {


    private List<ModleDats.DataBean.ItemsBean> data;
    private LayoutInflater inflate;
    private RecyclerView mRecycleView;
    private Context mContext;

    private OnItemClickListener clickListener;

    public MyAdapter(Context context,List<ModleDats.DataBean.ItemsBean> listDatas){
        this.mContext=context;
        this.data=listDatas;
        inflate=LayoutInflater.from(context);

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView=null;
        switch (viewType){
            case 1:
                itemView=inflate.inflate(R.layout.item_01,parent,false);
                break;
            case 2:
                itemView=inflate.inflate(R.layout.item_02,parent,false);
                break;
            case 8:
                itemView=inflate.inflate(R.layout.item_03,parent,false);
                break;
        }
        //设置监听
        itemView.setOnClickListener(this);
        return new ViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        switch (getItemViewType(position)){
            case 1:
                ImageView imageView = (ImageView) holder.getView(R.id.iv_item1);
                TextView textView = (TextView) holder.getView(R.id.tv_item1);
                textView.setText(data.get(position).getTitle());
                String picPath = data.get(position).getCover();
                Glide.with(mContext).load(picPath).into(imageView);
                break;

            case 2:
                TextView item2Title = (TextView) holder.getView(R.id.tv_item2_title);
                TextView item2Content = (TextView) holder.getView(R.id.tv_item2_content);
                item2Title.setText(data.get(position).getTitle());
                item2Content.setText(data.get(position).getContent());
                break;

            case 8:
                TextView item3Title = (TextView) holder.getView(R.id.tv_item3_title);
                TextView item3Content = (TextView) holder.getView(R.id.tv_item3_content);
                item3Title.setText(data.get(position).getTitle());
                item3Content.setText(data.get(position).getContent());
                break;
        }


    }

    @Override
    public int getItemCount() {
        return data!=null?data.size():0;
    }

    @Override
    public int getItemViewType(int position) {
        return data.get(position).getShow_type();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);

        mRecycleView=recyclerView;
    }

    public void addRes(List<ModleDats.DataBean.ItemsBean> data){
        if (data!=null){
            this.data=data;
            notifyDataSetChanged();
        }

    }

    public void addLoadMore(List<ModleDats.DataBean.ItemsBean> dataload){
        if (dataload.size()>0){
            data.addAll(dataload);
            notifyDataSetChanged();
        }

    }

    public interface OnItemClickListener{
        void setItemClickListener(int position);
    }

    public void setClickListener(OnItemClickListener clickListener){
        this.clickListener=clickListener;

    }

    @Override
    public void onClick(View v) {
        int childAdapterPosition=mRecycleView.getChildAdapterPosition(v);
        if (clickListener!=null){
            clickListener.setItemClickListener(childAdapterPosition);
        }

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private Map<Integer,View> mCachView;
        public ViewHolder(View itemView) {
            super(itemView);

            mCachView=new HashMap<>();

        }

        public View getView(int resId){
            View view;
            if (mCachView.containsKey(resId)){
                view=mCachView.get(resId);
            }else{
                view=itemView.findViewById(resId);
                mCachView.put(resId,view);
            }

            return view;

        }
    }
}
