//import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


    /*
    * ## 1 задача

        Объявите три массива:

        1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.


        2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.

        3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
        * с помощью ключевого слова или сразу заполненный элементами.
    *
    *
    * */
        System.out.println("Задача 1.");
        int[] firstArr = new int[3];
        for (int i = 0; i < firstArr.length; i++) {
            firstArr[i] = i;
        }

        float[] secondArr = {1.57f, 7.654f, 9.986f};
        // byte[] thirdArr = new byte[33];
        int[] thirdArr = arrayRandom(30);

    /* 2 задача

    Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов, начиная с первого элемента,
    через запятую. Запятая между последним элементом одного массива и первым элементом следующего не нужна.
    */

        System.out.println("Задача 2.");
        for (int i = 0; i < firstArr.length; i++) {
            System.out.printf("%s", firstArr[i]);
            if (i + 1 != firstArr.length) {
                System.out.print(", ");
            } else
                System.out.print("\n");
        }

        for (int i = 0; i < secondArr.length; i++) {
            System.out.printf("%s", secondArr[i]);
            if (i + 1 != secondArr.length) {
                System.out.print(", ");
            } else
                System.out.print("\n");

        }

        for (int i = 0; i < thirdArr.length; i++) {
            System.out.printf("%s", thirdArr[i]);
            if (i + 1 != thirdArr.length) {
                System.out.print(", ");
            } else
                System.out.print("\n");

        }
    /*## 3 задача

    Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента массива, а с последнего. Элементы должны быть распечатаны через запятую, при этом элементы одного массива располагаются на одной строчке, а элементы другого массива – на другой.

    Запятая между последним элементом одного массива и первым элементом следующего не нужна.
    */
        System.out.println("Задача 3.");

        for (int i = (firstArr.length - 1) ; i >= 0 ; i--) {
            System.out.printf("%s", firstArr[i]);
            if (i != 0 ) {
                System.out.print(", ");
            } else
                System.out.print("\n");
        }

        for (int i = (secondArr.length - 1) ; i >= 0 ; i--) {
            System.out.printf("%s", secondArr[i]);
            if (i != 0 ) {
                System.out.print(", ");
            } else
                System.out.print("\n");
        }

        for (int i = (thirdArr.length - 1) ; i >= 0 ; i--) {
            System.out.printf("%s", thirdArr[i]);
            if (i != 0 ) {
                System.out.print(", ");
            } else
                System.out.print("\n");
        }


    /*
    * ### 4 задача

    Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).

    Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.

    Распечатайте результат преобразования в консоль.
    *
    * Для очевидности правильности алгоритма возьмём массив побольше - третий
    * */
        System.out.println("Задача 4.");
        for (int i = 0; i < thirdArr.length; i++) {
            if (thirdArr[i] % 2 != 0) { thirdArr[i]++;
            }
            System.out.printf("%s", thirdArr[i]);
            if (i + 1 != thirdArr.length) {
                System.out.print(", ");
            } else
                System.out.print("\n");

        }
    }
    public static int[] arrayRandom(int length) {
        Random random = new Random();
        int[] array = new int[length];
        for (int i=0; i< length; i++ ) {
            array[i] = random.nextInt( 1_000) + 345;
        }
        return array;
    }

}