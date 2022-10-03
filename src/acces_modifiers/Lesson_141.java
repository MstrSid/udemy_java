package acces_modifiers;

public class Lesson_141 {
    public static void main(String[] args) {
        Man man = new Man("Ivan", 27);
        man.showInfo();
        man.setAge(28);
        man.showInfo();
    }
}
