public class Main {
    public static void main(String[] args) {
        int inputNumber = 25;
        String output = "";

        System.out.println("Your number is: " + inputNumber);

        if (inputNumber % 3 == 0) {
            output += "Fizz";
        }
        if (inputNumber % 5 == 0) {
            output += "Buzz";
        }
        System.out.println(output);
    }
}
