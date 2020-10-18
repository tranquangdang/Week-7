
package com.example.uteapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class FragmentOne extends Fragment {
    ListView lv;
    ListViewBaseAdapter_Profile adapter;
    ArrayList<ListViewBean_Profile> arr;

    public static FragmentOne newInstance() {
        return new FragmentOne();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        lv = (ListView) view.findViewById(R.id.listview_profile);
        arr = new ArrayList<ListViewBean_Profile>();
        arr.add(new ListViewBean_Profile(R.drawable.grey_test, "Thông báo", "Trường Đại học Sư Phạm Kĩ Thuật thông báo đến em Trần Quang Đăng về việc nộp chập học phí kì I niên khóa 2020-2021...", "yesterday 10:13 PM"));
        arr.add(new ListViewBean_Profile(R.drawable.grey_test, "Thông báo", "Trường Đại học Sư Phạm Kĩ Thuật thông báo đến em Trần Quang Đăng về việc nộp chập học phí kì I niên khóa 2020-2021...", "yesterday 10:13 PM"));
        arr.add(new ListViewBean_Profile(R.drawable.grey_test, "Thông báo", "Trường Đại học Sư Phạm Kĩ Thuật thông báo đến em Trần Quang Đăng về việc nộp chập học phí kì I niên khóa 2020-2021...", "yesterday 10:13 PM"));
        arr.add(new ListViewBean_Profile(R.drawable.grey_test, "Thông báo", "Trường Đại học Sư Phạm Kĩ Thuật thông báo đến em Trần Quang Đăng về việc nộp chập học phí kì I niên khóa 2020-2021...", "yesterday 10:13 PM"));
        arr.add(new ListViewBean_Profile(R.drawable.grey_test, "Thông báo", "Trường Đại học Sư Phạm Kĩ Thuật thông báo đến em Trần Quang Đăng về việc nộp chập học phí kì I niên khóa 2020-2021...", "yesterday 10:13 PM"));
        adapter = new ListViewBaseAdapter_Profile(arr,getContext());
        lv.setAdapter(adapter);
        return view;
    }
}