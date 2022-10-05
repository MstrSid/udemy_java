package l_152_Multithread;

public class HW {
    static boolean stop = false;

    public static void main(String[] args) {
        int number = (int) ((Math.random() * 100) + 1);

        Thread timer1 = new Thread(() -> {
            int time = 0;
            while (!stop) {
                System.out.println(time);
                time++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        Thread checkNumbers = new Thread(() -> {
            while (!stop) {
                int answer = (int) ((Math.random() * 100) + 1);
                if (answer == number) {
                    stop = true;
                    System.out.println("Answer is: " + answer);
                } else {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }

        });
        timer1.start();
        checkNumbers.start();
    }
}
