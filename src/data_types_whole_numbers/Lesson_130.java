package data_types_whole_numbers;

public class Lesson_130 {
    public static void main(String[] args) {
        int days = 1000;
        int lightSpeed = 300000;
        long distance = (long) days * 86400 * lightSpeed;

        System.out.println(distance);
    }
}
