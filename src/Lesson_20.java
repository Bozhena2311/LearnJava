/**
 * Created by Bozhena on 15.12.2021
 */
public class Lesson_20 {

    public static void main(String[] args) {
        Humanch humanch1 = new Humanch(); // На момент создания объекта, у него нет ни имена, ни возраста
        humanch1.setName("Bob");            // имя и возраст мы назначаем потом с помощью спец. методов
        humanch1.setAge(18);

        /**
         * Конструктор - это особы метод, который вызывается при создании объекта класса
         * Почему надо использовать конструктор?
         * Потому что humanch1 объект класса Humanch не может существовать без имени и возраста
         * Такой объект не имеет смысла
         * Поэтому надо ограничить пользователю создание новых объектов класса без передачи параметров имени и возраста
         * Или они будут заданы по умолчанию
         */

        Pet pet1 = new Pet();

        Pet pet2 = new Pet("Bob");

        Pet pet3 = new Pet("Peter", 21);
    }
}

class Pet {

    private String name;
    private int age;

    public Pet() { // Этот конструктор не принимает никаких параметров на вход
        this.name = "Имя по умолчанию";
        this.age = 0;
        System.out.println("Привет из первого конструктора");
    }

    // в одном классе в Java можно иметь сколько угодно методов с одинаковыми названиями, пока у них разные параметры
    // Джава определяет какой метод вызывать руководствуясь какие параметры пришли

    public Pet(String name) { // тут происходит перегрузка методов
        this.name = name;
        System.out.println("Привет из второго конструктора, " + name);
    }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Привет из третьего конструктора, " + name + " " + age);
    }

    public void setName(String name) { this.name = name; }

    public void setAge(int age) { this.age = age; }
}

// Конструкторы - это специальные методы, которые вызываются при создании нового объекта
// как видно из названия, конструктор конструирует объект, инициализирует поля объекта
class Humanch {
    public Humanch() { // Конструктор отличается от обычного метода тем, что
        // у него нет типа возвращаемого значения
        // Имя конструктора всегда должно совпадать с именем класса
        // в отличие от обычного метода, конструктор создается с большой буквы

    }
    private String name;
    private int age;

    public void setName(String name) { this.name = name; }

    public void setAge(int age) {this.age = age; }
}


