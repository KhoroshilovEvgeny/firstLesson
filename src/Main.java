import java.util.Arrays;

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

        // 4.1 Числа подряд
        System.out.println("\nПечать чисел от 0 до Х");
        System.out.println(Utils.listNums(5));
        System.out.println(Utils.listNums(7));

        // 4.2 Числа наоборот
        System.out.println("\nПечать чисел от Х до 0 в обратном порядке");
        System.out.println(Utils.reverseListNums(5));
        System.out.println(Utils.reverseListNums(7));

        // 4.3 Четные числа
        System.out.println("\nПечать четных чисел от 0 до Х включительно");
        System.out.println(Utils.chet(5));
        System.out.println(Utils.chet(8));


        // 4.4 Степень числа
        System.out.println("\nПроверка функции возведения числа в степень");
        System.out.println("2 в степени 5 равно " + Utils.pow(2, 5));
        System.out.println("3 в степени 0 равно " + Utils.pow(3, 0));
        System.out.println("3 в степени 3 равно " + Utils.pow(3, 3));

        // 4.5 Длина числа
        System.out.println("Проверка длины числа, т.е. количества цифр в числе");
        System.out.println("число 0 содержит " + Utils.numLen(0) + " цифр");
        System.out.println("число 5 содержит " + Utils.numLen(5) + " цифр");
        System.out.println("число 100 содержит " + Utils.numLen(100) + " цифр");
        System.out.println("число 12567 содержит " + Utils.numLen(12567) + " цифр");

        // 4.6 Одинаковость
        System.out.println("\nПроверяем все ли цифры в числе одинаковые");
        System.out.println("число 1 - " + Utils.equalNum(1));
        System.out.println("число 0 - " + Utils.equalNum(0));
        System.out.println("число -1 - " + Utils.equalNum(-1));
        System.out.println("число 33 - " + Utils.equalNum(33));
        System.out.println("число 32 - " + Utils.equalNum(32));
        System.out.println("число 222 - " + Utils.equalNum(222));
        System.out.println("число -222 - " + Utils.equalNum(-222));
        System.out.println("число 122 - " + Utils.equalNum(122));
        System.out.println("число -122 - " + Utils.equalNum(-122));
        System.out.println("число 1111 - " + Utils.equalNum(1111));
        System.out.println("число 1211 - " + Utils.equalNum(1211));

        // 4.7 Квадрат
        System.out.println("\n Печатаем квадрат 2х2");
        Utils.square(2);
        System.out.println("\n Печатаем квадрат 4х4");
        Utils.square(4);

        // 4.8 Левый треугольник
        System.out.println("\n Печатаем левый треугольник размером 2х2");
        Utils.leftTriangle(2);
        System.out.println("\n Печатаем левый треугольник размером 4х4");
        Utils.leftTriangle(4);

        // 4.9 Правый треугольник
        System.out.println("\n Печатаем правый треугольник размером 1х1");
        Utils.rightTriangle(1);
        System.out.println("\n Печатаем правый треугольник размером 3х3");
        Utils.rightTriangle(3);
        System.out.println("\n Печатаем правый треугольник размером 4х4");
        Utils.rightTriangle(4);

        // 4.10 Угадайка
        //Utils.guessGame();

        // 5.1 Поиск первого значения
        System.out.println("\nиндекс первого вхождения: " + Utils.findFirst(new int[]{1, 2, 3, 4, 2, 2, 5}, 2));
        System.out.println("индекс первого вхождения: " + Utils.findFirst(new int[]{1, 2, 3, 4, 2, 2, 5}, 5));
        System.out.println("индекс первого вхождения: " + Utils.findFirst(new int[]{1, 2, 3, 4, 2, 2, 5}, 7));

        // 5.2 Поиск последнего значения
        System.out.println("\nиндекс последнего вхождения: " + Utils.findLast(new int[]{1, 2, 3, 4, 2, 2, 5}, 2));
        System.out.println("индекс последнего вхождения: " + Utils.findLast(new int[]{1, 2, 3, 4, 2, 2, 5}, 1));
        System.out.println("индекс последнего вхождения: " + Utils.findLast(new int[]{1, 2, 3, 4, 2, 2, 5}, 7));

        // 5.3 Поиск максимального
        System.out.println("\nМаксимальное значение по модулю: " + Utils.maxAbs(new int[]{1, -2, -7, 4, 2, 2, 5}));
        System.out.println("Максимальное значение по модулю: " + Utils.maxAbs(new int[]{5}));
        System.out.println("Максимальное значение по модулю: " + Utils.maxAbs(new int[]{-7, -7}));

        // 5.4 Подсчет позитива
        System.out.println("\nПодсчет количества положительных элементов массива: " +
                Utils.countPositive(new int[]{1, -2, -7, 4, 2, 2, 5}));

        // 5.5 Палиндром
        System.out.println("\nМассив [1,-2,-7,4,2,2,5] полиндром ли ? Ответ : " +
                Utils.palindrom(new int[]{1, -2, -7, 4, 2, 2, 5}));
        System.out.println("Массив [1,-2,-7,4,-7,-2,1] полиндром ли ? Ответ : " +
                Utils.palindrom(new int[]{1, -2, -7, 4, -7, -2, 1}));

        // 5.6 Реверс
        System.out.println("\n\nРеверс массива");
        Utils.reverse(new int[]{});
        Utils.reverse(new int[]{1});
        Utils.reverse(new int[]{1, 2, 3, 4, 5});
        Utils.reverse(new int[]{1, 2, 3, 4, 5, 6});

        // 5.7 Возвратный реверс
        System.out.println("\n\nВозвратный реверс массима:");
        System.out.println(Arrays.toString(Utils.reverseBack(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(Utils.reverseBack(new int[]{1, 2, 3, 4, 5, 6})));
        System.out.println(Arrays.toString(Utils.reverseBack(new int[]{7})));
        System.out.println(Arrays.toString(Utils.reverseBack(new int[]{})));

        // 5.8 Объединение
        System.out.println("\n\nОбъединение двух массивов");
        System.out.println(Arrays.toString(Utils.concat(new int[]{1, 2, 3}, new int[]{7, 8, 9})));

        // 5.9 Все вхождения
        System.out.println("\n\nИндексы всех вхождений числа в массив:");
        System.out.println(Arrays.toString(Utils.findAll(new int[]{1, 2, 3, 8, 2, 2, 9}, 2)));

        //5.10 Удалить негатив
        System.out.println("\n\nИз массива удалить негативные элементы:");
        System.out.println(Arrays.toString(Utils.deleteNegative(new int[]{1, 2, -3, 4, -2, 2, -5})));

        //5.11 Добавление в массив
        System.out.println("\n\nДобавление элемента в массив:");
        System.out.println(Arrays.toString(Utils.add(new int[]{1, 2, 3, 4, 5}, 9, 3)));

        // 5.12 Добавление массива в массив
        System.out.println("\n\nДобавление массива в массив:");
        System.out.println(Arrays.toString(Utils.add(new int[]{1, 2, 3, 4, 5}, new int[]{7, 8, 9}, 0)));
        System.out.println(Arrays.toString(Utils.add(new int[]{1, 2, 3, 4, 5}, new int[]{7, 8, 9}, 3)));
        System.out.println(Arrays.toString(Utils.add(new int[]{1, 2, 3, 4, 5}, new int[]{7, 8, 9}, 5)));
    }
}