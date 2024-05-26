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


        // Домашнее задание №3
        // 3.1 Модуль числа
        System.out.println("Модуль числа -31 равен " + Utils.abs(-31));
        System.out.println("Модуль числа 33 равен " + Utils.abs(33));

        // 3.2 Безопасное деление
        System.out.println("5 / 0 = " + Utils.safeDiv(5, 0));
        System.out.println("8 / 2 = " + Utils.safeDiv(8, 2));

        // 3.3 Максимум
        System.out.println("Максимимум из двух чисесл 5 и 7 равен " + Utils.max(5, 7));
        System.out.println("Максимимум из двух чисесл 8 и -1 равен " + Utils.max(8, -1));
        System.out.println("Максимимум из двух чисесл 3 и 3 равен " + Utils.max(3, 3));

        // 3.4 Строка сравнения
        System.out.println(Utils.makeDecision(5, 7));
        System.out.println(Utils.makeDecision(8, -1));
        System.out.println(Utils.makeDecision(4, 4));

        // 3.5 Тройной максимум
        System.out.println("Максимимум из трех чисесл 5, 7 и 7 равен " + Utils.max3(5, 7, 7));
        System.out.println("Максимимум из трех чисесл 8, -1 и 4 равен " + Utils.max3(8, -1, 4));
        System.out.println("Максимимум из трех чисесл 3, 3 и 3 равен " + Utils.max3(3, 3, 3));

        // 3.6 Тройная сумма
        System.out.println("Два любых из трех чисел (5, 7, 2) дают в сумме третье число - "
                + Utils.sum3(5, 7, 2));
        System.out.println("Два любых из трех чисел (8, -1, 4) дают в сумме третье число - "
                + Utils.sum3(8, -1, 4));
        System.out.println("Два любых из трех чисел (6, 3, 3) дают в сумме третье число - "
                + Utils.sum3(6, 3, 3));
        System.out.println("Два любых из трех чисел (6, 3, -3) дают в сумме третье число - "
                + Utils.sum3(6, 3, -3));

        // 3.7 Двойная сумма
        System.out.println("Сумма двух чисел 5 и 7 с округлением до 20 при условии диапазона от 10 до 19 равно "
                + Utils.sum2(5, 7));
        System.out.println("Сумма двух чисел 8 и -1 с округлением до 20 при условии диапазона от 10 до 19 равно "
                + Utils.sum2(8, -1));
        System.out.println("Сумма двух чисел 22 и -12 с округлением до 20 при условии диапазона от 10 до 19 равно "
                + Utils.sum2(22, -12));

        // 3.8 Тридцать пять
        System.out.println("Число 5 делиться либо только на 3, либо только на 5 - " + Utils.is35(5));
        System.out.println("Число 8 делиться либо только на 3, либо только на 5 - " + Utils.is35(8));
        System.out.println("Число 15 делиться либо только на 3, либо только на 5 - " + Utils.is35(15));

        // 3.9 Волшебная шестерка
        System.out.println("Магическая шестерка для чисел 5 и 7 - " + Utils.magic6(5, 7));
        System.out.println("Магическая шестерка для чисел 8 и 2 - " + Utils.magic6(8, 2));
        System.out.println("Магическая шестерка для чисел 1 и 6 - " + Utils.magic6(1, 6));

        // 3.10 Возраст
        System.out.println(Utils.age(5));
        System.out.println(Utils.age(31));
        System.out.println(Utils.age(44));

        // 3.11 День недели
        System.out.println("Указываем только один день недели с порядковым номером 5 - " + Utils.day(5));
        System.out.println("Указываем только один день недели с порядковым номером 3 - " + Utils.day(3));
        System.out.println("Указываем только один день недели с порядковым номером 6 - " + Utils.day(6));

        // 3.12 Вывод дней недели
        System.out.println("тест для выводя дней недели начиная с четверга и до конца недели");
        Utils.printDays("четверг");
        System.out.println("тест для выводя дней недели начиная с чг и до конца недели");
        Utils.printDays("чг");
    }
}