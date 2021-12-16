import java.util.Locale;

/**
 * Created by Bozhena on 16.10.2021
 */
public class Lesson_23_StringBuilder {
    public static void main(String [] args) {
        //в Java существует два типа объектов
        // mutable - изменяемый
        // immutable - неизменяемый
        String x = "hello"; // Это строка и объект класса String
        // Объекты класса String являются immutable переменными
        x = x.toUpperCase(); // переопределяем переменную
        System.out.println(x);

        String str1 = "Hello";
        String str2 = " my";
        String str3 = " friend";
        String strAll = str1 + str2 + str3;
        System.out.println(strAll);

        // String Builder - mutable, объекты класса String Builder могут изменяться

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my");
        sb.append(" friend");
        System.out.println(sb.toString()); // Если нужно много конкатинировать строки лучше использовать String Builder
        sb.append(", ").append("I ").append("like").append(" you!");
        System.out.println(sb);

        // Строка String не меняется, а каждый раз создается новая, но уже измененная
        // Частая конкатинация строк String очень сильно замедляет исполнение программы


    }
}
