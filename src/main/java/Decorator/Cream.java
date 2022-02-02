package Decorator;

public class Cream extends Topping{
    public Cream(Coffee coffee){
        super(coffee);
        description = "Cream";
        price = 0.05;
    }
}
