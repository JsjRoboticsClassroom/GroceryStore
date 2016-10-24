package nyc.c4q.operations.group2;

import nyc.c4q.operations.instructor.GroceryItem;

public abstract class Meat extends GroceryItem {
    private Animal animal;
    private Cut cut;
    public Meat(Animal animal, Cut cut){
        this.animal = animal;
        this.cut = cut;
    }
}