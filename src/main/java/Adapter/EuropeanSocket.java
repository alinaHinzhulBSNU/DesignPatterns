package Adapter;

public class EuropeanSocket implements Socket{
    @Override
    public void supply() {
        System.out.println("Socket (type F)");
    }
}
