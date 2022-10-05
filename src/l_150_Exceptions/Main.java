package l_150_Exceptions;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        try {
            int b = 7 / a;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally block");
        }

        System.out.println("Hello");

        int[] array = {0, 1, 2, 3, 4};
        for (int i = 0; i <= 6; i++) {
            try {
                System.out.println(array[i]);
            } catch (IndexOutOfBoundsException e){
                System.out.println("Выход за пределы массива по индексу "+i+".");
            }

        }
    }
}
