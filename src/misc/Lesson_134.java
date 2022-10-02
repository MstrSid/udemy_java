package misc;

import java.util.Scanner;

public class Lesson_134 {
    public static void main(String[] args) {
        getMonths();
        getMonthFromNumber();
        HW_134.getTimeOfYear("Сентябрь");
    }

    private static void getMonths() {
        String[] months = {"январь", "февраль",
                "март", "апрель", "май",
                "июнь", "июль", "август",
                "сентябрь", "октябрь", "ноябрь",
                "декабрь"};

        String result = "";

        for (String month : months) {
            if (month.equals("декабрь")) {
                result += month + ".";
            } else {
                result += month + ", ";
            }
        }
        System.out.println(result);
    }

    private static void getMonthFromNumber() {
        String[] months = {"январь", "февраль",
                "март", "апрель", "май",
                "июнь", "июль", "август",
                "сентябрь", "октябрь", "ноябрь",
                "декабрь"};
        Scanner input = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int number = input.nextInt() - 1;

        if (number >= 0 && number < months.length - 1) {
            System.out.println(months[number]);
        } else {
            System.out.println("Такого месяца не существует.");
        }
    }
}
