public class Cleric {

    String name;
    int hp = 50;
    final int MAXHP = 50;
    int mp = 10;
    final int MAXMP = 10;

    public void health() {
        System.out.println(this.name + "の現在の体力は" + this.hp + "\n魔力は" + this.mp);
    }

    public void selfAid() {
        System.out.println(this.name + "はセルフエイドを唱えた");
        this.mp -= 5;
        this.hp = this.MAXHP;
        System.out.println("現在の体力：" + this.hp + "\n現在の魔力：" + this.mp);
    }

    public void pray(int sec) {
        System.out.println(this.name + "は" + sec + "秒間祈った");
        int r = new java.util.Random().nextInt(3);
        int totalMp = this.mp + sec + r;
        if (totalMp > this.MAXMP) {
            this.mp = MAXMP;
            totalMp = MAXMP;
        } else {
            this.mp = totalMp;
        }
        int recoveryAmount = totalMp - this.mp;
        System.out.println(recoveryAmount + "MPを回復した" + "MP:" + this.mp);
    }

}