package okul_projesi;

import static okul_projesi.OkulSistemi.scanner;

public class Ogrenci {


    private String ogrenciAdSoyad;
    private String ogrenciId;
    private int ogrenciYas;
    private int ogrenciNumara;
    private int ogrenciSinif;

    public Ogrenci(String ogrenciAdSoyad, String ogrenciId, int ogrenciYas, int ogrenciNumara, int ogrenciSinif, int sinif) {
        this.ogrenciAdSoyad = ogrenciAdSoyad;
        this.ogrenciId = ogrenciId;
        this.ogrenciYas = ogrenciYas;
        this.ogrenciNumara = ogrenciNumara;
        this.ogrenciSinif = ogrenciSinif;

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
        return "Ogrenci{" +
                "ogrenciAdSoyad='" + ogrenciAdSoyad + '\'' +
                ", ogrenciId='" + ogrenciId + '\'' +
                ", ogrenciYas=" + ogrenciYas +
                ", ogrenciNumara=" + ogrenciNumara +
                ", ogrenciSinif=" + ogrenciSinif +
                '}';
    }


    public static void ogrenciEkle() {
        System.out.println("Ogrenci adi giriniz");
        String ogrenciAd = scanner.nextLine();

        System.out.println("Ogrenci soyadi giriniz");
        String ogrenciSoyad = scanner.nextLine();

        System.out.println("OgrenciId giriniz");
        int ogrenciId = scanner.nextInt();

        System.out.println("Ogrenci yas giriniz");
        int ogrenciYas = scanner.nextInt();

        System.out.println("Ogrenci numarasi griniz");
        int ogrenciNumara = scanner.nextInt();

        System.out.println("Ogrenci sinif giriniz");
        int ogrenciSinif = scanner.nextInt();

        Ogrenci ogrenci = new Ogrenci(ogrenciAd, ogrenciSoyad, ogrenciId, ogrenciYas, ogrenciNumara, ogrenciSinif);
        System.out.println(ogrenci);
    }

}






