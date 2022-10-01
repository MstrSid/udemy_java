package data_types_primitive;

public class HW_Triangle {
    private double a = 0;
    private double b = 0;
    private double c = 0;

    public void setSides(double a, double b) {
        if (a > 0.0f && b > 0.0f) {
            this.a = a;
            this.b = b;
        }
    }

    public double getGipo() {
        if (a > 0.0f && b > 0.0f) {
            this.c = Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2));
            return this.c;
        } else {
            return 0;
        }
    }
}
