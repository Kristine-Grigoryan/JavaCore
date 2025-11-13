package homework.medicalCenter;

import java.time.LocalDateTime;

public class Patient   extends Person {
        private Doctor doctor;
        private  LocalDateTime  registerDateTime;


    @Override
    public String toString() {
        return "Patient{" +
                "phone='" + phone + '\'' +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", registerDateTime=" + registerDateTime +
                ", doctor=" + doctor +
                '}';
    }


    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public LocalDateTime getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(LocalDateTime registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    public Patient(String name, String surname, String phone, Doctor doctor, LocalDateTime registerDateTime) {
        super(name, surname, phone);
        this.doctor = doctor;
        this.registerDateTime = registerDateTime;








}

}


