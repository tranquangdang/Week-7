
package com.example.uteapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class FragmentOne extends Fragment {
    RecyclerAdapter_Profile adapter;
    RecyclerView mRecyclerView;
    ArrayList<RecycleView_Profile> arr;

    public static FragmentOne newInstance() {
        return new FragmentOne();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        mRecyclerView = view.findViewById(R.id.recycler_profile);
        arr = new ArrayList<RecycleView_Profile>();
        arr.add(new RecycleView_Profile(R.drawable.grey_test, "Thông báo", "Trường Đại học Sư Phạm Kĩ Thuật thông báo đến em Trần Quang Đăng về việc nộp chập học phí kì I niên khóa 2020-2021...", "yesterday 10:13 PM"));
        arr.add(new RecycleView_Profile(R.drawable.grey_test, "Thông báo", "Trường Đại học Sư Phạm Kĩ Thuật thông báo đến em Trần Quang Đăng về việc nộp chập học phí kì I niên khóa 2020-2021...", "yesterday 10:13 PM"));
        arr.add(new RecycleView_Profile(R.drawable.grey_test, "Thông báo", "Trường Đại học Sư Phạm Kĩ Thuật thông báo đến em Trần Quang Đăng về việc nộp chập học phí kì I niên khóa 2020-2021...", "yesterday 10:13 PM"));
        arr.add(new RecycleView_Profile(R.drawable.grey_test, "Thông báo", "Trường Đại học Sư Phạm Kĩ Thuật thông báo đến em Trần Quang Đăng về việc nộp chập học phí kì I niên khóa 2020-2021...", "yesterday 10:13 PM"));
        arr.add(new RecycleView_Profile(R.drawable.grey_test, "Thông báo", "Trường Đại học Sư Phạm Kĩ Thuật thông báo đến em Trần Quang Đăng về việc nộp chập học phí kì I niên khóa 2020-2021...", "yesterday 10:13 PM"));
        adapter = new RecyclerAdapter_Profile(getContext(),arr);
        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }


}