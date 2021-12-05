/**
 * Created by Bozhena on 04.12.2021
 */
public class If_6 {

    public static void main(String [] args) {
        int myInt = 15;
        // Ключевое слово условия if - если
        // если условие в круглых скобках верно, то выполняются действия в фигурных скобках
        if(5 == 5) {
            System.out.println("5 == 5, Верно");
        }
        if (5 > 1) {
            System.out.println("5 > 1 Верно");
        }
        System.out.println("5 < 4, Неверно, поэтому выполняется else");
        if (5 < 4) {

        } else {
            System.out.println("Блок else выполнился");
        }

        if (myInt < 10) {
            System.out.println("Да, верно");
        } else if (myInt > 20) {
            System.out.println("Нет, неверно");
        } else {
            System.out.println("Ни один из предыдущих случаев");
        }

        int myInt2 = 5;
        if (myInt2 < 10) {
            System.out.println("Выполняется условие");
        } else if (myInt2 < 20) {
            System.out.println("Уже не выполняется условие, т.к. условие выше удовлитворительное и дальше условия не проверяются");
        }

    }
}
