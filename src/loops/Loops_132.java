package loops;

public class Loops_132 {
    public static void main(String[] args) {
        //task1();
        //task2();
        HW_132.getNumbers();
    }

    private static void task1(){
        int i = 1000;
        while (i >= 0) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
            i--;
        }
    }

    private static void task2(){
        int count = 1;
        int sum = 0;
        while (count <= 100){
            sum += count;
            count++;
        }
        float avg = sum / (float) count;
        System.out.println(avg);

    }
}
