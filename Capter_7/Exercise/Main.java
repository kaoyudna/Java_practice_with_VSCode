public class Main {

    public static void main(String[] args) {
        Cleric c = new Cleric();
        c.name = "太郎";
        c.hp = 1;

        c.health();
        c.selfAid();
        c.pray(7);
    }

}