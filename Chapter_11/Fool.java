public class Fool extends Character implements Human {
    // Characterから継承したhpやnameなどのフィールドを継承
    // Characterから継承した抽象メソッドattack()を実装
    public void attack(Matango m) {
        System.out.println(this.name + "は戦わずに遊んでいる");
    }
    // さらにHumanから継承した4つ抽象メソッドを実装
    public void talk() {}
    public void watch() {}
    public void hear() {}
    public void run() {}
}