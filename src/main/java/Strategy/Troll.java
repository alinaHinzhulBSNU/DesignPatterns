package Strategy;

public class Troll extends Character{
    public Troll(){
        this.weaponBehavior = new AxeBehavior();
    }

    @Override
    public void display() {
        System.out.println("Character: Troll");
    }
}
