package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class IslandsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_islands);

        ArrayList<ToDoPopulator> toDoPopulatorArrayList = new ArrayList<>();
        ToDoPopulatorAdapterClass toDoPopulatorAdapterClass = new ToDoPopulatorAdapterClass(this, 0, toDoPopulatorArrayList);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(toDoPopulatorAdapterClass);

        toDoPopulatorArrayList.add(new ToDoPopulator(getString(R.string.bigisland)));
        toDoPopulatorArrayList.add(new ToDoPopulator(getString(R.string.maui)));
        toDoPopulatorArrayList.add(new ToDoPopulator(getString(R.string.kauai)));
        toDoPopulatorArrayList.add(new ToDoPopulator(getString(R.string.lanai)));
        toDoPopulatorArrayList.add(new ToDoPopulator(getString(R.string.molokai)));
        toDoPopulatorArrayList.add(new ToDoPopulator(getString(R.string.oahu)));
        toDoPopulatorArrayList.add(new ToDoPopulator(getString(R.string.kahoolawe)));
        toDoPopulatorArrayList.add(new ToDoPopulator(getString(R.string.niihau)));
    }
}
