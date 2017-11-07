package com.example.clareblackburne.scottishislandslist;

/**
 * Created by clareblackburne on 07/11/2017.
 */

public class Island {

    String name;
    int population;

    public Island(String name, int population){
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return this.name;
    }


    public int getPopulation() {
        return this.population;
    }


}
