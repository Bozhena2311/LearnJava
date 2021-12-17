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

        System.out.printf("This is a string, %s", "NICE");
        System.out.println();
        System.out.printf("This is a string, %d", 324);
        System.out.println();
        System.out.printf("%fThis is %s a string, %d", 10.2, "Hi", 348);
        System.out.println();
        System.out.printf("String %10d \n", 3478); // цифра между % и буквой d,s,f и тд обозначает ширину окончательного числа
        System.out.printf("String %10d \n", 54358); // цифра между % и буквой d,s,f и тд обозначает количество занимаемого символов
        System.out.printf("String %10d \n", 3443478); // цифра между % и буквой d,s,f и тд обозначает количество занимаемого символов
        System.out.printf("String %10d \n", 346348); // цифра между % и буквой d,s,f и тд обозначает количество занимаемого символов
        System.out.printf("String %10d \n", 345464578); // цифра между % и буквой d,s,f и тд обозначает количество занимаемого символов

        System.out.printf("String %.2f \n", 234.324); // .и число между % и f обозначает количество знаков после запятой, а также округляет числа
        System.out.printf("String %.2f \n", 24.332554);
        System.out.printf("String %.2f \n", 56.3245);
        System.out.printf("String %.2f \n", 65.234);
        System.out.printf("String %.2f \n", 9876.35678);


    }
}
