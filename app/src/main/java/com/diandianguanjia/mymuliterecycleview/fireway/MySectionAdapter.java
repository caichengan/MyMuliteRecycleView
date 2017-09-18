package com.diandianguanjia.mymuliterecycleview.fireway;

import android.widget.TextView;

import com.chad.library.adapter.base.BaseSectionQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.diandianguanjia.mymuliterecycleview.R;

import java.util.List;

/**
 * Created by an on 2017/9/16.
 */

public class MySectionAdapter extends BaseSectionQuickAdapter<RecycleSectMode,BaseViewHolder> {

    private  List<RecycleSectMode> data;
    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param layoutResId      The layout resource id of each item.
     * @param sectionHeadResId The section head layout id for each item
     * @param data             A new list is created out of this one to avoid mutable list
     */
    public MySectionAdapter(int layoutResId, int sectionHeadResId, List<RecycleSectMode> data) {
        super(layoutResId, sectionHeadResId, data);
        this.data=data;


    }

    @Override
    protected void convertHead(BaseViewHolder helper, RecycleSectMode item) {
        TextView view = helper.getView(R.id.tv_item2_title);
        view.setText(item.getTitle());

    }

    @Override
    protected void convert(BaseViewHolder helper, RecycleSectMode item) {



        TextView tv_shopping_name = helper.getView(R.id.tv_shopping_name);
        TextView tv_shopping_desc = helper.getView(R.id.tv_shopping_desc);
        TextView tv_shopping_new_money = helper.getView(R.id.tv_shopping_new_money);
        tv_shopping_name.setText(item.getName());
        tv_shopping_desc.setText(item.getContent());
        tv_shopping_new_money.setText(item.getPrice());

    }

    @Override

    protected int getDefItemViewType(int position) {

        return  data.get(position).isHeader ? SECTION_HEADER_VIEW : 0;

    }
}
