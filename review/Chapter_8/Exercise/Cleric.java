public class Cleric {

    String name;
    int hp = 50;
    final int MAXHP = 50;
    int mp = 10;
    final int MAXMP = 10;

    public void selfAid() {
        System.out.println(this.name + "は、セルフエイドを唱えた!");
        mp -= 5;
        this.hp = this.MAXHP;
    }

    public void pray(int sec) {
        System.out.println(this.name + "は" +  sec + "秒間天に祈った!");
        int recover = sec + new java.util.Random().nextInt(3);
        int recoveryAmount =  Math.min(this.MAXMP - this.mp, recover);
        System.out.println("MPが" + recoveryAmount + "ポイント回復した!");
    }
}
