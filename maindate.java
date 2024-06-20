import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class maindate {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("Current date: " + currentDate);
        System.out.println("Current time: " + currentTime);
        System.out.println("Current date and time: " + currentDateTime);
    }
}