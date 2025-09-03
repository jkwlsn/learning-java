import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Unformatted datetime looks like:\t" + now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:m d-M-yy");

        String formattedDate = now.format(formatter);
        System.out.println("Formatted datetime looks like:\t\t" + formattedDate);
    }}
