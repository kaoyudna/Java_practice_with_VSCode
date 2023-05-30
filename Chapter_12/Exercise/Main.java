public class Main {
    public static void main(String[] args) {
        // 配列変数の型 = Y
        Y[] array = new Y[2];
        array[0] = new A();
        array[1] = new B();
        for (Y y : array) {
            y.b();
        }
    }
}