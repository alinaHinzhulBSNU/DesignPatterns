package TemplateMethod;

public class Tea extends CaffeineBeverage{
    @Override
    public void brew() {
        System.out.println("Заварюється чай");
    }

    @Override
    public void addTopping() {
        System.out.println("Додається лемон");
    }
}
