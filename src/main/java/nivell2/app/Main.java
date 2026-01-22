package nivell2.app;

import nivell2.model.AppointmentController;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("E, d 'de' MMMM 'de' yyyy");

        showDateTime();
        System.out.println();
        countDaysBetween(formatter2);
        modifyDate(formatter);
        System.out.println();

        LocalDateTime localDateTimeBefore = LocalDateTime.of(2020, Month.DECEMBER, 24, 23, 59, 59);
        LocalDateTime localDateTimeAfter = LocalDateTime.of(2028, Month.MARCH, 24, 23, 59, 59);
        System.out.println(formatter2.format(localDateTimeAfter) + " is before? " + beforeToday(localDateTimeAfter));
        System.out.println(formatter2.format(localDateTimeBefore) + " is before? " + beforeToday(localDateTimeBefore));

        AppointmentController appointmentController = new AppointmentController();
        appointmentController.scheduleDemo();
    }

    public static void showDateTime() {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
    }

    public static void countDaysBetween(DateTimeFormatter formatter2) {
        LocalDate startDate = LocalDate.of(2015, 3, 14);
        LocalDate endDate = LocalDate.of(2020, 12, 31);

        Period period = Period.between(startDate, endDate);
        System.out.println("The dates are: ");
        System.out.println(formatter2.format(startDate));
        System.out.println(formatter2.format(endDate));
        System.out.println("Period between dates: " + period.getYears() + " years " + period.getMonths() + " months " + period.getDays() + " days.\n");
    }

    public static void modifyDate(DateTimeFormatter formatter) {
        final int NUMBER_TO_OPERATE = 7;
        LocalDateTime date = LocalDateTime.now();

        System.out.println("ORIGINAL DATE { " + formatter.format(date) + " }");
        System.out.println("------------------");
        System.out.println("DAYS ADDED: " + formatter.format(date.plusDays(NUMBER_TO_OPERATE)));
        System.out.println("DAYS SUBTRACTED: " + formatter.format(date.minusDays(NUMBER_TO_OPERATE)));
        System.out.println("MONTHS ADDED: " + formatter.format(date.plusMonths(NUMBER_TO_OPERATE)));
        System.out.println("MONTHS SUBTRACTED: " + formatter.format(date.minusMonths(NUMBER_TO_OPERATE)));
        System.out.println("HOURS ADDED: " + formatter.format(date.plusHours(NUMBER_TO_OPERATE)));
        System.out.println("HOURS SUBTRACTED: " + formatter.format(date.minusHours(NUMBER_TO_OPERATE)));
    }

    public static boolean beforeToday(LocalDateTime date) {
        return date.isBefore(LocalDateTime.now());
    }
}