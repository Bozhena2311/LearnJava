/**
 * Created by Bozhena on 03.12.2021
 */
public class Strings { //Ссылочный тип данных
    // Декларация и инициализация таких переменные такая же,
    // НО с совершенно другим смыслом
    public static void main(String [] args) {
        int x = 5; // Примитивные типы хранят как коробки значения
        // Ссылочные типы данных начинаются с заглавной буквы, потому что является классом!
        String myString = "Hello"; // Ссылочные типы данных переменная (myString) ссылается на объект ("Hello") класса стринг
        // Класс String, объект "Hello"
        // Класс это чертеж, а машина - это объект, построенные с помощью класса
        // Класс это указание к тому как создавать объекты, объект - материальный, класс - не вещественный

        String space = " ";
        String name = "Bob";
        // Сложение строк с помощью оператора +
        System.out.println(myString+space+name);
        System.out.println("Hello" + " " + "John");
        System.out.println("My number is "+ x);
    }
}
