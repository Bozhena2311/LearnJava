/**
 * Created by Bozhena on 20.12.2021
 */
public class Lesson_25 {

    public static void main(String [] args) {

        System.out.println("Создаем объект класса Animal");
        Animal animal = new Animal();
        System.out.println("Вызываем методы класса Animal");
        animal.eat();
        animal.sleep();

        System.out.println("Создаем объект класса Dog");
        // Теперь объект класса Dog наследует методы класса Animal
        Dog dog = new Dog();
        System.out.println("Вызываем методы, унаследованные от класса Animal");
        dog.eat(); // Переопределенный метод в классе потомке Dog
        dog.sleep();
        System.out.println("Вызываем метод класса Dog");
        dog.bark();
        dog.showName();

    }
}


