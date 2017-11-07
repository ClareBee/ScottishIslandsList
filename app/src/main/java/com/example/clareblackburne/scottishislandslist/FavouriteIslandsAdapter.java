package com.example.clareblackburne.scottishislandslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by clareblackburne on 07/11/2017.
 */

public class FavouriteIslandsAdapter extends ArrayAdapter<Island> {

    public FavouriteIslandsAdapter(Context context, ArrayList<Island> islands){
        super(context, 0, islands);
    }

    public View getView(int position, View listItemView, ViewGroup parent){
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.island, parent, false);
        }
        Island currentIsland = getItem(position);
        TextView name = (TextView)listItemView.findViewById(R.id.name_view);
        name.setText(currentIsland.getName());
        TextView population = (TextView)listItemView.findViewById(R.id.population_view);
        population.setText(currentIsland.getPopulation());

        listItemView.setTag(currentIsland);
        return listItemView;
    }
}
