package nivell2.model;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AppointmentController {
    private List<Appointment> appointments;

    public AppointmentController() {
        this.appointments = new ArrayList<>();
    }

    public void scheduleDemo(){
        addAppointment(new Appointment("Gym", LocalDateTime.of(2025, 2, 10, 10, 10)));
        addAppointment(new Appointment("Footbal Match", LocalDateTime.of(2026, 4, 25, 10, 10)));
        addAppointment(new Appointment("Dentist", LocalDateTime.of(2026, 3, 12, 10, 10)));
        addAppointment(new Appointment("Doctor", LocalDateTime.of(2025, 1, 29, 10, 10)));
        addAppointment(new Appointment("Study", LocalDateTime.of(2026, 1, 30, 10, 10)));

        System.out.println();
        System.out.println("APPOINTMENTS SCHEDULED: ");
        appointments.forEach(System.out::println);
        System.out.println();
        List<Appointment> nextAppointments = appointments.stream()
                .filter(appointment -> appointment.getAppointmentDate().isAfter(LocalDateTime.now()))
                .toList();

        System.out.println("NEXT APPOINTMENTS: ");
        nextAppointments.forEach(System.out::println);
    }

    public void addAppointment(Appointment appointment) {
        this.appointments.add(appointment);
    }


}
