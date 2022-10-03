package acces_modifiers;

public class Man {
    private final String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be > 0");
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void showInfo() {
        System.out.printf("Name: %s, age: %d\n", name, age);
    }
}
