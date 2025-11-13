package homework.medicalCenter;

import java.util.Scanner;

public class MedicalDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static DoctorStorage doctorStorage = new DoctorStorage();
    private static PatientStorage patientStorage  = new PatientStorage();
    private static Object Commands;


    public static void main(String[] args) {


        boolean isRun = true;

        while (isRun) {

            CommandsMed.ComandsMed();
           String commands= scanner.nextLine();
            switch (commands) {
                case "EXIT":
                    isRun = false;
                    break;
                case "ADD_DOCTOR":
                    addDoctor();
                    break;
                case "SEARCH_DOCTOR_BY_PROFESION":
                    addDoctor();
                    break;
                case "DELETE_DOCTOR_BY_ID":
                    doctorStorage.print();
                    break;
                case "CHANGE_DOCTOR_BY_ID":
                    doctorStorage.print();
                    break;
                case "ADD_PATIENT":
                    patientStorage.searchDoctorByPatients();
                    break;
                case "PRINT_ALL_PATIENTS_BY_DOCTOR":
                    System.out.println("Please input all patients by doctor");
                    String keyword = scanner.nextLine();
                    doctorStorage.print();
                    break;
                case "PRINT_ALL_PATIENTS":
                    System.out.println("Please found all patients");
                    break;
                default:
            }
        }
    }



        private static void addDoctor() {
            System.out.println("Please imput doctors's name");
            String name = scanner.nextLine();
            System.out.println("Please imput doctors's surname");
            String surname = scanner.nextLine();
            System.out.println("Please imput doctors's email");
            String email = scanner.nextLine();
            System.out.println("Please imput doctors's by phone number");
            String phoneNumber = scanner.nextLine();
            System.out.println("Please imput doctor's  prafession");
            String profesion = scanner.nextLine();
            Doctor doctor = new Doctor(name, surname, email,profesion, phoneNumber);
            doctorStorage.add(doctor);
            System.out.println("Doctor added succesfuuly!!");

        }

        private static void addPatients() {
            System.out.println("Please input  by add patients");
            patientStorage.print();
            String patients  = scanner.nextLine();




        }

    }






