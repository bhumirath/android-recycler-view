package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    MyAdapter MyAdapter;
    int []arr={R.drawable.ant,R.drawable.bat,R.drawable.cat,R.drawable.dog,R.drawable.emu,
            R.drawable.fox,R.drawable.gnu};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        layoutManager=new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);
        MyAdapter = new MyAdapter(arr);

        recyclerView.setAdapter(MyAdapter);

        recyclerView.setHasFixedSize(true);
    }
}