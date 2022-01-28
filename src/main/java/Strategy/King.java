package Strategy;

public class King extends Character{
    public King(){
        this.weaponBehavior = new SwordBehavior();
    }

    @Override
    public void display() {
        System.out.println("Character: King");
    }
}
