package bester;

public class Bester {

    public Item compare(Item[] items) {
        Item best = items[0];
        for (Item item : items) {
            if(item.betterThan(best)){
                best = item;
            }
        }
        return best;
    }

}
