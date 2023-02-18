package mini_projects.hastaneprojesi;

public class Durum extends VeriBankasi{
    private String Status;
    private boolean emergency;

    public Durum() {
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public boolean isEmergency() {
        return emergency;
    }

    public void setEmergency(boolean emergency) {
        this.emergency = emergency;
    }
}

