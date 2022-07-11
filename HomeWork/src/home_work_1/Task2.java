package home_work_1;

public class Task2 {
    @SuppressWarnings("all")
    public static void foo() {
        //****** 2.1 ******
        int result = 5 + 2 / 8;
        /*
         1) 2/8 = 0.25;
         2) 5+0.25 = 5 (отбрасование дробной части т.к int)
        */
        //****** 2.2 ******
        result = (5 + 2) / 8;
        /*
         1) 5+2 = 7
         2) 7/8 = 0 (отбрасование дробной части т.к int)
        */
        //****** 2.3 ******
        int a = 2;
        result = (5 + a++) / 8;
        /*
         1)  5+2 = 7
         2)  7/8 = 0 (отбрасование дробной части т.к int)
         3)  result = 0;
         4)  a++
        */
        //****** 2.4 ******
        a = 2;
        int b = 8;
        result = (5 + a++) / --b;
        /*
         1)  5+2 = 7
         2)  8-1 = 7
         3)  7/7 = 1
         4)  result = 1
         5)  2++
         */
        //****** 2.5 ******
        a = 2;
        b = 8;
        result = (5 * 2 >> a++) / --b;
        /*
         1) 5*2 = 10
         2) 10 >> 2 = 2 равносильно дважды разделить 10 на 2 с отбрасыванием остатка
         3) --b
         4) 2/7 = 0 (отбрасование дробной части т.к int)
        */
        //****** 2.6
        a = 2;
        b = 8;
        result = (5 + 7 > 20 ? 68 : 22 * 2 >> a++) / --b;
        /*
         1) 5+7>20 == False
         2) т.к. Тернарный опператор - берем операнд из блока False
         3) 22 + 2 = 44
         4) 44 >> 2 = 11 равносильно дважды разделить 44 на 2 с отбрасыванием остатка
         5) --b
         6) 11/7 = 1
         7) result = 1
         8) a++
        */
        //****** 2.7 ******
        a = 2;
        b = 8;
        /*
         1) result = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> a++) / --b;
         2) ошибка компиляции , так как на месте блока "True" Тернарного оператора не может быть тип Boolean
         */
        //****** 2.8 ******
        boolean sayResult = 6 - 2 > 3 && 12 * 12 <= 119;
        /*
         1) 4 > 3
         2) true
         3) 144 < 119
         4) true && false
         5) sayResult = false
        */
        //-----------------  2.9
        sayResult = true && false;
        // false
    }
}