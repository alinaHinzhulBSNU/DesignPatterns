package Strategy;

abstract public class Character {
    protected WeaponBehavior weaponBehavior; // стратегія використання зброї

    abstract public void display(); // відображення персонажа гри

    public void fight(){
        weaponBehavior.useWeapon();
    } // використання зброї персонажем

    public void setWeaponBehavior(WeaponBehavior wb){
        this.weaponBehavior = wb;
    } // зміна зброї
}
