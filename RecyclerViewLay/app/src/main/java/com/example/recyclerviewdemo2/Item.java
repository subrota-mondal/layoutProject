package com.example.recyclerviewdemo2;

/**
 * Created by srabon on 10/9/2017.
 */

public class Item {
    private String name;

    Item(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
