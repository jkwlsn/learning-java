public class Car {
    private String brand;
    private String type;
    private Colour colour;

    public Car(String brand, String type, Colour colour) {
        this.brand = brand;
        this.type = type;
        this.colour = colour;
    }

    public void output() {
        System.out.print(this.brand + "\t");
        System.out.print(this.type + "\t");
        System.out.println(this.colour);
    }
}
