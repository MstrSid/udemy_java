package l_147_148_Interfaces.workers;

public class Driver extends Employee implements Driveable {
    public Driver(String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.println("Driver ride.");
    }
}
