package com.example.clareblackburne.scottishislandslist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class FavouriteIslandsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.islands_list);
        FavouriteIslands favIslands = new FavouriteIslands();
        ArrayList<Island> islandList = favIslands.getList();

        FavouriteIslandsAdapter islandAdapter = new FavouriteIslandsAdapter(this, islandList);
        ListView listView = (ListView)findViewById(R.id.islands_list);
        listView.setAdapter(islandAdapter);

    }

    public void getIsland(View listItem){
        Island island = (Island) listItem.getTag();
        Intent i = new Intent(this, IslandActivity.class);
        i.putExtra("name", island.getName());
        i.putExtra("population", island.getPopulation().toString());
        startActivity(i);
    }
}
