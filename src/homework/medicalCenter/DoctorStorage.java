package homework.medicalCenter;



public class DoctorStorage {

    private Doctor[] doctors = new Doctor[10];
    private int size = 0;


    public void add(Doctor doctor) {
        if (size == doctors.length) {
            extend();
        }
        doctors[size++] = doctor;
    }

    private void extend() {
        Doctor[] tmp = new Doctor[size + 10];
        System.arraycopy(doctors, 0, tmp, 0, size);
        doctors = tmp;
    }


    public void print() {
        int size = 0;
        for (int i = 0; i < size; i++) {
            System.out.println(doctors[i]);
        }
    }

    public boolean deleteByID(String ID) {
        Doctor doctor = getByID(ID);
        if (doctor != null) {
            System.out.println("Invalid index");
            return true;
        }
        return false;


    }

    private Doctor getByID(String id) {
        return null;
    }


    private Doctor searchgetByID(String ID) {
        Doctor doctor = searchgetByID(ID);
        if (doctor == null) {
            System.err.println("No doctor found with that ID");

        }
        return null;


    }
}
