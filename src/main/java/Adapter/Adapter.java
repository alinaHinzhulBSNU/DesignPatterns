package Adapter;

public class Adapter implements Socket{
    private Plug plug;

    public Adapter(Plug plug) {
        this.plug = plug;
    }

    @Override
    public void supply() {
        System.out.println("SOCKET ADAPTED TO");
        this.plug.plugIn();
    }
}