package okul_projesi;

public class OkulOgrenciOgretmenBilgileri {//pojo class

    //Ogretmen Bilgileri

    private String ogretmenAdSoayad;
    private String ogretmenId;
    private int ogretmenYas;
    private String ogretmenBrans;
    private int ogretmanSicilNo;

    //Ogrenci Bilgileri

    private String ogrenciAdSoyad;
    private String ogrenciId;
    private int ogrenciYas;
    private int ogrenciNumara;
    private int ogrenciSinif;

    public OkulOgrenciOgretmenBilgileri(String ogretmenAdSoayad, String ogretmenId, int ogretmenYas, String ogretmenBrans, int ogretmanSicilNo) {
        this.ogretmenAdSoayad = ogretmenAdSoayad;
        this.ogretmenId = ogretmenId;
        this.ogretmenYas = ogretmenYas;
        this.ogretmenBrans = ogretmenBrans;
        this.ogretmanSicilNo = ogretmanSicilNo;
    }

    public OkulOgrenciOgretmenBilgileri(String ogrenciAdSoyad, String ogrenciId, int ogrenciYas, int ogrenciNumara, int ogrenciSinif) {
        this.ogrenciAdSoyad = ogrenciAdSoyad;
        this.ogrenciId = ogrenciId;
        this.ogrenciYas = ogrenciYas;
        this.ogrenciNumara = ogrenciNumara;
        this.ogrenciSinif = ogrenciSinif;
    }

    public String getOgretmenAdSoayad() {
        return ogretmenAdSoayad;
    }

    public void setOgretmenAdSoayad(String ogretmenAdSoayad) {
        this.ogretmenAdSoayad = ogretmenAdSoayad;
    }

    public String getOgretmenId() {
        return ogretmenId;
    }

    public void setOgretmenId(String ogretmenId) {
        this.ogretmenId = ogretmenId;
    }

    public int getOgretmenYas() {
        return ogretmenYas;
    }

    public void setOgretmenYas(int ogretmenYas) {
        this.ogretmenYas = ogretmenYas;
    }

    public String getOgretmenBrans() {
        return ogretmenBrans;
    }

    public void setOgretmenBrans(String ogretmenBrans) {
        this.ogretmenBrans = ogretmenBrans;
    }

    public int getOgretmanSicilNo() {
        return ogretmanSicilNo;
    }

    public void setOgretmanSicilNo(int ogretmanSicilNo) {
        this.ogretmanSicilNo = ogretmanSicilNo;
    }

    public String getOgrenciAdSoyad() {
        return ogrenciAdSoyad;
    }

    public void setOgrenciAdSoyad(String ogrenciAdSoyad) {
        this.ogrenciAdSoyad = ogrenciAdSoyad;
    }

    public String getOgrenciId() {
        return ogrenciId;
    }

    public void setOgrenciId(String ogrenciId) {
        this.ogrenciId = ogrenciId;
    }

    public int getOgrenciYas() {
        return ogrenciYas;
    }

    public void setOgrenciYas(int ogrenciYas) {
        this.ogrenciYas = ogrenciYas;
    }

    public int getOgrenciNumara() {
        return ogrenciNumara;
    }

    public void setOgrenciNumara(int ogrenciNumara) {
        this.ogrenciNumara = ogrenciNumara;
    }

    public int getOgrenciSinif() {
        return ogrenciSinif;
    }

    public void setOgrenciSinif(int ogrenciSinif) {
        this.ogrenciSinif = ogrenciSinif;
    }


    @Override
    public String toString() {
        return "OkulOgrenciOgretmenBilgileri{" +
                ", ogrenciAdSoyad='" + ogrenciAdSoyad + '\'' +
                ", ogrenciId='" + ogrenciId + '\'' +
                ", ogrenciYas=" + ogrenciYas +
                ", ogrenciNumara=" + ogrenciNumara +
                ", ogrenciSinif=" + ogrenciSinif +
                '}';
    }
}

