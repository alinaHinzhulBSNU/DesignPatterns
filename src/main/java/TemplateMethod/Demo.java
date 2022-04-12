package TemplateMethod;

public class Demo {
    public static void main(String[] args) {
        System.out.println("\tCoffee:");
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println("\n\tTea:");
        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}
