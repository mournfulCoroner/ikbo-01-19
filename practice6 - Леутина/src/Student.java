public class Student {
    private String name;
    private int IDNumber;
    private double averageMark;


    public Student(String name, double averageMark, int IDNumber) {
        this.name = name;
        this.averageMark = averageMark;
        this.IDNumber = IDNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", IDNumber=" + IDNumber +
                ", averageMark=" + averageMark +
                '}';
    }

}
