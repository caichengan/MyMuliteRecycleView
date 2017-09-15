package com.diandianguanjia.mymuliterecycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by an on 2017/9/15.
 */

class RecycleListAdapter extends RecyclerView.Adapter<RecycleListAdapter.ViewHolder>{
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

        holder.tvRecycle.setText(dataLists.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return dataLists.size()==0?0:dataLists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvRecycle;

        public ViewHolder(View itemView) {
            super(itemView);
            tvRecycle= (TextView) itemView.findViewById(R.id.tv_recycle_list);

        }
    }
}
