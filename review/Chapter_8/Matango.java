public class Matango {

    int hp;
    final int LEVEL = 10;
    char suffix;

    public void run() {
        System.out.println("お化けきのこ" + this.suffix + "は、逃げ出した!");
    }

    Matango(int hp, char suffix) {
        this.hp = hp;
        this.suffix = suffix;
    }

}
