import org.w3c.dom.NameList;

public class Hero {

    String name;
    int hp;
    Sword sword;

    public void attack() {
        System.out.println(this.name + "は攻撃した!");
        System.out.println("敵に" + this.sword.damage + "ポイント与えた!");
    }

    public Hero(String name) {
        this.hp = 100;
        this.name = name;
    }
    public Hero() {
        this("ダミー");
    }
    
}