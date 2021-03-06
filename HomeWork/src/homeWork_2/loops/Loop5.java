package homeWork_2.loops;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Loop5 {
    /**
     * Метод находит наибольшую цифру натурального числа полученную через Scanner.Вводится только целочисленное число в случае неверного ввода пишется сообщение.
     * Число переводится в массив char, первоночалньное значение max - это элеменнт в нулевой ячейки. Поэлементно сравнивается  при помощи цикла с каждым значением в массиве.
     * Максимальное значение сохраняется в переменную max
     */

    public static void findMaxNumber() {
        int enterNumber = 0;
        System.out.println("Enter integer number");
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong input");
        } else {
            enterNumber = scanner.nextInt();
            String str = enterNumber + "";
            char[] array = str.toCharArray();
            int max = 0;
            for (int i = 1; i < array.length; i++) {
                max = Character.getNumericValue(array[0]);
                if (Character.getNumericValue(array[i]) > max) {
                    max = Character.getNumericValue(array[i]);
                }
            }
            System.out.printf("Max number in %d = %d", enterNumber, max);
            scanner.close();
        }
    }

    /**
     * Метод выводит процент четных случайных чисел из количества введенного пользователем через Scanner.Консоль принимает только
     * целочисленные значения, в случае ошибки выводится сообщение о неверном вводе.
     */

    public static void randomCheck() {
        System.out.println("enter the number of random numbers");
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("wrong input");
        } else {
            int countEnter = scanner.nextInt();
            int result = 0;
            Random random = new Random();
            int count = countEnter;
            while (count != 0) {
                int randomInt = random.nextInt();
                if (randomInt % 2 == 0) {
                    result++;
                }
                count--;
            }
            int percentageResult = (int) (result * 1.0 / countEnter * 100);
            System.out.printf("Probability of getting even numbers = %d%% during generation %d random numbers", percentageResult, countEnter);
        }
        scanner.close();
    }

    /**
     * Метод принимает через Scanner  только целые числа в случае неверного ввода выдается ошибка.
     * Метод считает четные и нечетные цифры числа путем представления числа в виде массива char и прохождением по массиву циклом.
     * Количество четных  переменная "eventCount"
     * Количество нечетных  переменная "oddCount"
     */

    public static int[] countEvenAndOdd() {
        int eventCount = 0;
        int oddCount = 0;
        int enterNumber;
        System.out.println("Enter number integer");
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("wrong input");
            return new int[0];
        } else {
            enterNumber = scanner.nextInt();
            String str = enterNumber + "";
            char[] arrayOfChar = str.toCharArray();
            for (char c : arrayOfChar) {
                if (Character.getNumericValue(c) % 2 == 0) {
                    eventCount++;
                } else {
                    oddCount++;
                }
            }
            System.out.printf("In number %d \nevent = %d\n  \rodd = %d\t\n", enterNumber, eventCount, oddCount);
        }
        scanner.close();
        return new int[]{eventCount, oddCount};
    }

    /**
     * метод принимает от пользователя только целое число в случае неверного ввогда выводится сообщение об ошибки.
     * в консоль выводятся числа Фибоначи количеством введенного значения пользователем.При помощи масссива и цикла.
     */

    public static String fibWithArray() {
        System.out.println("Enter integer number");
        String result = "Fib :";
        int number;
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong input");
        } else {
            number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Wrong input number < 0");
                return result;
            }
            System.out.println("Number = " + number);
            if (number == 0) {
                return result;
            } else if (number == 1) {
                return result + number;
            } else {
                long[] arrayFib = new long[number];
                arrayFib[0] = 1;
                arrayFib[1] = 2;
                for (int j = 2; j <= arrayFib.length - 1; j++) {
                    arrayFib[j] = arrayFib[j - 1] + arrayFib[j - 2];
                }
                scanner.close();
                result += Arrays.toString(arrayFib);
            }
        }
        return result;
    }

    /**
     * метод принимает от пользователя только целое число в случае неверного ввогда выводится сообщение об ошибки.
     * в консоль выводятся числа Фибоначи количеством введенного значения пользователем. При помощи только цикла.
     */

    public static String fibWithFor() {
        String result = "Fib :";
        int number = 0;
        System.out.println("Enter integer number");
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong input");
        } else {
            number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Wrong input number < 0 ");
                return result;
            }
            System.out.println("Number = " + number);
            int numberOne = 0;
            int numberTwo = 1;
            int helper = 0;
            switch (number) {
                case (0):
                    return result;
                case (1):
                    return result + number;
                default:
                    for (int i = 0; i < (number); i++) {
                        helper = numberTwo + numberOne;
                        numberOne = numberTwo;
                        numberTwo = helper;
                        result += helper + " ";
                    }
            }
            scanner.close();
        }
        return result;
    }

    /**
     * Метод возврощает ряд натуральных чисел от min до max c шагом step при помощи цикла. Все значения
     * переменных целочисленные и
     * вводятся через Scanner.В случае неверного ввода выводится сообщение.
     */

    public static String stepOutput() {
        int max;
        int min;
        int step;
        String wrong = "wrong input";
        String result = "By step: ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter max");
        if (scanner.hasNextInt()) {
            max = scanner.nextInt();
        } else {
            return wrong;
        }
        System.out.println("Enter min");
        if (scanner.hasNextInt()) {
            min = scanner.nextInt();
        } else {
            return wrong;
        }
        System.out.println("Enter step");
        if (scanner.hasNextInt()) {
            step = scanner.nextInt();
        } else {
            return wrong;
        }
        for (int i = min; i <= max; i += step) {
            result += i + " ";
        }
        scanner.close();
        return result;
    }

    /**
     * метод формирует из введенного числа через Scanner обратное по порядку входящих в него цифр и выводит на экран.
     * Введенное число только целочисленное в случае ошибки выводится сообщение.Число преобразуется в массив и обратным
     * циклом выводятся элементы на экран
     */

    public static String numberFlip() {
        String reversStr = "";
        System.out.println("Enter integer number");
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong input");
        } else {
            number = scanner.nextInt();
        }
        String str = Integer.toString(number);
        char[] arrayOfChar = str.toCharArray();
        for (int i = arrayOfChar.length - 1; i >= 0; i--) {
            reversStr += arrayOfChar[i];
        }
        scanner.close();
        return reversStr;
    }
}



