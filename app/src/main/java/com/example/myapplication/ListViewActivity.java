package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<String> names=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView =findViewById(R.id.listView);

        names.add("John");
        names.add("Joe");
        names.add("Avicli");
        names.add("Rich Chigga");

        ArrayAdapter<String> nameAdapter =new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,names);
        listView.setAdapter(nameAdapter);
    }


}
