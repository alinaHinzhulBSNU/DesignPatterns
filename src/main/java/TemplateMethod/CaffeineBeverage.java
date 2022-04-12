package TemplateMethod;

public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addTopping();
    }

    public void boilWater(){
        System.out.println("Підігрівається вода");
    }

    public abstract void brew();

    public void pourInCup(){
        System.out.println("Розливається в чашки");
    }

    public abstract void addTopping();
}