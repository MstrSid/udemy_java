package oopintro;

public class Human {
    private String name;
    private int age;
    private double weight;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        if (!name.equals("")) {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if(age>0 && age<120){
            this.age = age;
        }
    }

    public void setWeight(double weight) {
        if(weight> 2.0f && weight<250.0){
            this.weight = weight;
        }
    }

    public void getInfo() {
        System.out.printf("Name: %s, age: %d, weight: %f", this.name, this.age, this.weight);
    }
}
