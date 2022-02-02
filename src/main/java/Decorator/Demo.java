package Decorator;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);

        int coffeeType = 0;
        int toppingType = 0;
        Coffee coffee = null;

        System.out.println("DECORATOR PATTERN DEMO:");

        // Обрання типу кави
        while (coffeeType > 3 || coffeeType <= 0){
            System.out.println("Select coffee:\n\t1 - Americano (1.45$)\t2 - Espresso (1.99$)\t3 - Latte (1.05$)");
            coffeeType = consoleInput.nextInt();
            switch (coffeeType){
                case 1:
                    coffee = new Americano();
                    break;
                case 2:
                    coffee = new Espresso();
                    break;
                case 3:
                    coffee = new Latte();
                    break;
                default:
                    break;
            }
        }

        // СТВОРЕННЯ ДЕКОРАТОРІВ
        while (toppingType != 4){
            System.out.println("Add topping:\n\t1 - Chocolate (0.2$)\t2 - Caramel (0.1$)\t3 - Cream (0.05$)\t4 - READY!");
            toppingType = consoleInput.nextInt();
            switch (toppingType){ // обрання топінгу до кави
                case 1:
                    coffee = new Chocolate(coffee);
                    break;
                case 2:
                    coffee = new Caramel(coffee);
                    break;
                case 3:
                    coffee = new Cream(coffee);
                    break;
                default:
                    break;
            }
        }

        // Склад кави та отримана загальна вартість
        System.out.println("TOTAL PRICE of '" + coffee.getDescription() + "' is $" + coffee.getPrice());
    }
}
