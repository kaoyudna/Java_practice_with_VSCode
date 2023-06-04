public abstract class Monster {
    // フィールド
    String name;
    char suffix;
    int hp;
    int damage;
    // getter・setterメソッド
    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}
    public char getSuffix() {return this.suffix;}
    public void setSuffix(char suffix) {this.suffix = suffix;}
    public int getHp() {return this.hp;}
    public void setHp(int hp) {this.hp = hp;}
    public int getDamage() {return this.damage;}
    public void setDamage(int damage) {this.damage = damage;}
    // メソッド
    public void run() {
        System.out.println(this.name + "は逃げ出した");
    }
    // コンストラクタ
    public Monster(String name, char suffix, int hp, int damage) {
        this.name = name;
        this.suffix = suffix;
        this.hp = hp;
        this.damage = damage;
    }
}