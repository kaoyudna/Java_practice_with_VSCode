public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero("ミナト");
        Hero h2 = new Hero("アサカ");
        Hero h3 = new Hero();
        Wizard w = new Wizard();
        w.name = "スガワラ";
        w.hp = 50;
        System.out.println("勇者" + h1.name + "、HPは" + h1.hp);
        System.out.println("勇者" + h2.name + "、HPは" + h2.hp);
        System.out.println("勇者" + h3.name + "、HPは" + h3.hp);
        w.heal(h1);
        w.heal(h2);
        w.heal(h2);
    }
}