package nyc.c4q.group2;

import nyc.c4q.instructor.GroceryItem;

import java.util.Stack;

public abstract class Meat extends GroceryItem {
    private Animal animal;
    private Cut cut;
    public Meat(Animal animal, Cut cut){
        this.animal = animal;
        this.cut = cut;
    }
}