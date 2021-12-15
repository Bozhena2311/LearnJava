/**
 * Created by Bozhena on 15.12.2021
 */
public class Lesson_20_21 {

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

        // Объект класса Pet с названием p1 ссылается на новый объект класса Pet c именем и возрастом
        // Очевидно, что эти переменные, они переменные объекта,
        // потому что эти переменные могут быть, только у объекта,
        // мы не можем взять класс и у него поменять имя и возраст
        Pet p1 = new Pet("Bo", 30);

        p1.setName("Tom");
        p1.setAge(15);

        Pet.description = "Какое-то описание"; // Инициализация переменной класса,
        Pet.getDescription();

        Pet p2 = new Pet("BOBOD", 40); // У объектов класса данные переменные будут разными
        Pet p3 = new Pet("TOMOM", 30);
        p2.description = "Bad";
        Pet.description = "Nice";
        p2.getAllFields();
        p3.getAllFields();
        Pet.description = "Bad"; // А статическая переменная класса будет одной и той же переменная для объектов класса
        p2.getAllFields();
        p3.getAllFields();

        p1.printNumberOfPeople();
        p2.printNumberOfPeople();
        p3.printNumberOfPeople();

    }
}

class Pet {
    // Переменные и методы класса обозначаются ключевым словом static

    public static String description; // Задекларировали статическую переменную типа String
    // Для инициализации такой переменной класса не нужно создавать объект класса
    // можно сразу обращаться к переменной через класс, так как это переменная статическая
    // И Эта переменная будет общей для всех объектов класса Pet
    public static int x;

    private static int countPeople; // Переменные класса автоматически инициализируются нулем


    // Переменные
    // Переменные объекта - так как у каждого объекта эти переменные разные
    // И они инициализируются только при создании нового объекта
    // Мы можем назначить имя и возраст только объекту класса, а не классу
    private String name;
    private int age;

    // Конструкторы
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
        countPeople++;
        System.out.println("Привет из третьего конструктора, " + name + " " + age);
    }

    // Методы
    public void setName(String name) { this.name = name; }

    public void setAge(int age) { this.age = age; }

    public static void getDescription() {
        System.out.println(description);
    }

    public void getAllFields() {
        System.out.println(name + ", " + age + ", " + description); // мы можем использовать статическую переменную в обычном методы объекта
        // мы не можем делать обратного
    }

    public static void printAllField() {
        //System.out.println(name); // И Ошибка!
        // к не статическая переменная name не может совершаться обращение через статический контекст (статического метода)
        // потому что name у каждого объекта свой, а статический метод один на все объекты

        // когда мы запускаем программу статические методы уже существуют даже если не создавать ни один объект
        // даже если не инициализировать статические переменные они будут по умолчанию null или 0

        // Статический метод может работать только со статическими переменными
        // Статический метод не может работать с переменными объекта класса

        // Мы используем статические методы если нам не нужно создавать объект класса, чтобы воспользоваться этим методом
    }

    public void printNumberOfPeople() {
        System.out.println("Number of People is " + countPeople);
    }
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

