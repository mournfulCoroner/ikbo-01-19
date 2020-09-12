public class Main {

    public static void main(String[] args)
    {
        InsertionSort ins = new InsertionSort();
        Student[] arr = new Student[5];
        arr[0] = new Student("Marl", 4.5, 23);
        arr[1] = new Student("Karl", 4.3, 108);
        arr[2] = new Student("Curl", 3.0, 4);
        arr[3] = new Student("Murl", 5.0, 45);
        arr[4] = new Student("Larm", 3.4, 6);

        ins.sort(arr);
    }
}
