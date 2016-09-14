package nyc.c4q.group4;

import nyc.c4q.instructor.GroceryItem;

public abstract class HotFood extends GroceryItem {

    private final Type tFlavor;
    private final int iServesHowMany;

    public HotFood (Type pFlavor, int pServesHowMany){
        this.tFlavor = pFlavor;
        this.iServesHowMany = pServesHowMany;
    }

}
