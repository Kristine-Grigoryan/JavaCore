package homework.medicalCenter;

public class Doctor extends Person {
    private String email;
    private String profesion;


    public Doctor(String name, String surname, String phone, String email, String profesion) {
        super(name, surname, phone);
        this.email = email;
        this.profesion = profesion;


    }

    @Override
    public String toString() {
        return "Doctor{" +
                "email='" + email + '\'' +
                ", profesion='" + profesion + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }


    public Object getID() {

        return null;
    }
}



