public class Dog {

    private int countOfTeeth;
    private String eyeColor;
    private int age;
    private double length;

    public Dog(int countOfTeeth, String eyeColor, int age, double length) {
        this.countOfTeeth = countOfTeeth;
        this.eyeColor = eyeColor;
        this.age = age;
        this.length = length;
    }

    public int getCountOfTeeth() {
        return countOfTeeth;
    }

    public void setCountOfTeeth(int countOfTeeth) {
        this.countOfTeeth = countOfTeeth;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "countOfTeeth=" + countOfTeeth +
                ", eyeColor='" + eyeColor + '\'' +
                ", age=" + age +
                ", length=" + length +
                '}';
    }
}
