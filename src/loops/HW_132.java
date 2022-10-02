package loops;

/*
Вывести все нечетные числа от 100 до 1000, которые делятся на 5 без остатка
*/
public class HW_132 {
    public static void getNumbers() {
        for (int i = 100; i <= 1000; i++) {
            if (i % 2 != 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
