public class PoisonMatango extends Matango {
    int poisonAttack = 5;

    public void attack(Hero h) {
        super.attack(h);
        if (this.poisonAttack > 0) {
            System.out.println("さらに毒の胞子をばら撒いた");
            System.out.println((h.hp / 5) + "のダメージ")
            h.hp -= h.hp / 5;
            this.poisonAttack -= 1;
        }
    }

    public PoisonMatango() {
        super('A');
    }
}