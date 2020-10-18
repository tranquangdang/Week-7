package com.example.uteapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

public class ListViewBaseAdapter_Profile extends BaseAdapter {
    public ArrayList<ListViewBean_Profile> arrayListListener;
    private List<ListViewBean_Profile> mListenerList;
    Context mContext;

    public ListViewBaseAdapter_Profile(List<ListViewBean_Profile> mListenerList, Context mContext) {
        this.mContext = mContext;
        this.mListenerList = mListenerList;
        this.arrayListListener = new ArrayList<ListViewBean_Profile>();
        this.arrayListListener.addAll(mListenerList);
    }

    public class ViewHolder {
        ImageView mItemPic;
        TextView mHeader, mContent, mTime;
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
            view = LayoutInflater.from(mContext).inflate(R.layout.layout_lv_adapter_profile, null);
            holder = new ViewHolder();
            holder.mItemPic = view.findViewById(R.id.profile_img_lv);
            holder.mHeader = view.findViewById(R.id.profile_header_lv);
            holder.mContent = view.findViewById(R.id.profile_content_lv);
            holder.mTime = view.findViewById(R.id.profile_time_lv);

            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        } try {
            int image = mListenerList.get(position).getImage();
            holder.mItemPic.setImageResource(image);
            holder.mHeader.setText(mListenerList.get(position).getHeader());
            holder.mContent.setText(mListenerList.get(position).getContent());
            holder.mTime.setText(mListenerList.get(position).getTime());
        } catch (Exception ex) {

        }
        return view;
    }
}
