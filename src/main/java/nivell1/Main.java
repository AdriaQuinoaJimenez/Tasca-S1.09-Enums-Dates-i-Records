package nivell1;

public class Main {
    public static void main(String[] args) {
        weekOrWeekend();

    }

    enum Day {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

    public static void weekOrWeekend() {
        System.out.println(Day.MONDAY.toString());
    }
}
