package l_144;

public class Main {
    public static void main(String[] args) {
        String s = "Это Иван, ему 34 года, его рост 166.3 см. Должность программист.";
        String name = s.substring(4, 8);
        int age = Integer.parseInt(s.substring(14, 16));
        double height = Double.parseDouble(s.substring(32, 37));
        String post = s.substring(52, s.length() - 1);
        Man ivan = new Man(name, post, age, height);

        System.out.printf("Name: %s, post: %s, age: %d, height: %.2f\n", ivan.getName(),
                ivan.getPost(), ivan.getAge(), ivan.getHeight());
    }
}
