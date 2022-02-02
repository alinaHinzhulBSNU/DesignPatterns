package Decorator;

public class Chocolate extends Topping{
    public Chocolate(Coffee coffee) {
        super(coffee);
        description = "Chocolate";
        price = 0.2;
    }
}
