import java.util.Comparator;

public class InsertionSort implements Comparator<Student> {

    public void sort(Student[] array) {
        for (int i = 1; i < array.length; i++) {
            Student key = array[i];
            int j = i - 1;
            while (j >= 0 && compare(array[j],key) > 0) {
                array[j + 1]= array[j];
                j = j - 1;
            }
            array[j + 1]= key;
        }
        for(int i = 0; i < array.length; i++) System.out.println(array[i]);
    }

    @Override
    public int compare(Student student, Student t1) {
        return student.getIDNumber() - t1.getIDNumber();
    }

}
