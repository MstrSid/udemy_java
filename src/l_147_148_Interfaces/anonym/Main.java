package l_147_148_Interfaces.anonym;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.force(new Cookable() {
            @Override
            public void cook() {
                System.out.println("Cooking");
            }
        });

        director.force(new Counter() {
            @Override
            public String report(int months) {
                return String.format("Report for %d months", months);
            }
        }, 10);
    }
}
