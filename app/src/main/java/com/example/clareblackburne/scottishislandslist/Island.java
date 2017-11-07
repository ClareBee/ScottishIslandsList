package com.example.clareblackburne.scottishislandslist;

/**
 * Created by clareblackburne on 07/11/2017.
 */

public class Island {

    private String name;
    private int population;

    public Island(String name, Integer population){
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return this.name;
    }


    public Integer getPopulation() {
        return this.population;
    }


}
