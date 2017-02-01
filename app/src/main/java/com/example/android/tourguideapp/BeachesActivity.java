package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BeachesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beaches);

        ArrayList<ToDoPopulator> toDoPopulatorArrayList = new ArrayList<>();
        ToDoPopulatorAdapterClass toDoPopulatorAdapterClass = new ToDoPopulatorAdapterClass(this, 0, toDoPopulatorArrayList);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(toDoPopulatorAdapterClass);

        toDoPopulatorArrayList.add(new ToDoPopulator(getString(R.string.kaimanas)));
        toDoPopulatorArrayList.add(new ToDoPopulator(getString(R.string.magicisland)));
        toDoPopulatorArrayList.add(new ToDoPopulator(getString(R.string.bellows)));
        toDoPopulatorArrayList.add(new ToDoPopulator(getString(R.string.makapuu)));
        toDoPopulatorArrayList.add(new ToDoPopulator(getString(R.string.yokohama)));
    }
}
