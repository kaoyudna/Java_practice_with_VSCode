public class Hero extends Character {
    // メソッド
    public void attack(Monster m) {
        System.out.println(m.name + "への攻撃!\n" + m.name + "は" + super.getDamage() + "ポイントのダメージを受けた!");
        m.hp -= super.getDamage();
        if (m.hp <= 0) {
            System.out.println(m.name + "を倒した!");
        }
    }
    // コンストラクタ
    public Hero(String name, int hp, int damage) {
        super(name, hp, damage);
    }
}