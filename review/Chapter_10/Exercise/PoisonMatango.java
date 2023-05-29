public class PoisonMatango extends Matango {
    int poisonAttack;
    public PoisonMatango() {
        super('A');
        this.poisonAttack = 10;
    }
    public void attack(Hero h) {
        super.attack(h);
        if (poisonAttack > 0) {
            System.out.println("さらに毒の胞子をばら撒いた!");
            this.poisonAttack --;
            int damage = h.hp / 5;
            h.hp -= damage;
            System.out.println(damage + "ポイントのダメージ!");
        }
    }
}