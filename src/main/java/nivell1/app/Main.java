package nivell1.app;

import nivell1.enums.Day;
import nivell1.enums.Level;
import nivell1.model.Task;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("Task04", Level.HIGH);
        Task task2 = new Task("Task05", Level.LOW);

        weekOrWeekend(Day.MONDAY);
        weekOrWeekend(Day.SATURDAY);

        System.out.println();

        task1.taskStatus();
        task2.taskStatus();

        System.out.println();

        task1.strToEnum();
        task2.strToEnum();
    }

    public static void weekOrWeekend(Day day) {
        if(day.equals(Day.SATURDAY) || day.equals(Day.SUNDAY)) {
            System.out.println(day + " es cap de setmana.");
        }else{
            System.out.println(day + " es laborable.");
        }
    }
}
