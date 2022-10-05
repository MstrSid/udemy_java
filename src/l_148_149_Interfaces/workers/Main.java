package l_148_149_Interfaces.workers;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer("Alex");
        Programmer programmer2 = new Programmer("Nick");
        Programmer programmer3 = new Programmer("Bob");
        Cooker cooker1 = new Cooker("Ann");
        Cooker cooker2 = new Cooker("Max");
        Cooker cooker3 = new Cooker("Lina");
        Driver driver1 = new Driver("Hulk");
        Driver driver2 = new Driver("Andrew");
        Driver driver3 = new Driver("Mary");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(programmer1);
        employees.add(programmer2);
        employees.add(programmer3);
        employees.add(cooker1);
        employees.add(cooker2);
        employees.add(cooker3);
        employees.add(driver1);
        employees.add(driver2);
        employees.add(driver3);

        for (Employee employee : employees) {
            employee.voice();
        }

        ArrayList<Cookable> cookables = new ArrayList<>();
        cookables.add(cooker1);
        cookables.add(cooker2);
        cookables.add(cooker3);

        ArrayList<Programmable> programmables = new ArrayList<>();
        programmables.add(programmer1);
        programmables.add(programmer2);
        programmables.add(programmer3);

        ArrayList<Driveable> driveables = new ArrayList<>();
        driveables.add(driver1);
        driveables.add(driver2);
        driveables.add(driver3);

        for (Cookable cookable : cookables) {
            ((Employee) cookable).voice();
            cookable.cook();
        }

        for (Driveable driveable : driveables) {
            ((Employee) driveable).voice();
            driveable.drive();
        }

        for (Programmable programmable : programmables) {
            ((Employee) programmable).voice();
            programmable.programming();
        }
    }
}
