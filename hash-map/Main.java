import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Car> cars = new HashMap<String, Car>();

        Car car1 = new Car("Volkswagen","Beetle",Colour.YELLOW);
        Car car2 = new Car("Toyota","Hilux",Colour.RED);
        Car car3 = new Car("Mitsubishi","Evo VIII",Colour.BLUE);

        cars.put("Car1",car1);
        cars.put("Car2",car2);
        cars.put("Car3",car3);

        System.out.println("Using a for each loop");
        for (String car : cars.keySet()) {
            cars.get(car).output();
        }
    }
}
