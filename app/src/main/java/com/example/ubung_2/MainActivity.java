package com.example.ubung_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        ItemData [] items = {
                new ItemData("Fisrt",R.drawable.icon1),
                new ItemData("Second",R.drawable.icon2),
                new ItemData("Third", R.drawable.icon3)
        };

        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(manager);

        MyAdapter myAdapter = new MyAdapter(items);
        recyclerView.setAdapter(myAdapter);


    }
}
