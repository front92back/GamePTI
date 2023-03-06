package test;

public class Hero {
    int
        hp,
        def = 0,
        baseAtk = 58,
        level = 1;
    Weapon weapon;
    String name;

    Hero(String name, int hp)
    {
        this.name = name;
        this.hp = hp;
    }

    void equipWeapon(Weapon w)
    {
        this.weapon = w;
    }

    void defense()
    {
        this.def += this.baseAtk*this.level/2;
    }
    
    void heal()
    {
        this.hp += 100;
    }

    void attack(Enemy en)
    {
        en.hp = en.hp - (this.level*this.baseAtk) + this.weapon.atk - en.def + this.weapon.randomAtk(weapon);
    }
}
