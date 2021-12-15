/**
 * Created by Bozhena on 15.12.21
 */
public class Lesson_19 {

    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Tom");
        human1.setAge(18);
        human1.getInfo();

        Human human2 = new Human();
        human2.setAge(25);
        human2.setName("Bob");
        human2.getInfo();
    }
}

class Human {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name; //this.name помогает определить разницу для Java между private String name и String name
    } // Чтобы внутри метода класса обратиться к переменной класса нужно написать this.и имя атрибута (поля) класса

    public void setAge(int age) { // this - это ключевое слово, вызывающие объект внутри класса
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println(name + ", " + age + " лет");
    }

}
