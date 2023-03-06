package test;

public class Weapon {
    int
        atk,
        condition = 100;
    String name;
    boolean isBroken;

    Weapon(String name, int atk)
    {
        this.name = name;
        this.atk = atk;
    }

    void repair()
    {
        condition = 100;
    }

    int use()
    {
        return condition -= 10;
    }

    int randomAtk(Weapon w)
    {
        return (int) (this.atk * (Math.random()*(0.3-0.1)));
    }
}
