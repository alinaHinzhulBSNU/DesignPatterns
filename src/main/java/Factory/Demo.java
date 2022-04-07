package Factory;
import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String [] pizza_types = {"cheese", "veggie", "clam", "pepperoni"};

        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        String type = "";
        while (!Arrays.asList(pizza_types).contains(type.toLowerCase())){
            System.out.println("Enter pizza type:");
            type = keyboard.nextLine();
        }

        store.orderPizza(type);
    }
}
