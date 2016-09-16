package nyc.c4q.group6;

import nyc.c4q.instructor.GroceryItem;

public abstract class FrozenFood extends GroceryItem {

    private Appliance appliance;
    private int time;


    public FrozenFood(Appliance appliance, int time){
        this.appliance = appliance;
        this.time = time;



    }



}
