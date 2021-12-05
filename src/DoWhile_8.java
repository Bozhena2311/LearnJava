import java.util.Scanner;

/**
 * Created by Bozhena on 05.12.21
 */
public class DoWhile_8 {
    // Программа, которая будет работать пока пользователь не введет число 5
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5");
        int value = scanner.nextInt();
        while (value != 5) {
            System.out.println("Введите 5");
            value = scanner.nextInt();
        }
        System.out.println("Вы ввели 5!");
        //Если сразу ввести 5, то цикл While не выполнится ни разу
        // В этой программе происходит дублирование одного и того же кода, а это плохо!
        //Эту проблему можно решить с помощью цилка do while
        int value2;
        // Цикл do..while сначала выполняет какие-то действия, а потом проверяет условия
        do {
            System.out.println("Введите 9");
            value2 = scanner.nextInt();
        } while (value2 != 9);
        System.out.println("Вы ввели 9");
    }
}
