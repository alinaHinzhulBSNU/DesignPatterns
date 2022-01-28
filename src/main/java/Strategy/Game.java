package Strategy;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);

        Game game = new Game();
        Character character = new Knight();
        character.display();

        // Демонстрація динамічної зміни стратегії поведінки
        character.fight();
        game.rearmament(character, consoleInput);
        character.fight();

        consoleInput.close();
    }

    // Переозброєння персонажа
    public void rearmament(Character character, Scanner input){
        System.out.print("\nChoose weapon:\n\t1 - sword;\n\t2 - knife;\n\t3 - axe;\n\t4 - bow and arrow;\n");
        try {
            int weaponNumber = input.nextInt();
            switch (weaponNumber) {
                case 1:
                    character.setWeaponBehavior(new SwordBehavior());
                    break;
                case 2:
                    character.setWeaponBehavior(new KnifeBehavior());
                    break;
                case 3:
                    character.setWeaponBehavior(new AxeBehavior());
                    break;
                case 4:
                    character.setWeaponBehavior(new BowAndArrowBehavior());
                    break;
                default:
                    break;
            }
        }
        catch (Exception ex){
            System.out.println("Invalid input!");
        }
    }
}
