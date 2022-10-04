package l_146_147_Inheritance.figure;

public class ColorRect extends Rect {
    private String color;

    public ColorRect(double sideOne, double sideTwo, String color) {
        super(sideOne, sideTwo);
        this.color = color;
    }

    public ColorRect(double side, String color) {
        super(side);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
