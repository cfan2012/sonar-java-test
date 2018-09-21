package bester;

public class Rectangle extends Item {
    private double length;
    private double breadth;

    public Rectangle(double breadth, double length) {
        this.breadth = breadth;
        this.length = length;
    }

    public double area() {
        return length * breadth;
    }

    @Override
    public boolean betterThan(Item rectangle) {
        return this.area() > ((Rectangle) rectangle).area();
    }
}
