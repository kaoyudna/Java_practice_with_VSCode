public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("ヒーロー");
        Wand wand = new Wand("テスト用杖", 10);
        Wizard wizard = new Wizard("ウィザード", wand);
        wizard.heal(hero);
    }
}