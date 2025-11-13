package homework.medicalCenter;

public class PatientStorage {

    private Patient[] patients = new Patient[10];
    private int size = 0;
    private Doctor doctor;

    public void add(Patient patient) {
        if (size == patients.length) {
            extend();
        }
        patients[size++] = patient;
    }

    private void extend() {
        Patient[] tmp = new Patient[size + 10];
        System.arraycopy(patients, 0, tmp, 0, size);
        patients = tmp;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(patients[i]);
        }


    }


    public void searchDoctorByPatients() {
        for (int i = 0; i < size; i++) {
            if (patients[i].getDoctor().equals(doctor)) ;
            {
                System.out.println(patients[i]);

            }

        }
    }
}
