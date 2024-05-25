public class Main {
    public static void main(String[] args) {
        System.out.println(Utils.fraction(5.25));
        System.out.println(Utils.sumLastNums(4568));
        System.out.println(Utils.charToNum('3'));
        System.out.println(Utils.isPositive(3));
        System.out.println(Utils.isPositive(-5));

        System.out.println("\n\nПроверяем метод is2Digits  - Двузначное ли число");
        System.out.println(Utils.is2Digits(32));
        System.out.println(Utils.is2Digits(-10));
        System.out.println(Utils.is2Digits(789));
        System.out.println(Utils.is2Digits(-100));
        System.out.println(Utils.is2Digits(-4));
        System.out.println(Utils.is2Digits(9));

        System.out.println("\n\nПроверяем метод isUpperCase  - Большая ли латинская буква");
        System.out.println(Utils.isUpperCase('@'));
        System.out.println(Utils.isUpperCase('['));
        System.out.println(Utils.isUpperCase('a'));
        System.out.println(Utils.isUpperCase('z'));
        System.out.println(Utils.isUpperCase('A'));
        System.out.println(Utils.isUpperCase('Z'));
        System.out.println(Utils.isUpperCase('Й'));

        System.out.println("\n\nПроверяем метод isInRange  - Диапазон чисел включительно");
        System.out.println("Пример, где границы [5,1] а число равно 3 - " + Utils.isInRange(5, 1, 3));
        System.out.println("Пример, где границы [1,5] а число равно 5 - " + Utils.isInRange(1, 5, 5));
        System.out.println("Пример, где границы [2,15] а число равно 33 - " + Utils.isInRange(2, 15, 33));
        System.out.println("Пример, где границы [15,2] а число равно 33 - " + Utils.isInRange(15, 2, 33));
        System.out.println("Пример, где границы [3,3] а число равно 3 - " + Utils.isInRange(3, 3, 3));
        System.out.println("Пример, где границы [5,1] а число равно -3 - " + Utils.isInRange(5, 1, -3));

        System.out.println("\n\nПроверяем метод isDivisor  - Одно число является делителем другого");
        System.out.println("Пример, где числа 3 и 6 - " + Utils.isDivisor(3, 6));
        System.out.println("Пример, где числа 6 и 3 - " + Utils.isDivisor(6, 3));
        System.out.println("Пример, где числа 2 и 15 - " + Utils.isDivisor(2, 15));
        System.out.println("Пример, где числа 15 и 2 - " + Utils.isDivisor(15, 2));
        System.out.println("Пример, где числа 10 и 10 - " + Utils.isDivisor(10, 10));
        System.out.println("Пример, где числа 1 и 3 - " + Utils.isDivisor(1, 3));

        System.out.println("\n\nПроверяем метод isEqual   -  Равенство трех чисел");
        System.out.println("Пример, где числа 3,5,5 - " + Utils.isEqual(3, 5, 5));
        System.out.println("Пример, где числа 5,3,5 - " + Utils.isEqual(5, 3, 5));
        System.out.println("Пример, где числа 5,5,3 - " + Utils.isEqual(5, 5, 3));
        System.out.println("Пример, где числа 3,5,3 - " + Utils.isEqual(3, 5, 3));
        System.out.println("Пример, где числа 5,5,5 - " + Utils.isEqual(5, 5, 5));

        // Многократный вызов lastNumSum . Последовательное сложение пяти чисел: 5, 11, 123, 14, 1,
        System.out.println(Utils.lastNumSum(Utils.lastNumSum(Utils.lastNumSum(Utils.lastNumSum(5, 11),
                123), 14), 1));
    }
}