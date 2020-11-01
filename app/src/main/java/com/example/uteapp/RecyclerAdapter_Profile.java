package com.example.uteapp;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ActionMode;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerAdapter_Profile extends RecyclerView.Adapter<RecyclerAdapter_Profile.ViewHolder> {
    public Context mContext;
    private ArrayList<RecycleView_Profile> mMail;
    private boolean multiSelect = false;
    private ArrayList<RecycleView_Profile> selectedItems = new ArrayList<RecycleView_Profile>();

    public RecyclerAdapter_Profile(Context mContext, ArrayList<RecycleView_Profile> mMail) {
        this.mContext = mContext;
        this.mMail = mMail;
    }

    private ActionMode.Callback actionModeCallbacks = new ActionMode.Callback() {
        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            multiSelect = true;
            menu.add("Delete");
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            for (RecycleView_Profile mMailItem : selectedItems) {
                mMail.remove(mMailItem);
            }
            mode.finish();
            return true;
        }

        @Override
        public void onDestroyActionMode(ActionMode mode) {
            multiSelect = false;
            selectedItems.clear();
            notifyDataSetChanged();
        }
    };


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_adapter_profile, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.update(mMail.get(position));
        RecycleView_Profile recycleView_profile = mMail.get(position);
        Glide.with(mContext)
                .load(recycleView_profile.getImage())
                .into(holder.mImage);
        holder.mHeader.setText(recycleView_profile.getHeader());
        holder.mContent.setText(recycleView_profile.getContent());
        holder.mTime.setText(recycleView_profile.getTime());
    }

    @Override
    public int getItemCount() {
        return mMail.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private FrameLayout frameLayout;
        private ImageView mImage;
        private TextView mHeader, mContent, mTime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            frameLayout = itemView.findViewById(R.id.frame);
            mImage = itemView.findViewById(R.id.profile_img_lv);
            mHeader = itemView.findViewById(R.id.profile_header_lv);
            mContent = itemView.findViewById(R.id.profile_content_lv);
            mTime = itemView.findViewById(R.id.profile_time_lv);
        }

        void selectItem(RecycleView_Profile item) {
            if (multiSelect) {
                if (selectedItems.contains(item)) {
                    selectedItems.remove(item);
                    frameLayout.setBackgroundColor(Color.WHITE);
                } else {
                    selectedItems.add(item);
                    frameLayout.setBackgroundColor(Color.LTGRAY);
                }
            }
        }

        void update(final RecycleView_Profile value) {
            mImage.setImageResource(0);
            mHeader.setText("");
            mContent.setText("");
            mTime.setText("");
            if (selectedItems.contains(value)) {
                frameLayout.setBackgroundColor(Color.LTGRAY);
            } else {
                frameLayout.setBackgroundColor(Color.WHITE);
            }
            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    ((AppCompatActivity)view.getContext()).startSupportActionMode(actionModeCallbacks);
                    selectItem(value);
                    return true;
                }
            });
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    selectItem(value);
                }
            });
        }
    }
}
