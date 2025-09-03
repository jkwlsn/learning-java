public class Main {
    public static void main(String[] args) {
        fizzbuzz(3);
        fizzbuzz(5);
        fizzbuzz(15);
        fizzbuzz(28);
        fizzbuzz(1142421281);
;
    }

    public static void fizzbuzz(int number) {
        String output = "";

        if (number % 3 == 0) {
            output += "Fizz";
        }
        if (number % 5 == 0) {
            output += "Buzz";
        }
        System.out.println(output);
    }
}
