package com.diandianguanjia.mymuliterecycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by an on 2017/9/16.
 */

public class RecycleViewMulitAdapter extends RecyclerView.Adapter<RecycleViewMulitAdapter.ViewHolder> implements View.OnClickListener
{

    Context mContext;
    List<RecycleListMode> listRecyDatas;
    LayoutInflater inflate;
    RecyclerView mRecycleView;
    private OnItemClickListener clickListener;
    public RecycleViewMulitAdapter(Context mContext, List<RecycleListMode> listRecyDatas) {

        this.mContext=mContext;
        this.listRecyDatas=listRecyDatas;
        inflate= LayoutInflater.from(mContext);
    }


    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);

        mRecycleView=recyclerView;
    }

    public void addRes(List<RecycleListMode> data){
        if (data!=null){
            this.listRecyDatas=data;
            notifyDataSetChanged();
        }

    }

    public void addLoadMore(List<RecycleListMode> dataload){
        if (dataload.size()>0){
            listRecyDatas.addAll(dataload);
            notifyDataSetChanged();
        }

    }

    public interface OnItemClickListener{
        void setItemClickListener(int position);
    }

    public void setClickListener(RecycleViewMulitAdapter.OnItemClickListener clickListener){
        this.clickListener=clickListener;

    }

    private static final String TAG = "RecycleViewMulitAdapter";
    @Override
    public void onClick(View v) {
        int childAdapterPosition=mRecycleView.getChildAdapterPosition(v);
        if (clickListener!=null){
            clickListener.setItemClickListener(childAdapterPosition);

            Log.i(TAG, "onClick: "+childAdapterPosition);
        }

    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView=null;
        switch (viewType){
            case 0:

                itemView=inflate.inflate(R.layout.item_01,parent,false);
                break;
            case 1:

                itemView=inflate.inflate(R.layout.item_list_recycle,parent,false);
                break;
            case 2:
                itemView=inflate.inflate(R.layout.item_grid_recycle,parent,false);
                break;
            case 3:
                itemView=inflate.inflate(R.layout.item_recycle_02,parent,false);
        }

        ViewHolder holder=new ViewHolder(itemView);

        itemView.setOnClickListener(this);

        return holder;
    }

    @Override
    public int getItemViewType(int position) {
        return listRecyDatas.get(position).getStyle();
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        switch (getItemViewType(position)){
            case 0:
                ImageView imgitem= (ImageView) holder.getView(R.id.iv_item1);
                Glide.with(mContext).load(listRecyDatas.get(position).getImgURL()).into(imgitem);

                break;
            case 1:

               TextView tvName= (TextView) holder.getView(R.id.tv_shopping_name);
               TextView tvDesc= (TextView) holder.getView(R.id.tv_shopping_desc);
               TextView tvPrice= (TextView) holder.getView(R.id.tv_shopping_new_money);
               ImageView imgOrder= (ImageView) holder.getView(R.id.img_shopping_img);

                tvName.setText(listRecyDatas.get(position).getName());
                tvDesc.setText(listRecyDatas.get(position).getContent());
                tvPrice.setText(listRecyDatas.get(position).getPrice());
                Glide.with(mContext).load(listRecyDatas.get(position).getImgURL()).into(imgOrder);


                break;
            case 2:

                TextView tvName2= (TextView) holder.getView(R.id.tv_shopping_name);
                TextView tvDesc2= (TextView) holder.getView(R.id.tv_shopping_desc);
                TextView tvPrice2= (TextView) holder.getView(R.id.tv_shopping_new_money);
                ImageView imgOrder2= (ImageView) holder.getView(R.id.img_shopping_img);

                tvName2.setText(listRecyDatas.get(position).getName());
                tvDesc2.setText(listRecyDatas.get(position).getContent());
                tvPrice2.setText(listRecyDatas.get(position).getPrice());
                Glide.with(mContext).load(listRecyDatas.get(position).getImgURL()).into(imgOrder2);

                break;

            case 3:
              TextView textView= (TextView) holder.getView(R.id.tv_item2_text);
              TextView textView1= (TextView) holder.getView(R.id.tv_item2_text1);

                textView.setText(listRecyDatas.get(position).getName());
                textView1.setText(listRecyDatas.get(position).getContent());

        }

    }

    @Override
    public int getItemCount() {
        return listRecyDatas.size()>0? listRecyDatas.size():0;
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
