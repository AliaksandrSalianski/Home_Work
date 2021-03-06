package homeWork_2.loops;

public class Loop1 {
    /**
     * Метод перемножает числа от 1 до числа (включительно) введенного через аргумент метода.
     * в случае переполнения выводится сообщение со значением до переполнения и при переполненнии
     * Используется только цикл
     */
    public static String multiplyWithCycle(int number) {
        StringBuilder str = new StringBuilder();
        long result = 1;
        if (!(number >= 0)) {
            System.out.println("wrong input");
        } else {
            long previousResult = 1;
            for (int i = 1; i <= number; i++) {
                previousResult *= i;
                if (previousResult < 0) {
                    System.out.println("With a value " + i + " overflow of \"long\" type = " + previousResult);
                    System.out.printf("Value before overflow at number %d = %d\n", i - 1, result);
                    return str + "\b = " + result;
                } else {
                    result *= i;
                    String multiplyOrEquals = i == number ? "=" + result : "*";
                    str.append(i).append(multiplyOrEquals);
                }
            }
        }
        return str.toString();
    }

    /**
     * Число положительное, максимум long:
     * Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
     * Используя рекурсию
     */
    // not print =result
    public static long multiplyWithRecursion(int number) {
        long result = 1;
        if (number < 0) {
            System.out.print("wrong input");
        }
        if (number < 1) {
            return result;
        }
        result = number * multiplyWithRecursion(number - 1);
        System.out.print(number + "*");
        return result;
    }

    public static void main(String[] args) {
        multiplyWithRecursion(10);
    }
}

