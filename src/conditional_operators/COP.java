package conditional_operators;

import java.io.IOException;
import java.util.Scanner;

public class COP {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Сколько денег в кармане?");
        double cash = input.nextDouble();
        if (cash > 500.00f) {
            System.out.println("Пицца");
        } else if (cash < 100.00f && cash > 0.0f) {
            System.out.println("Доширак");
        } else if (cash < 0.0f) {
            System.out.println("Ничего");
        } else {
            System.out.println("Макароны");
        }
    }
}
