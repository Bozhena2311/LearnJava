/**
 * Created by Bozhena on 04.12.21
 */
public class WhileLoops_4 {
    public static void main(String [] args) {
        //Переменная t хранит значение true
        boolean t = true;
        System.out.println(t);
        // В значение переменной с типом данных boolean можно записывать выражения
        boolean expression = 5 == 5;
        System.out.println(expression);
        // В цикле while нам нужен какой-то логический оператор
        // т.е. нужно какое-то условие до каких пор будет выполняться цикл
        int value = 0;
        boolean sravnenie = value > 5;
        System.out.println("Значение boolean переменной sravnenie = " + sravnenie);
        // Цикл While - это тот цикл, который выполняется "пока, до тех пор какое-то условие дает нам true"
        // while пишется с маленькой буквы как и все операторы в Java
        // В круглых схобках у нас задается условие до каких пор у нас будет выполняться цикл
        // В фигурных скобках выполняется тело цикла, то что будет выполняться N-ое количество раз
        while(value <= 5) {
            System.out.println("Hello " + value);
            value = value + 1;
        }
    }
}
