public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello, world!");
        System.out.println("stringBox\nValue:\t" + stringBox.get());

        Box<Integer> numberBox = new Box<>();
        numberBox.set(999);
        System.out.println("numberBox\nValue:\t" + numberBox.get());
    }
}
