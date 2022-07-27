package homeWork_3.calcs.additional;

import homeWork_3.calcs.simple.CalculatorWithMathExtends;

/**
 * класс является наследником класса CalculatorWithMathExtends
 * содержит поле count
 * метод incrementCountOperation() увеличивающий count на 1
 * метод getCountOperation() возвращает значение count
 */
public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long count = 0;

    public void incrementCountOperation() {
        count++;
    }

    public long getCountOperation() {
        return count;
    }
}