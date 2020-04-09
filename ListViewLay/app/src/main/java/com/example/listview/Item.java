package com.example.listview;

/**
 * Created by srabon on 3/23/2018.
 */

public class Item {
    private String itemName;
    private String itemDescription;

    public Item(String name, String description){
        this.itemName = name;
        this.itemDescription = description;
    }

    public String getItemName(){
        return this.itemName;
    }

    public String getItemDescription(){
        return this.itemDescription;
    }
}
