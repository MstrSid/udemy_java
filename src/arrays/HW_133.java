package arrays;

public class HW_133 {
    private int[] array1 = new int[900];
    private int[] array2 = new int[array1.length];

    public void initFirstArray() {
        for (int i = 0; i < this.array1.length; i++) {
            this.array1[i] = i + 100;
        }
    }

    public void initSecondArray() {
        for (int i = 0, j = array2.length - 1; i < this.array1.length; i++, j--) {
            this.array2[j] = this.array1[i];
        }
    }

    public void showArrayTwo() {
        for (int i : array2) {
            System.out.println(i);
        }
    }
}
