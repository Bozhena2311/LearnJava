/**
 * Created by Bozhena on 20.12.2021
 */
public class Dog extends Animal { // Dog расширяет класс Animal
    // Dog более узкое понятие, чем Animal

    //Dog extends Animal - означает, что Dog наследуется от Animal

    //Animal является родителем класса Dog

    // Поэтому у класса Dog есть методы класса Animal - eat(), sleep()

    //Класс Dog может иметь лично свои методы

    public void bark() { //Только собака из всех животных умеет гавкать
        System.out.println("I'm barking");
    }

    public void eat() { // Переопределение метода класса Animal (родителя)
        System.out.println("Dog is eating");
    }

    public void showName() {
        System.out.println(name);
    }
}
