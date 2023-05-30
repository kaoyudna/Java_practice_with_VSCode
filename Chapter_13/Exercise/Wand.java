public class Wand {
    private String name;
    private double power;
    public String getName() {return this.name;}
    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("名前は3文字以上で入力してください");
        }
        this.name = name;
    }
    public double getPower() {return this.power;}
    public void setPower(double power) {
        if (power < 0.5 || power > 100) {
            throw new IllegalArgumentException("増幅率は0.5〜100以内で入力して下さい");
        }
        this.power = power;
    }
    public Wand(String name, double power) {
        this.setName(name);
        this.setPower(power);
    }
}