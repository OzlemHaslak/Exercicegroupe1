package araba_kiralama;

public class aracListesi { // Pojo class, depo class'i
    //kiralama bilgiler

    private String alinacakSehir;
    private String alinacakGun;
    private double alinacakSaati;
    private String teslimGunu;
    private double teslimSaati;

    // arac bigileri

    private String marka;
    private String model;
    private String yakitTuru;
    private String vites;
    private double gunlukKiralamaUcreti;

    public aracListesi() {

    }

    public aracListesi(String alinacakSehir, String alinacakGun, double alinacakSaati, String teslimGunu, double teslimSaati) {
        this.alinacakSehir = alinacakSehir;
        this.alinacakGun = alinacakGun;
        this.alinacakSaati = alinacakSaati;
        this.teslimGunu = teslimGunu;
        this.teslimSaati = teslimSaati;
    }

    public aracListesi(String marka, String model, String yakitTuru, String vites, double gunlukKiralamaUcreti) {
        this.marka = marka;
        this.model = model;
        this.yakitTuru = yakitTuru;
        this.vites = vites;
        this.gunlukKiralamaUcreti = gunlukKiralamaUcreti;
    }

    @Override
    public String toString() {
        return "aracListesi{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yakitTuru='" + yakitTuru + '\'' +
                ", vites='" + vites + '\'' +
                ", gunlukKiralamaUcreti=" + gunlukKiralamaUcreti +
                '}';
    }

    public String getAlinacakSehir() {
        return alinacakSehir;
    }

    public void setAlinacakSehir(String alinacakSehir) {
        this.alinacakSehir = alinacakSehir;
    }

    public String getAlinacakGun() {
        return alinacakGun;
    }

    public void setAlinacakGun(String alinacakGun) {
        this.alinacakGun = alinacakGun;
    }

    public double getAlinacakSaati() {
        return alinacakSaati;
    }

    public void setAlinacakSaati(double alinacakSaati) {
        this.alinacakSaati = alinacakSaati;
    }

    public String getTeslimGunu() {
        return teslimGunu;
    }

    public void setTeslimGunu(String teslimGunu) {
        this.teslimGunu = teslimGunu;
    }

    public double getTeslimSaati() {
        return teslimSaati;
    }

    public void setTeslimSaati(double teslimSaati) {
        this.teslimSaati = teslimSaati;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakitTuru() {
        return yakitTuru;
    }

    public void setYakitTuru(String yakitTuru) {
        this.yakitTuru = yakitTuru;
    }

    public String getVites() {
        return vites;
    }

    public void setVites(String vites) {
        this.vites = vites;
    }

    public double getGunlukKiralamaUcreti() {
        return gunlukKiralamaUcreti;
    }

    public void setGunlukKiralamaUcreti(double gunlukKiralamaUcreti) {
        this.gunlukKiralamaUcreti = gunlukKiralamaUcreti;
    }
}


