package constructors;

public class HW_138 {
    public static void main(String[] args) {
        Employee nick = new Employee("Nick", "IT", 5000);
        String info = nick.getInfo(5);
        System.out.println(info);
    }
}
