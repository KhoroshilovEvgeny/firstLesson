import java.util.Arrays;

public class Utils {

    // 2.1 Дробная часть
    public static double fraction(double x) {
        return x - (int) x;
    }

    // 2.2 Сумма знаков
    public static int sumLastNums(int x) {
        return x % 10 + x / 10 % 10;
    }

    // 2.3 Букву в число
    public static int charToNum(char x) {
        return x - 48;
    }

    // 2.4 Есть ли позитив
    public static boolean isPositive(int x) {
        return x > 0;
    }

    // 2.5 Двузначное
    public static boolean is2Digits(int x) {
        return Math.abs(x) > 9 && Math.abs(x) < 100;
    }

    // 2.6 Большая буква
    public static boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }

    // 2.7 Диапазон
    public static boolean isInRange(int a, int b, int num) {
        return (a <= num && num <= b && a <= b) || (b <= num && num <= a && a > b);
    }

    // 2.8 Делитель
    public static boolean isDivisor(int a, int b) {
        return (a % b == 0) || (b % a == 0);
    }

    // 2.9 равенство
    public static boolean isEqual(int a, int b, int c) {
        return (a == b) && (b == c);
    }

    // 2.10 Многократный вызов
    public static int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }

    // Домашнее задание №3
    // 3.1 Модуль числа
    public static int abs(int x) {
        if (x < 0) {
            x *= -1;
        }
        return x;
    }

    // 3.2 Безопасное деление
    public static int safeDiv(int x, int y) {
        return y == 0 ? 0 : x / y;
    }

    // 3.3 Максимум
    public static int max(int x, int y) {
        return x > y ? x : y;
    }

    // 3.4 Строка сравнения
    public static String makeDecision(int x, int y) {
        String result;
        if (x > y) {
            result = " > ";
        } else if (x < y) {
            result = " < ";
        } else {
            result = " == ";
        }
        return x + result + y;
    }

    // 3.5 Тройной максимум
    public static int max3(int x, int y, int z) {
        int max;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }

    // 3.6 Тройная сумма
    public static boolean sum3(int x, int y, int z) {
        boolean result = false;
        if (x + y == z) {
            result = true;
        }
        if (x + z == y) {
            result = true;
        }
        if (y + z == x) {
            result = true;
        }
        return result;
    }

    // 3.7 Двойная сумма
    public static int sum2(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) {
            sum = 20;
        }
        return sum;
    }

    // 3.8 Тридцать пять
    public static boolean is35(int x) {
        boolean result = false;
        if ((x % 3 == 0) && (x % 5 != 0)) {
            result = true;
        }
        if ((x % 5 == 0) && (x % 3 != 0)) {
            result = true;
        }
        return result;
    }

    // 3.9 Волшебная шестерка
    public static boolean magic6(int x, int y) {
        boolean result = false;
        if (x == 6 || y == 6 || x + y == 6) {
            result = true;
        }
        if (x - y == 6 || y - x == 6) {
            result = true;
        }
        return result;
    }

    // 3.10 Возраст
    public static String age(int x) {
        String result = " лет";
        if (x % 10 == 1 && x != 11) {
            result = " год";
        }
        if ((x % 10 == 2 && x != 12) || (x % 10 == 3 && x != 13) || (x % 10 == 4 && x != 14)) {
            result = " года";
        }
        return x + result;
    }

    // 3.11 День недели
    public static String day(int x) {
        String result = switch (x) {
            case 1 -> "понедельник";
            case 2 -> "вторник";
            case 3 -> "среда";
            case 4 -> "четверг";
            case 5 -> "пятница";
            case 6 -> "суббота";
            case 7 -> "воскресенье";
            default -> "это не день недели";
        };
        return result;
    }

    // 3.12 Вывод дней недели
    public static void printDays(String x) {
        switch (x) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println();
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
        }
    }

    // 4.1 Числа подряд
    public static String listNums(int x) {
        String result = "";
        for (int i = 0; i <= x; i++) {
            result += i + " ";
        }
        return result.trim();
    }

    // 4.2 Числа наоборот
    public static String reverseListNums(int x) {
        String result = "";
        for (int i = x; i >= 0; i--) {
            result += i + " ";
        }
        return result.trim();
    }

    // 4.3 Четные числа
    public static String chet(int x) {
        String result = "";
        for (int i = 0; i <= x; i += 2) {
            result += i + " ";
        }
        return result.trim();
    }

    // 4.4 Степень числа
    public static int pow(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    // 4.5 Длина числа
    public static int numLen(long x) {
        int result = 0;
        do {
            x /= 10;
            result++;
        } while (x != 0);
        return result;
    }

    // 4.6 Одинаковость
    public static boolean equalNum(int x) {
        int prev, next;
        if (x / 10 == 0) {
            return true;
        }
        prev = x % 10;
        x /= 10;
        do {
            next = x % 10;
            if (prev != next) {
                return false;
            }
            x /= 10;
            prev = next;
        } while (x != 0);
        return true;
    }

    // 4.7 Квадрат
    public static void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }

    // 4.8 Левый треугольник
    public static void leftTriangle(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }

    // 4.9 Правый треугольник
    public static void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println(" ".repeat(x - i) + "*".repeat(i));
        }
    }

    // 4.10 Угадайка
    public static void guessGame() {
        int x, randomNum = 3, attempt = 0;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("What number am I thinking (0 to 9)? :");
        do {
            attempt++;
            x = sc.nextInt();
            if (x != randomNum) {
                System.out.println("No, try again");
            } else {
                System.out.println("Yes, it`s " + randomNum);
            }
        } while (x != randomNum);
        System.out.println("Количество использованных попыток: " + attempt);
    }

    // 5.1 Поиск первого значения
    public static int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }


    // 5.2 Поиск последнего значения
    public static int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // 5.3 Поиск максимального
    public static int maxAbs(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        int maxValue = arr[0];
        int maxAbsValue = Math.abs(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > maxAbsValue) {
                maxValue = arr[i];
                maxAbsValue = Math.abs(arr[i]);
            }
        }
        return maxValue;
    }

    // 5.4 Подсчет позитива
    public static int countPositive(int[] arr) {
        int countValue = 0;
        for (int elem : arr) {
            if (elem > 0) {
                countValue++;
            }
        }
        return countValue;
    }


    // 5.5 Палиндром
    public static boolean palindrom(int[] arr) {
        if (arr.length == 1) {
            return true;
        }
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    // 5.6 Реверс
    public static void reverse(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    // 5.7 Возвратный реверс
    public static int[] reverseBack(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[arr.length - 1 - i] = arr[i];
        }
        return result;
    }

    // 5.8 Объединение
    public static int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[i + arr1.length] = arr2[i];
        }
        return result;
    }

    // 5.9 Все вхождения
    public static int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        int[] result = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[j++] = i;
            }
        }
        return result;
    }

    //5.10 Удалить негатив
    public static int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                result[j++] = arr[i];
            }
        }
        return result;
    }

    //5.11 Добавление в массив
    public static int[] add(int[] arr, int x, int pos) {
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        result[pos] = x;
        for (int i = pos + 1; i < arr.length + 1; i++) {
            result[i] = arr[i - 1];
        }
        return result;
    }

    // 5.12 Добавление массива в массив
    public static int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        for (int i = pos; i < pos + ins.length; i++) {
            result[i] = ins[i - pos];
        }
        for (int i = pos + ins.length; i < arr.length + ins.length; i++) {
            result[i] = arr[i - ins.length];
        }
        return result;
    }
}