package constructors;

public class Employee {
    private String name;
    private String post;
    private double salary;

    public Employee(String name, String post, double salary) {
        this.name = name;
        this.post = post;
        this.salary = salary;
    }

    public String getInfo(int period) {
        if (period == 0) period = 1;
        double sumSalary = this.salary * period;
        return String.format("Name: %s,\n" +
                        "post: %s,\n" +
                        "salary: %.2f$,\n" +
                        "salary for period %d months - %.2f$",
                this.name, this.post, this.salary, period, sumSalary);
    }
}
