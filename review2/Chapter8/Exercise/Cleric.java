import java.util.Random;
public class Cleric {

    String name;
    int hp = this.MAXHP;
    final int MAXHP = 50;
    int mp = this.MAXMP;
    final int MAXMP = 10;

    public void selfAid() {
        this.mp -= 5;
        this.hp = this.MAXHP;
        System.out.println(this.name + "のセルフエイド！\n" + this.name + "の体力は" + this.hp + "、MPは" + this.mp);
    }

    public void pray(int sec) {
        Random rnd = new Random();
        int recoveryPoint = sec + rnd.nextInt(3);
        int recoveryActual = Math.min(this.MAXMP - this.mp, recoveryPoint);
        this.mp += recoveryActual;
        System.out.println(this.name + "は、" + sec + "秒間祈った！");
        System.out.println("MPが" + recoveryActual + "ポイント回復した！");
    }

    public Cleric(String name) {
        this.name = name;
    }

}