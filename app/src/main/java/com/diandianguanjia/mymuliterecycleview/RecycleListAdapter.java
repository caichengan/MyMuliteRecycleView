package com.diandianguanjia.mymuliterecycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by an on 2017/9/15.
 */

class RecycleListAdapter extends RecyclerView.Adapter<RecycleListAdapter.ViewHolder> implements View.OnClickListener {
    private Context context;
    private List<RecycleListMode> dataLists;

    public RecycleListAdapter(Context mCOntext, List<RecycleListMode> dataLists) {
        this.context=mCOntext;
        this.dataLists=dataLists;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View inflate = View.inflate(context, R.layout.item_list_recycle, null);

        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

       // holder.img_shopping_img.setText(dataLists.get(position).getTitle());
        Glide.with(context).load(dataLists.get(position).getImgURL()).into(holder.img_shopping_img);
        holder.tv_shopping_name.setText(dataLists.get(position).getName());
        holder.tv_shopping_desc.setText(dataLists.get(position).getContent());
        holder.tv_shopping_new_money.setText(dataLists.get(position).getPrice());
        holder.item_shopping_order.setOnClickListener(this);

    }

    @Override
    public int getItemCount() {
        return dataLists.size()==0?0:dataLists.size();
    }

    @Override
    public void onClick(View v) {

    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView img_shopping_img;
        private TextView tv_shopping_name;
        private TextView tv_shopping_desc;
        private TextView tv_shopping_new_money;
        private Button item_shopping_order;


        public ViewHolder(View itemView) {
            super(itemView);
            img_shopping_img= (ImageView) itemView.findViewById(R.id.img_shopping_img);
            tv_shopping_name= (TextView) itemView.findViewById(R.id.tv_shopping_name);
            tv_shopping_desc= (TextView) itemView.findViewById(R.id.tv_shopping_desc);
            tv_shopping_new_money= (TextView) itemView.findViewById(R.id.tv_shopping_new_money);
            item_shopping_order= (Button) itemView.findViewById(R.id.item_shopping_order);

        }
    }
}
