package Decorator;

public abstract class Coffee {
    protected String description = "Unknown";
    protected double price = 0;

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
