package com.diandianguanjia.mymuliterecycleview;

import android.graphics.BitmapFactory;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by an on 2017/9/16.
 */

public class QBaseRecycleAdapter extends BaseMultiItemQuickAdapter<RecycleListMode,BaseViewHolder> {
    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data A new list is created out of this one to avoid mutable list
     */
    private RecyclerView mRecycle;
    public QBaseRecycleAdapter(List<RecycleListMode> data) {
        super(data);
        addItemType(RecycleListMode.TEXT,R.layout.item_list_recycle);
        addItemType(RecycleListMode.IMG,R.layout.item_grid_recycle);
    }

    @Override
    protected void convert(BaseViewHolder helper, RecycleListMode item) {

        switch (item.getItemType()){
            case RecycleListMode.TEXT:

                helper.setText(R.id.tv_shopping_name,item.getName());
                helper.setText(R.id.tv_shopping_desc,item.getContent());
                helper.setText(R.id.tv_shopping_new_money,item.getPrice());
                //helper.setImageBitmap(R.id.img_shopping_img, BitmapFactory.decodeFile(item.getImgURL()));

                break;
            case RecycleListMode.IMG:
                helper.setText(R.id.tv_shopping_name,item.getName());
                helper.setText(R.id.tv_shopping_desc,item.getContent());
                helper.setText(R.id.tv_shopping_new_money,item.getPrice());
                //helper.setImageBitmap(R.id.img_shopping_img, BitmapFactory.decodeFile(item.getImgURL()));
                break;
        }
    }



    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.mRecycle=recyclerView;


    }
}
