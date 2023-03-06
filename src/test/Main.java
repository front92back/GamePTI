package test;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner (System.in);

    public static void clrscr() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    public static void welcomeGame() {
        clrscr(); 
        System.out.printf
        (
            "Welcome to the game!\n\n"+
            "Enter any key to continue ..."
        );
        scan.nextLine();
        clrscr();
    }

    public static void update(int heroHP, int enemyHP, int heroDefense, int enemyDefense, int heroC, int enemyC) {
        System.out.println("Hero HP: " + heroHP);
        System.out.println("Hero Defense: " + heroDefense);
        System.out.println("Hero's Weapon Condition: " + heroC + "\n");
        System.out.println("Enemy HP: " + enemyHP);
        System.out.println("Enemy Defense: " + enemyDefense);
        System.out.println("Enemy's Weapon Condition: " + enemyC + "\n");
        scan.nextLine();
        clrscr();
    }

    public static void main(String[] args) {
        welcomeGame();

        Hero h = new Hero("Hero", 100);
        Enemy en = new Enemy("Enemy", 100);
        Weapon wh = new Weapon("Sword", 10);
        Weapon we = new Weapon("Sword", 10);

        h.equipWeapon(wh);
        en.equipWeapon(we);
        
        h.attack(en);
        en.attack(h);
        System.out.println("Attack\n");
        update(h.hp, en.hp, h.def, en.def, wh.condition, we.condition);

        h.heal();
        en.remedy();
        System.out.println("Heal/Remedy\n");
        update(h.hp, en.hp, h.def, en.def, wh.condition, we.condition);

        h.defense();
        en.defense();
        System.out.println("Defence\n");
        update(h.hp, en.hp, h.def, en.def, wh.condition, we.condition);

        wh.use();
        we.use();
        System.out.println("Use\n");
        update(h.hp, en.hp, h.def, en.def, wh.condition, we.condition);

        wh.repair();
        we.repair();
        System.out.println("Repair\n");
        update(h.hp, en.hp, h.def, en.def, wh.condition, we.condition);
    }
}
