package misc;

public class HW_134 {

    public static void getTimeOfYear(String month) {
        switch (month.toLowerCase()) {
            case "декабрь":
            case "январь":
            case "февраль":
                System.out.println("Зима");
                break;
            case "март":
            case "апрель":
            case "май":
                System.out.println("Весна");
                break;
            case "июнь":
            case "июль":
            case "август":
                System.out.println("Лето");
                break;
            case "сентябрь":
            case "октябрь":
            case "ноябрь":
                System.out.println("Осень");
                break;
            default:
                System.out.println("Нет такого месяца");
        }
    }
}
