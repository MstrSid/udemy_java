package overload;

public class HW_139 {
    public static void main(String[] args) {
        Monster monster1 = new Monster();
        Monster monster2 = new Monster(3);
        Monster monster3 = new Monster(3, 3);
        Monster monster4 = new Monster(3, 3, 3);

        monster1.info();
        monster2.info();
        monster3.info();
        monster4.info();
        System.out.println();

        monster1.voice();
        System.out.println();
        monster2.voice(2);
        System.out.println();
        monster4.voice(3, "Hello");
    }
}
