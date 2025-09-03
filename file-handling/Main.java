import java.io.File;

public class Main {
    public static void main(String[] args) {
        File f = new File("test_file.txt");
       System.out.println("Filename: " + f.getName());
       System.out.println("File exists?: " + f.exists());
       System.out.println("File readable: " + f.canRead());
       System.out.println("File length: " + f.length());
    }
}
