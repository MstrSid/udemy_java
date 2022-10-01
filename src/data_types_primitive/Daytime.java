package data_types_primitive;

public class Daytime {
    boolean isLate = false;
    boolean isGoodWeather = false;

    public void setData(int time, boolean isGoodWeather) {
        if (time >= 0 && time <= 23) {
            this.isLate = time >= 18 || time <= 5;
            this.isGoodWeather = isGoodWeather;
        }
    }

    public void whatToDo() {
        if (isLate) {
            System.out.println("Спать");
        }
        if (!isLate && isGoodWeather) {
            System.out.println("Гулять");
        }
        if (!isLate && !isGoodWeather) {
            System.out.println("Читать книгу");
        }
    }


}
