package com.example.uteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

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
        arr.add(new ListViewBean(R.drawable.user, "Tài khoản", "Thông báo, thông tin cá nhân,..."));
        arr.add(new ListViewBean(R.drawable.grade, "Xem điểm", "Điểm học tập và rèn luyện."));
        arr.add(new ListViewBean(R.drawable.timetable, "Xem thời khóa biểu", "Thời khóa biểu kì I 2020 - 2021."));
        arr.add(new ListViewBean(R.drawable.fee, "Tình trạng học phí", "Xem học phí và các khoản thu khác."));
        arr.add(new ListViewBean(R.drawable.clipboard, "Đăng kí môn học", "Đã đăng kí 21 chỉ, mã số đăng kí..."));
        arr.add(new ListViewBean(R.drawable.document, "Đăng kí giấy xác nhận", "Có 2 giấy xác nhận đang được xử lí..."));
        adapter = new ListViewBaseAdapter(arr,this);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0) {
                    Intent intent = new Intent(ListViewActivity.this, TabProfile.class);
                    startActivity(intent);
                }
            }
        });
    }
}