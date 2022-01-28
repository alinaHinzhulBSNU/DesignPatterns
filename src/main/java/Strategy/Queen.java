package Strategy;

public class Queen extends Character{
    public Queen(){
        this.weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    public void display() {
        System.out.println("Character: Queen");
    }
}
