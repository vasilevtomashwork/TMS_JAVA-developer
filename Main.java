/**
 * @author Tomasz Wasiliew
 * created 3/2/2026
 **/
public class Main {
    public static void main(String[] args) {
        /*Задача 1.
        Написать приложение, которое будет вычислять и выводить значение по формуле:
        a=4*(b+c-1)/2; b и c задаем в коде самостоятельно.*/
        System.out.println("Задача 1.");
        int b = 2;
        int c = 6;
        int a = 4 * (b + c - 1) / 2;
        System.out.println(a);
        System.out.println("--------");

        /*Задача 2.
        В переменной n хранится двузначное число. Создайте программу, вычисляющую и выводящую
        на экран сумму цифр n. Например: n =26, в результате мы должны получить 8 (2+6)*/
        System.out.println("Задача 2.");
        int twoDigitInt = 36;
        int tens = twoDigitInt / 10;
        int units = twoDigitInt % 10;
        System.out.println("Сумма: " + (tens + units));
        System.out.println("--------");
        /*Задача 3.
        В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и выводящую
        на экран сумму цифр n. Например: n =126, в результате мы должны получить 9 (1+2+6).*/
        System.out.println("Задача 3.");
        int threeDigitInt = 799;
        int hundreds = threeDigitInt / 100;
        tens = (threeDigitInt - threeDigitInt / 100 * 100) / 10;
        units = threeDigitInt % 10;
        System.out.println("Сумма: " + (hundreds + tens + units));
        System.out.println("--------");

        /*Задача 4.
        В переменной n хранится вещественное число с ненулевой дробной частью. Создайте
        программу, округляющую число n до ближайшего целого и выводящую результат на экран.*/
        System.out.println("Задача 4.");
        float floatingPointNumber = 13.49f;
        System.out.println(Math.round(floatingPointNumber));
        System.out.println("--------");
        /*Задача 5.
        В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую
        на экран результат деления q на w с остатком. Пример вывода программы (для случая,
        когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке.*/
        System.out.println("Задача 5.");
        int q = 89;
        int w = 17;
        System.out.println("Частное: " + q / w + ", остаток: " + q % w);

        /*Задача *.
        Написать программу которая будет менять местами значение целочисленных переменных.*/
        System.out.println("Задача *.");
        int k = 1;
        int l = 4;
        System.out.println("до замены");
        System.out.println(" k = " + k);
        System.out.println(" l = " + l);
        k = k + l;
        l = k - l;
        k = k - l;
        System.out.println("после");
        System.out.println(" k = " + k);
        System.out.println(" l = " + l);
    }
}
