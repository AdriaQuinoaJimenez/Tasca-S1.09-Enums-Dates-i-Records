package nivell2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        showDateTime();
        System.out.println();
        countDaysBetween();

    }

    public static void showDateTime() {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
    }

    public static void countDaysBetween() {
        LocalDate startDate = LocalDate.of(2015, 3, 14);
        LocalDate endDate = LocalDate.of(2020, 12, 31);

        Period period = Period.between(startDate, endDate);
        System.out.println("Period between dates: " + period.getYears() + " years " + period.getMonths() + " months " + period.getDays() + " days.");
    }

    public static void modifyDate() {
        LocalDate date = LocalDate.of(2015, 3, 14);

    }
}