package mini_projects.hastaneprojesi;

public class Hasta extends VeriBankasi {
    private String name;
    private String surname;
    private int patientId;
    private Durum patientSituation;

    public Hasta() {
    }

    public Hasta(String name, String surname, int patientId) {
        this.name = name;
        this.surname = surname;
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public Durum getPatientSituation() {
        return patientSituation;
    }

    public void setPatientSituation(Durum patientSituation) {
        this.patientSituation = patientSituation;
    }

    @Override
    public String toString() {
        return "Hasta{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patientId='" + patientId + '\'' +
                ", patientSituation=" + patientSituation +
                '}';
    }
}