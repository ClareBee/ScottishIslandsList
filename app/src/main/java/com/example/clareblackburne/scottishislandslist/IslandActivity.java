package com.example.clareblackburne.scottishislandslist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class IslandActivity extends AppCompatActivity {

    TextView islandText;
    TextView populationText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_island);

        Bundle extras = getIntent().getExtras();
        String name = extras.getString("name");
        String population = extras.getString("population");
        islandText = (TextView)findViewById(R.id.name_view);
        islandText.setText(name);
        populationText = (TextView)findViewById(R.id.population_view);
        populationText.setText(population);
    }
}
