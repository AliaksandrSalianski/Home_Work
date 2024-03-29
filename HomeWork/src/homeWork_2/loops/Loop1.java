package homeWork_2.loops;

public class Loop1 {
    /**
     * Метод перемножает числа от 1 до числа (включительно) введенного через аргумент метода.
     * в случае переполнения выводится сообщение
     * Используется только цикл
     */
    public String multiplyWithCycle(int number) {
        StringBuilder str = new StringBuilder();
        long result = 1;
        if (!(number >= 0)) {
            return "wrong input";
        } else {
            long previousResult = 1;
            for (int i = 1; i <= number; i++) {
                previousResult *= i;
                if (previousResult < 0) {
                    return "overflow";
                } else {
                    result *= i;
                    String multiplyOrEquals = i == number ? "=" + result : "*";
                    str.append(i).append(multiplyOrEquals);
                }
            }
        }
        return str.toString();
    }

}

