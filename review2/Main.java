public class Main {
    public static void main(String[] args) {
        Hero h = new Hero("ミナト", 100);
        Matango m1 = new Matango(50, 'A');
        Matango m2 = new Matango(48, 'B');
        h.slip();
        m1.run();
        m2.run();
        h.run();
    }
}