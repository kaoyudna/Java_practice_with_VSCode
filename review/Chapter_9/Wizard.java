public class Wizard {

    String name;
    int hp;

    public void heal(Hero h) {
        int recover = 10;
        h.hp += recover;
        System.out.println(h.name + "のHPを" + recover + "回復した!");
    }

    Wizard(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
}