public class Hero extends Character {
    // メソッド
    public void attack(Monster m) {
        System.out.println(m.name + m.suffix + "への攻撃!\n" + m.name + m.suffix + "は" + super.getDamage() + "ポイントのダメージを受けた!");
        m.hp -= this.getDamage();
        if (m.hp <= 0) {
            System.out.println(m.name + m.suffix + "を倒した!");
        }
    }
    // コンストラクタ
    public Hero(String name, int hp, int damage) {
        super(name, hp, damage);
    }
}