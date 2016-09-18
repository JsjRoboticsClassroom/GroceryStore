package nyc.c4q.operations.group7;

import nyc.c4q.operations.instructor.GroceryItem;

public abstract class SushiRoll extends GroceryItem {
    private Type fish;
    private Sauce sauce;

    public SushiRoll(Type fish, Sauce sauce){
        this.fish = fish;
        this.sauce = sauce;
    }

}
