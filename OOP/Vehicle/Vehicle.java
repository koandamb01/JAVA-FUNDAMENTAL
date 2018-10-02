public class Vehicle {
    private int numbeOfWheels;
    private String color;

    // Getter
    public int getNumberOfWheels() {
        return numbeOfWheels;
    }

    public String getColor() {
        return color;
    }

    // Setter
    public void setNumberOfWheels(int number) {
        numbeOfWheels = number;
    }

    public void setColor(String color) {
        this.color = color; // 1
    }
}