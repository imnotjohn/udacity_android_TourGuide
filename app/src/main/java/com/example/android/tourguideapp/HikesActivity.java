package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HikesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hikes);

        ArrayList<ToDoPopulator> toDoPopulatorArrayList = new ArrayList<>();
        ToDoPopulatorAdapterClass toDoPopulatorAdapterClass = new ToDoPopulatorAdapterClass(this, 0, toDoPopulatorArrayList);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(toDoPopulatorAdapterClass);

        toDoPopulatorArrayList.add(new ToDoPopulator(getString(R.string.hawaiiloa)));
        toDoPopulatorArrayList.add(new ToDoPopulator(getString(R.string.kokoHead)));
        toDoPopulatorArrayList.add(new ToDoPopulator(getString(R.string.kuliouou)));
        toDoPopulatorArrayList.add(new ToDoPopulator(getString(R.string.makapuuLightHouse)));
        toDoPopulatorArrayList.add(new ToDoPopulator(getString(R.string.pillboxes)));
    }
}
