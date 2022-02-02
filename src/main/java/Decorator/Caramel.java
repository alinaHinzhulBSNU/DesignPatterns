package Decorator;

public class Caramel extends Topping {
    public Caramel(Coffee coffee){
        super(coffee);
        description = "Caramel";
        price = 0.1;
    }
}
