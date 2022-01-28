package Strategy;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Weapon: sword");
    }
}
