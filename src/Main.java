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

    int[] firstArr = new int[3];
    for (int i = 0; i < firstArr.length; i++) {
         firstArr[i]= i ;
    }

    float[] secondArr = {1.57f, 7.654f, 9.986f};
    byte[] thirdArr = new byte[33];

    /* 2 задача

    Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов, начиная с первого элемента,
    через запятую. Запятая между последним элементом одного массива и первым элементом следующего не нужна.
    */

        for (int i = 0; i < firstArr.length; i++) {
            System.out.printf("%s" , firstArr[i]);
            if (i + 1 != firstArr.length) {
                System.out.printf(", ");
            } else
            System.out.printf("\n");
        }

        for (int i = 0; i < secondArr.length; i++) {
            System.out.printf("%s" , secondArr[i]);
            if (i + 1 != secondArr.length) {
                System.out.printf(", ");
            } else
                System.out.printf("\n");

        }

        for (int i = 0; i < thirdArr.length; i++) {
            System.out.printf("%s" , thirdArr[i]);
            if (i + 1 != thirdArr.length) {
                System.out.printf(", ");
            } else
                System.out.printf("\n");

        }
    }

}