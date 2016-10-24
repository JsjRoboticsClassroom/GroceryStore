package nyc.c4q.operations.group8;

import nyc.c4q.operations.instructor.GroceryItem;

public abstract class Bagel extends GroceryItem {
    //fields
    private Browning browning;
    private Spreads spreads;

    //constructor
    public Bagel(Browning browning, Spreads spreads) {
        this.browning = browning;
        this.spreads = spreads;
    }
}


