package com.example.clareblackburne.scottishislandslist;

import java.util.ArrayList;

/**
 * Created by clareblackburne on 07/11/2017.
 */

public class FavouriteIslands {

    ArrayList<Island> islandList;

    public FavouriteIslands(){
        islandList = new ArrayList<Island>();
        islandList.add(new Island("Muck", 27));
        islandList.add(new Island("Eigg", 83));
        islandList.add(new Island("Arran", 4600));
        islandList.add(new Island("Iona", 200));
        islandList.add(new Island("South Uist", 1755));
        islandList.add(new Island("North Uist", 1255));
        islandList.add(new Island("Rum", 22));
        islandList.add(new Island("Mull", 2800));
        islandList.add(new Island("Lismore", 200));
        islandList.add(new Island("Jura", 200));
        islandList.add(new Island("Islay", 3200));
        islandList.add(new Island("Coll", 200));
        islandList.add(new Island("Tiree", 700));
    }

    public ArrayList<Island> getList(){
        return new ArrayList<Island>(islandList);
    }
}

