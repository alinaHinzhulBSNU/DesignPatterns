package Singleton;

public class Demo {
    public static void main(String[] args) {
        DAO db1 = DAO.getInstance();
        DAO db2 = DAO.getInstance();
        System.out.println("Same object? " + db1.equals(db2));
    }
}
