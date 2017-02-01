package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        ArrayList<ToDoPopulator> toDoPopulatorArrayList = new ArrayList<>();
        ToDoPopulatorImageAdapterClass toDoPopulatorImageAdapterClass = new ToDoPopulatorImageAdapterClass(this, 0, toDoPopulatorArrayList);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(toDoPopulatorImageAdapterClass);

        toDoPopulatorArrayList.add(new ToDoPopulator(R.drawable.acai_hdpi));
        toDoPopulatorArrayList.add(new ToDoPopulator(R.drawable.kanikapila_hdpi));
        toDoPopulatorArrayList.add(new ToDoPopulator(R.drawable.manapua_hdpi));
    }
}
