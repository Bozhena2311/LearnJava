import java.util.Scanner;

/**
 * Created by Bozhena on 05.12.2021
 */
public class Switch_10 {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
/*        System.out.println("Введите возраст");
        int age = scanner.nextInt();
        // switch нужен, когда есть много условий.
        switch (age) { // в качестве параметра в круглые скобки после ключевого слова switch пишется переменная, которая может принимать различные значения
            // В фигурных скобках тела switch пишутся case перебирающие все различные значения
            case 0:
                System.out.println("Вы родились!");
                break; // необходимо после каждого case ставить break, иначе будут выполняться все остальные case
            case 7:
                System.out.println("Вам пора в школу!");
                break;
            case 18:
                System.out.println("Ура! Вы закончили школу");
                break;
            default: // Если не написать блок по умолчанию, и ввести того, чего нет в кейсах, то ничего не произойдет совсем
                System.out.println("Ни одно из предыдущих условий не подошло(");
        }*/
        // С 7ой Java switch может перебирать не только интовые переменные, но и стринговые
        System.out.println("Введите возраст");
        String age2 = scanner.nextLine();
        switch (age2) {
            case "ноль":
                System.out.println("Вы родились!");
                break; // необходимо после каждого case ставить break, иначе будут выполняться все остальные case
            case "семь":
                System.out.println("Вам пора в школу!");
                break;
            case "восемнадцать":
                System.out.println("Ура! Вы закончили школу");
                break;
            default: // Если не написать блок по умолчанию, и ввести того, чего нет в кейсах, то ничего не произойдет совсем
                System.out.println("Ни одно из предыдущих условий не подошло(");
        }
    }
}
