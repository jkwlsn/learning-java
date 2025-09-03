public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 15, 28, 121313131};
        for (int n : numbers) {
            fizzbuzz(n);
        }
    }

    public static void fizzbuzz(int number) {
        String output = "";

        if (number % 3 == 0) {
            output += "Fizz";
        }
        if (number % 5 == 0) {
            output += "Buzz";
        }
        System.out.println(number + " : " + output);
    }
}
