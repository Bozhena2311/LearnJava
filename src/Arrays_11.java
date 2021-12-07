/**
 * Created by Bozhena on 07.12.2021
 */
public class Arrays_11 {

    public static void main(String [] args) {
        int number = 10; // Примитивный тип данных
        char character = 'a'; // Примитивный тип данных
        String str = "Hello"; // Ссылочный тип данных Короткий способ создания объекта класса String
        String str2 = new String("World"); // Ссылочный тип данных Способ создания объекта класса

        // Создадим целочисленный массив
        int[] numbers = new int[5]; // декларируем массив; переменная numbers ссылается на новый объект класса целочисл. массив
        // проинициализируем элементы массива, по умолчанию инициализируются 0
//        System.out.println(numbers[0]); // 0,1,2,3,4 - элементы массива, т.к. отчет начинается с 0
        // Можно инициализировать массив построчно, но это не удобно и долго, вдруг будет 1000 элементов или 100к
//        numbers[0] = 10;
//        numbers[1] = 20;

        // Поэтому для иницализации отлично подходит цикл for
        for (int i =0; i < numbers.length; i++) {
            numbers[i] = i*i;
            System.out.println(numbers[i]);
        }
        System.out.println();
        System.out.println("Другой массив");

        int[] intArray = {1,2,3}; //Декларирование и инициализация массива сразу же
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

}
