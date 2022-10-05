package l_148_149_Interfaces.anonym;

public class Director {
    public void force(Cookable cookable) {
        cookable.cook();
    }

    public void force(Counter counter, int months) {
        System.out.println(counter.report(months));
    }
}
