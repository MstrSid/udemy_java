package oop_param_meth;

public class Rect {
    private double width;
    private double height;


    public void setDimens(double width, double height) {
        if (width > 0 && height > 0) {
            this.height = height;
            this.width = width;
        }
    }

    public double getPerimeter() {
        if (width > 0 && height > 0) {
            return (this.width + this.height) * 2;
        } else return -1;
    }

    public double getSquare() {
        if (width > 0 && height > 0) {
            return this.width * this.height;
        } else return -1;
    }
}
