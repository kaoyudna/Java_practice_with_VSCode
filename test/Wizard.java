public class Wizard extends Character {
    // フィールド
    int mp;
    // メソッド
    public void fireBall(Monster m) {
        m.hp -= 10;
        System.out.println(m.name + m.suffix + "へファイアーボールを放った");
    }
}