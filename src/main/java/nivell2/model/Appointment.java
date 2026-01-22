package nivell2.model;

import java.time.LocalDateTime;

public class Appointment {
    private String appointmentName;
    private LocalDateTime appointmentDate;

    public Appointment(String appointmentName, LocalDateTime appointmentDate) {
        this.appointmentName = appointmentName;
        this.appointmentDate = appointmentDate;
    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentName='" + appointmentName + '\'' +
                ", appointmentDate=" + appointmentDate +
                '}';
    }
}
