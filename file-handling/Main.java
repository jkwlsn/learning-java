import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException;

public class Main {

    public static void createFile(String filename) {
        try {
            File f = new File(filename);
            if (f.createNewFile()) {
                System.out.println("Filename: " + f.getName());
                System.out.println("File exists?: " + f.exists());
                System.out.println("File readable: " + f.canRead());
                System.out.println("File length: " + f.length());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public static void writeFile(String filename, String content) {
        try {
            FileWriter myWriter = new FileWriter(filename);
            myWriter.write(content);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void readFile(String filename) {
        try {
            File f = new File(filename);
            Scanner myReader = new Scanner(f);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

        public static void main(String[] args) {
            System.out.print("Input filename: ");
            Scanner input = new Scanner(System.in);
            String filename = input.nextLine();
            createFile(filename);

            System.out.print("Input content: ");
            String content = input.nextLine();
            writeFile(filename, content);

            System.out.println("File contents:");
            readFile(filename);
        }
    }
