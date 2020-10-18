public class NumberRedactor {

    /* Задание 4.
Разработайте класс, который получает строковое представление телефонного номера в одном из двух возможных строковых
форматов:
+<Код страны><Номер 10 цифр>, например “+79175655655” или
“+104289652211” или
8<Номер 10 цифр> для России, например “89175655655”
и преобразует полученную строку в формат:
+<Код страны><Три цифры>–<Три цифры>–<Четыре цифры> */
    public static String red(String num){
        StringBuilder str = new StringBuilder(num);
        if(str.charAt(0) != '+') {
            str.deleteCharAt(0);
            str.insert(0, "+7");
        }
        str.insert(str.length() - 7, '-');
        str.insert(str.length() - 4, '-');
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(red("89175655655"));
        System.out.println(red("+104289652211"));
    }
}
