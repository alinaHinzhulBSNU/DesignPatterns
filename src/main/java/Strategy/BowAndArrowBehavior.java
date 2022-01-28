package Strategy;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Weapon: bow and arrow");
    }
}
