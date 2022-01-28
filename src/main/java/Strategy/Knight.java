package Strategy;

public class Knight extends Character{
    public Knight(){
        this.weaponBehavior = new SwordBehavior();
    }

    @Override
    public void display() {
        System.out.println("Character: Knight");
    }
}
