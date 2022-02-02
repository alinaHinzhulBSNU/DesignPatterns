package Decorator;

public abstract class Topping extends Coffee{
    protected Coffee coffee;

    public Topping(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + " + description;
    }

    @Override
    public double getPrice() {
        return coffee.getPrice() + price;
    }
}