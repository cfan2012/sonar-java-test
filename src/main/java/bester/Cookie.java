package bester;

public class Cookie extends Item {
    private int numberOfChocolateChips;

    public Cookie(int numberOfChocolateChips) {
        this.numberOfChocolateChips = numberOfChocolateChips;
    }

    @Override
    public boolean betterThan(Item cookies) {
        return this.numberOfChocolateChips > ((Cookie) cookies).numberOfChocolateChips;
    }
}
