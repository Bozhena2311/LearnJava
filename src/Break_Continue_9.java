/**
 * Created by Bozhena on 05.12.2021
 */
public class Break_Continue_9 {
    // Операторы, которые используются вместе с циклами break and continue
    public static void main(String [] args) {
        // Оператор break используется для выхода из цикла
        int i = 0;
        while (true) { //Бесконечный цикл
            if (i == 15) {
                break; // Когда выполнится условие i == 15, запуститься оператор break и полностью прервет цикл while
            }
            System.out.println(i);
            i += 1;
        }
        System.out.println("Вы вышли из цикла!");

        for (int count = 0; count < 15; count++) {
            if (count % 2 == 0) { // Знак % означает остаток от деления на число после знака % равняется 0?
                // Оператор % - это остаток от деления
                continue; // Оператор continue выполняется только в том случае, когда count четное число
            } // Когда оператор continue выполняется в цикле, то всё что после него невыполняется и цикл просто переходит на следующую итерацию
            System.out.println("Это нечетное число " + count);
        }
    }
}
