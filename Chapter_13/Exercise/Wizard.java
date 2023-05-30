public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;
    public int getHp() {return this.hp;}
    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }
    public int getMp() {return this.mp;}
    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("mpに0以下の数値は設定できません");
        }
        this.mp = mp;
    }
    public String getName() {return this.name;}
    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("名前は3文字以上で入力してください");
        }
        this.name = name;
    }
    public Wand getWand() {return this.wand;}
    public void setWand(Wand w) {
        if (w == null) {
            throw new IllegalArgumentException("杖がnullです");
        }
        this.wand = w;
    }
    public void heal(Hero h) {
        int basePoint = 10;
        int recoverPoint = (int)(basePoint * this.wand.getPower());
        h.setHp(h.getHp() + recoverPoint);
        System.out.println(h.getName() + "のHPを" + recoverPoint + "回復した!");
    }
    public Wizard(String name, Wand wand) {
        this.setName(name);
        this.setWand(wand);
    }
}