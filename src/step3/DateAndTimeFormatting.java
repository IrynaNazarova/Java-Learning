package step3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeFormatting {

    public static void main(String[] args) {
            System.out.println("Date:");
            LocalDate date = LocalDate.now();
            System.out.println(date);
            System.out.println(date.format(DateTimeFormatter.ofPattern("dd. MM. yyyy")));

            System.out.println("Time:");
            LocalTime time = LocalTime.of(13, 42, 5);
            System.out.println(time);
            System.out.println(time.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
            System.out.println(time.format(DateTimeFormatter.ofPattern("hh:mm:ss")));

            System.out.println("DateTime:");
            LocalDateTime dateTime = LocalDateTime.now();
            System.out.println(dateTime);
            System.out.println(dateTime.format(DateTimeFormatter.ofPattern("dd. MM. yyyy HH:mm:ss")));
    }
}

