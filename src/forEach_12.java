/**
 * Created by Bozhena on 07.12.2021
 */
public class forEach_12 {

    public static void main(String [] args) {
        String[] strArray = new String[3]; // Массив строк, массив может вместить в себя 3 объекта класса String
        strArray[0] = "Hello";
        strArray[1] = "Bye";
        strArray[2] = "Java";
        System.out.println(strArray[0] + " " + strArray[2]);

        System.out.println();
        System.out.println("Способ вывода массива строк через for");

        for(int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

        System.out.println();
        System.out.println("Способ вывода массива строк через forEach");
        // Цикл forEach ("Для каждого") этот цикл проходится по каждому элементу массива последовательно
        // В теле цикла с каждым элементом можно что-то делать
        for(String str: strArray) { // 1. Тип данных 2. Переменная которая будет использоваться 3. наш массив
            System.out.println(str);
        }

        System.out.println();
        System.out.println("Сумма элементов целочисленного массива");
        int[] numbers1 = {1,2,3};
        int sum = 0;
        for(int x: numbers1) { // 1. Тип данных. 2. Переменная изменяющаяся каждую итерацию на +1. 3. Массив по которому проходим
            sum = sum + x;
        }
        System.out.println(sum);

        int value = 0; // когда создаем переменную int выделяем в памяти 32 бита
        String s; //=null; // декларируем переменную s, тут выделяется память только под ссылку, не инициализированная переменная по умолчанию указывает на null пустоту
        String s1 = "sknfkwje"; //Здесь уже выделяется память под саму строку

    }
}
