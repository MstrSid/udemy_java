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

    public Box(double side) {
        width = height = length = side;
    }

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(Box box) {
        this.width = box.width;
        this.height = box.height;
        this.length = box.length;
    }

    public Box(Box box1, Box box2) {
        this.width = box1.width + box2.width + 10;
        this.height = box1.height + box2.height + 10;
        this.length = box1.length + box2.length + 10;
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

    public void showVolume() {
        System.out.println(volume());
    }

    public int compare(Box box) {
        double thisVolume = volume();
        double anotherBoxVolume = box.volume();
        int result;
        if (thisVolume > anotherBoxVolume) {
            result = 1;
        } else if (thisVolume < anotherBoxVolume) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }

    public Box increaseBox(int i) {
        return new Box(height * i, width * i, length * i);
    }

    public Box boxFromTwoBoxes(Box box) {
        return new Box(height + box.height, width + box.width, length + box.length);
    }
}
