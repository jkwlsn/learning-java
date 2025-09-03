public class Main {

    static String printFullName(String fname, String sname) {
        return fname + " " + sname;
    }

    static String printFullNameReversed(String fname, String sname) {
        return sname + " " + fname;
    }

    public static void main(String[] args) {
        String[][] names = {{"Jake","John"},{"Wilson","Smith"}};

        System.out.println("Full names\n");
        for (int i = 0; i < names.length; i++) {
            String fullName = printFullName(names[0][i], names[1][i]);
            System.out.println(fullName);
        }

        System.out.println("\nFull names reversed\n");
        for (int i = 0; i < names.length; i++) {
            String fullNameReversed = printFullNameReversed(names[0][i], names[1][i]);
            System.out.println(fullNameReversed);
        }
    }
}
