public abstract class Character {
    // フィールド
    private String name;
    private int hp;
    private int damage;
    // getter.setterメソッド
    public String getName() {return this.name;}
    public void setName(String name) {
        if (name == null || name.length() > 10) {
            throw new IllegalArgumentException("名前がnull、10文字以上です");
        }
        this.name = name;
    }
    public int getHp() {return this.hp;}
    public void setHp(int hp) {
        if (hp < 0 || hp > 100) {
            throw new IllegalArgumentException("HPが0以下、または100以上です");
        }
        this.hp = hp;
    }
    public int getDamage() {return this.damage;}
    public void setDamage(int damage) {
        if (damage < 0 || damage > 100 ) {
            throw new IllegalArgumentException("ダメージは0以下、または100以上です");
        }
        this.damage = damage;
    }
    // メソッド
    public void run() {
        System.out.println(this.name + "は逃げ去った!");
    }
    // コンストラクタ
    public Character(String name, int hp, int damage) {
        this.name = this.getName();
        this.hp = this.getHp();
        this.damage = this.getDamage();
    }
}