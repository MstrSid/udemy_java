package l_152_Multithread;

public class Main {
    static boolean isFive = false;

    public static void main(String[] args) {

        Thread timer1 = new Thread(() -> {
            int i = 0;
            while (true) {
                if (i < 10) {
                    System.out.println("0" + i);
                } else System.out.println(i);
                if (i == 5) {
                    isFive = true;
                }
                i++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread timer2 = new Thread(() -> {
            int i = 0;
            while (!isFive) {
                if (i < 10) {
                    System.out.println("0" + i);
                } else System.out.println(i);
                i++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        timer1.start();
        timer2.start();
    }
}
