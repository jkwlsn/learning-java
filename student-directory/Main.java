public class Main {
    public static void main(String[] args) {
        // Student data
        String studentFirstName = "Jake";
        String studentSecondName = "Wilson";
        String studentFullName = studentFirstName + " " + studentSecondName; // Concatting strings
        int studentID = 1;
        int studentAge = 33;
        int maxScore = 500;
        int studentScore = 473;
        float studentScorePercentage = (float) studentScore / maxScore * 100.0f; // Cast the result of dividing two integers to a float.

        // Print variables
        System.out.println("Student name:  " + studentFullName);
        System.out.println("Student id:    " + studentID);
        System.out.println("Student age:   " + studentAge);
        System.out.println("Student score: " + studentScore);
        System.out.println("Percentage:    " + studentScorePercentage);
    }
}
