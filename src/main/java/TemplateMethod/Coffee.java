package TemplateMethod;

public class Coffee extends CaffeineBeverage{
    @Override
    public void brew() {
        System.out.println("Заварюється кава");
    }

    @Override
    public void addTopping() {
        System.out.println("Додається молоко та кава");
    }
}
