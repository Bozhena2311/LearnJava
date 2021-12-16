/**
 * Created by Bozhena on 16.12.2021
 */
public class Lesson_22_final {
    // final ключевое слово для обозначения переменной, которая не будет изменяться - константа

    public static void main(String [] args) {

        final int X = 10;
        System.out.println(X);

    }


}

class Test {
    // константы обычно принято писать заглавными, чтобы было легко и сразу отличить от других переменных не констант
    public static final int CONSTANT = 0; // Константы еще обычно static иначе будет растрата памяти, т.е.
    // одно и то же значение будет копироваться для каждого объекта

}
