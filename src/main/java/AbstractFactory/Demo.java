package AbstractFactory;

public class Demo {
    public static void main(String[] args) {
        CarFactory factory = new NissanFactory();
        factory.createSedan();
        factory.createCoupe();

        factory = new ToyotaFactory();
        factory.createSedan();
        factory.createCoupe();
    }
}
