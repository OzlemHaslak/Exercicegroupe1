package mini_projects.hastaneprojesi;

public class Hastane extends VeriBankasi {

    //Doktor doktor = new Doktor();

    Doctor doktor = new Doctor();
    Hasta  hasta = new Hasta();

    public Doctor getDoktor() {
        return doktor;
    }

    public void setDoktor(Doctor doktor) {
        this.doktor = doktor;
    }

    public Hasta getHasta() {
        return hasta;
    }

    public void setHasta(Hasta hasta) {
        this.hasta = hasta;
    }
}




