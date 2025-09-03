public class Main {

    static void printFullName(String fname, String sname) {
        System.out.println(fname + " " + sname);
    }

    static void printFullNameReversed(String fname, String sname) {
        System.out.println(sname + " " + fname);
    }

    public static void main(String[] args) {
        String[][] names = {{"Jake","John"},{"Wilson","Smith"}};

        System.out.println("Full names\n");
        for (int i = 0; i < names.length; i++) {
            printFullName(names[0][i], names[1][i]);
        }

        System.out.println("\nFull names reversed\n");
        for (int i = 0; i < names.length; i++) {
            printFullNameReversed(names[0][i], names[1][i]);
        }
    }
}
