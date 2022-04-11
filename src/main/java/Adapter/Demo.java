package Adapter;

public class Demo {
    public static void main(String[] args) {
        AmericanPlug plug = new AmericanPlug();

        Adapter adapter = new Adapter(plug);
        adapter.supply();
    }
}
