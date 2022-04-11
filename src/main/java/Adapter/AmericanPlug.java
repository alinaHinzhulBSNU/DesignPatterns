package Adapter;

public class AmericanPlug implements Plug{
    @Override
    public void plugIn() {
        System.out.println("Plug (type A)");
    }
}
