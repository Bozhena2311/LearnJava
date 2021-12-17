/**
 * Created by Bozhena on 17.12.2021
 */
public class Lesson_24 {
    // Класс Object всегда с нами, просто он скрыт, Один из его методов toString()
    public static void main(String [] args) {
        String str = "Hello";   // Создаем объект класса String
        System.out.println(str); // и печатаем этот объект
        Cat c1 = new Cat("Cassandra", 4); // Создаем объект класса Cat
        // toString() - Метод класса Object от которого наследуются все объекты
        System.out.println(c1); // Выводим созданный объект на экран
        // Получается что-то странное - Cat@4b67cf4d
    }
}

class Cat { // Любой класс в Java наследуется от класса Object
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() { // public String toString() - сигнатура метода,
        // переопределим метод toString() в нашем классе
        return name + ", " + age;
        // вернем то, как мы хотим видеть вывод нашей строки
    }

}
