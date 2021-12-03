/**
 * Created by Bozhena on 03.12.2021
 */
public class Variables {
    // Перечисленные типы данных являются примитивными типами данных в Java
    // Всего в Java: примитивные типы данных и ссылочные типы данных
    public static void main(String[] args) {
        //Int множество всех целых чисел
        //Декларация выглядит так: Задекларировали переменную, т.е. выделили свободное место в памяти для нее
        int myInt;
        //Инициализация переменное - это присвоение ей какого-то значения
        myInt = 557;
        //Декларирование и инициализацию переменной можно делать в одной строке:
        int myNewInt = 100; //Тип данных Int вмещает в себя 32 битное число
        // Тип данных short вмещает в себя 16 битное число
        short myShort = 2342;
        // Тип данных Long вмещает в себя 64 бита информации
        long myLong = 8327586985L;
        //Вещественные типы данных Double(64 бита) и Float(32 бита)
        double myDouble = 4363.456;
        // в Java  все вещественные переменные по умолчанию Double,
        // поэтому если мы хотим именно Float, надо в конце числа добавить букву f
        // иначе компилятор нас не поймет и будет ругаться
        float myFloat = 3424.32f;
        // Тип данных символ указывается в одинарных кавычка!
        char c = 'a';
        // Логический тип данных Boolean
        boolean myBoolean = true;
        // Тип данных Byte вмещает в себя 8 битов информации или 1 байт
        byte myByte = 100; //-128-128

        System.out.println(myInt);
    }
}
