import org.w3c.dom.NameList;

public class Hero {

    String name;
    int hp;
    Sword sword;

    public void attack() {
        System.out.println(this.name + "は攻撃した!");
        System.out.println("敵に" + this.sword.damage + "ポイント与えた!");
    }

    Hero(String name, int hp, Sword sword) {
        this(name, hp);
        this.sword = sword;
    }

    Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    Hero(String name) {
        this(name, 100);
    }
}