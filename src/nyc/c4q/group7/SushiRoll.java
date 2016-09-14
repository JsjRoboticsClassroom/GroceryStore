package nyc.c4q.group7;

import nyc.c4q.instructor.GroceryItem;

public abstract class SushiRoll extends GroceryItem {
    Type fish;
    Sauce sauce;

    public SushiRoll(Type fish, Sauce sauce){
        this.fish = fish;
        this.sauce = sauce;
    }

}
