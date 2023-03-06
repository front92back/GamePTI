package test;

public class Enemy {
    int
        hp,
        def = 0,
        baseAtk = 46,
        level = 1;
    Weapon weapon;
    String name;

    Enemy(String name, int hp)
    {
        this.name = name;
        this.hp = hp;
    }

    void equipWeapon(Weapon w)
    {
        this.weapon = w;
    }

    void attack(Hero h)
    {
        h.hp = h.hp - (this.level*this.baseAtk) + this.weapon.atk - h.def + this.weapon.randomAtk(this.weapon);
    }

    void defense()
    {
        this.def += this.baseAtk*this.level/2;
    }

    void remedy()
    {
        this.hp += 100;
    }
}
