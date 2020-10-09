package com.example.uteapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.uteapp.R;

import java.util.ArrayList;
import java.util.List;

public class ListViewBaseAdapter extends BaseAdapter {
    public ArrayList<ListViewBean> arrayListListener;
    private List<ListViewBean> mListenerList;
    Context mContext;

    public ListViewBaseAdapter(List<ListViewBean> mListenerList, Context mContext) {
        this.mContext = mContext;
        this.mListenerList = mListenerList;
        this.arrayListListener = new ArrayList<ListViewBean>();
        this.arrayListListener.addAll(mListenerList);
    }

    public class ViewHolder {
        ImageView mItemPic;
        TextView mLangName;
    }

    @Override
    public int getCount() {
        return mListenerList.size();
    }

    @Override
    public Object getItem(int position) {
        return mListenerList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        final  ViewHolder holder;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.layout_lv_adapter, null);
            holder = new ViewHolder();
            holder.mItemPic = view.findViewById(R.id.img);
            holder.mLangName = view.findViewById(R.id.name);

            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        } try {
            int image = mListenerList.get(position).getImage();
            holder.mItemPic.setImageResource(image);
            holder.mLangName.setText(mListenerList.get(position).getLangName());
        } catch (Exception ex) {

        }
        return view;
    }
}
