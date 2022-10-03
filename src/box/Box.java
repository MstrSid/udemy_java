package box;

public class Box {
    private double width;
    private double height;
    private double length;

    public Box() {
        this.width = 1;
        this.height = 1;
        this.length = 1;
    }

    public Box(double side){
        width = height = length = side;
    }

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

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
        if (width > 0 && length > 0 && height > 0) {
            return width * height * length;
        } else return -1;

    }

    public void showVolume(){
        System.out.println(volume());
    }
}
