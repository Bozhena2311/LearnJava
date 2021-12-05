import java.util.Scanner;

/**
 * Created by Bozhena on 04.12.2021
 */
public class Input_7 {
    // Рассмотрем ввод данных через класс Scanner
    public static void main(String [] args) {
        // Так создаются объекты в Java, переходим от общего класса к конкретному объекту
        String s = new String("aghaliure");
        // Класс Scanner отвечает за ввод данных с консоли, за получение данных от пользователя
        String str = new String("sjrgbrj");
        // В параметр - конструктор класса сканер нужно создать входной поток
        Scanner myScanner = new Scanner(System.in); // System.in - это стандартный поток входных данных
        // Класс Scanner с помощью new создаем объект класса Scanner. myScanner - переменная, которая ссылается на объект класса Scanner
        // У класса Scanner есть много своих методов.
        System.out.println("Введите что-нибудь"); //println метод который выводит какую строку
        String inputString = myScanner.nextLine(); // nextLine - метод.
        // У объекта класса Scanner вызвали метод nextLine(), который считает с клавиатуры одну строчку чего-нибудь
        // Строчка определяется до тех пора пока не нажмем на Enter
        System.out.println("Вы ввели: " + inputString);

        System.out.println("Введите какое-нибудь число");
        int myInt = myScanner.nextInt();
        System.out.println("Вы ввели: " + myInt);
    }
}
