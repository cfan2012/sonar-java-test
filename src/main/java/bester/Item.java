package bester;

public abstract class Item {

    public abstract boolean betterThan(Item item);

//    public boolean besterThan(Item best) {
//        if (best == null) {
//            return true;
//        }
//        return this.getScore() > best.getScore();
//    }

}
