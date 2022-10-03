package box;

public class Box {
    private double width;
    private double height;
    private double length;

    public void setDimens(double width, double height, double length) {
        if (width > 0) {
            this.width = width;
        }
        if (height > 0) {
            this.height = height;
        }
        if (length > 0) {
            this.length = length;
        }

    }

    public double volume() {
        if (this.width > 0 && this.length > 0 && this.height > 0) {
            return width * height * length;
        } else return -1;

    }
}
