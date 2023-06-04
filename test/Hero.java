public class Hero extends Character {
    // メソッド
    public void attack(Monster m) {
        System.out.println(m.name + m.suffix + "への攻撃!\n" + m.name + m.suffix + "は" + super.getDamage() + "ポイントのダメージを受けた!");
        m.hp -= super.getDamage();
        if (m.hp <= 0) {
            System.out.println(m.name + m.suffix + "を倒した!");
        }
    }
    // コンストラクタ
    public Hero(String name) {
        super(name, 100, 10);
    }
}