import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*1. Написать метод для конвертации массива строк/чисел в список
* 2. Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).*/

public class Container <E> {
    private  E[] err;
    private int size;

    public Container(E[] err) {
        this.err = err;
    }

    @Override
    public String toString() {
        return "Container{" +
                "err=" + Arrays.toString(err) +
                '}';
    }

    public void masToList(E[] mas, List<E> lst){
        lst.addAll(Arrays.asList(mas));
    }

    public static void main(String[] args) {
        ArrayList<String> ls = new ArrayList<>();
        String[] mas = {"s", "t", "k"};
        Integer[] mas2 = {2, 6, 7};
        Container m = new Container(mas);
        Container l = new Container(mas2);
        m.masToList(mas, ls);
        System.out.println(ls);
        System.out.println(m);
        System.out.println(l);
    }
}
