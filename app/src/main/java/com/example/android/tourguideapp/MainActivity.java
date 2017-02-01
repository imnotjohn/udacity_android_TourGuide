package com.example.android.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView beaches= (TextView) findViewById(R.id.beachesActivity);

        // Set a click listener on that View
        beaches.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent beachesIntent = new Intent(MainActivity.this, BeachesActivity.class);

                // Start the new activity
                startActivity(beachesIntent);
            }
        });

        // Find the View that shows the family category
        TextView food = (TextView) findViewById(R.id.foodActivity);

        // Set a click listener on that View
        food.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent foodIntent = new Intent(MainActivity.this, FoodActivity.class);

                // Start the new activity
                startActivity(foodIntent);
            }
        });

        // Find the View that shows the colors category
        TextView hikes = (TextView) findViewById(R.id.hikesActivity);

        // Set a click listener on that View
        hikes.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent hikesIntent = new Intent(MainActivity.this, HikesActivity.class);

                // Start the new activity
                startActivity(hikesIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView islands = (TextView) findViewById(R.id.islandsActivity);

        // Set a click listener on that View
        islands.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent islandsIntent = new Intent(MainActivity.this, IslandsActivity.class);

                // Start the new activity
                startActivity(islandsIntent);
            }
        });
    }
}
