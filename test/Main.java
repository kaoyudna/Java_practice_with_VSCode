public class Main {
    public static void main(String[] args) {
        Hero h = new Hero("太郎");
        Matango m = new Matango('A');
        Wizard w = new Wizard();
        h.attack(m);
        m.run();
        w.fireBall(m);
        
    }
}