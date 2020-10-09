package com.example.uteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {
    ListView lv;
    ListViewBaseAdapter adapter;
    ArrayList<ListViewBean> arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        lv = (ListView) findViewById(R.id.listview);
        arr = new ArrayList<ListViewBean>();
        arr.add(new ListViewBean(R.drawable.user, "Tài khoản"));
        arr.add(new ListViewBean(R.drawable.grade, "Xem điểm"));
        arr.add(new ListViewBean(R.drawable.timetable, "Xem thời khóa biểu"));
        arr.add(new ListViewBean(R.drawable.notification, "Thông báo"));
        arr.add(new ListViewBean(R.drawable.clipboard, "Đăng kí môn học"));
        arr.add(new ListViewBean(R.drawable.document, "Đăng kí giấy xác nhận"));
        adapter = new ListViewBaseAdapter(arr,this);
        lv.setAdapter(adapter);
    }
}