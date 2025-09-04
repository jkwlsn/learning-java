public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello, world!");
        System.out.println("stringBox\nValue:\t" + stringBox.get());

        Box<Integer> numberBox = new Box<>();
        numberBox.set(999);
        System.out.println("numberBox\nValue:\t" + numberBox.get());

        Double[] doubleNums = {1.1,1.2,1.3};
        Stats<Double> doubleStats = new Stats<>(doubleNums);

        System.out.print("Array: ");
        for (Double dnum : doubleNums) {
        System.out.print(dnum + "\t");
        }
        System.out.println("\nAverage:\t" + doubleStats.average());
    }
}
