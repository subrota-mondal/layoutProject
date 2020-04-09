package com.example.recyclerviewdemo2;

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
