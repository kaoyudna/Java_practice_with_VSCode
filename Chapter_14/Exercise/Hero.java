public class Hero {
    String name;
    int hp;
    int mp;
    public void status () {
        System.out.println("名前は" + this.name + "、体力は" + this.hp);
    }
    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.mp = 10;
    }
}