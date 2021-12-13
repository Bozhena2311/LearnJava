/**
 * Created by Bozhena on 13.12.21
 */
public class ClassesAndObject_18 {

    public static void main(String[] args) {
        Person1 person1 = new Person1();
        // Если пользователь захочет вывести пустое имя и отрицательный возраст
        // у него это получится, так как пользователь может обращаться напрямую к полям класса
        //person1.user = ""; // и тут переменная стала недоступна
        //person1.age = -5;

        // С помощью сеттеров
        person1.setName(""); // устанавливаем имя
        person1.setAge(-12); // устанавливаем возраст

        // С помощью геттеров, мы получаем
        System.out.println("Выводим значение в main методе: " + person1.getName());
        System.out.println("Выводим значение в main методе: " + person1.getAge());
        person1.speak();
    }
}

class Person1 {
    // private - это ключевое слово, которое означает, что
    // это поле доступно и видно, только в пределах этого класса
    private String user;
    private int age;

    //Сеттеры и геттеры позволяют получить доступ к приватным полям в других классах

    public void setName(String userName) { // Setter - только назначает и ничего не возвращает
        // Теперь пользователь не может ввести пустое имя, потому что в Settere мы инкапсулировали логику
        // которая проверит корректность ввода
        if (userName.isEmpty()) {
            System.out.println("Вы ввели пустое имя");
        } else {
            user = userName;
        }
    }

    public String getName() { // Getter - с типом возвращаемого значения String, он будет возвращать строку
        return user;
    }

    public void setAge(int userAge) { // Setter
        if (userAge < 0) {
            System.out.println("Возраст должен быть положительным");
        } else {
            age = userAge;
        }
    }

    public int getAge() { // Getter
        return age;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + user + ", мне " + age + " лет");
        }
    }
}