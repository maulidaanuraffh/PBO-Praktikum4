public class Barang {

    public static final String BAGUS  = "BAGUS";
    public static final String RUSAK  = "RUSAK";
    public static final String HILANG = "HILANG";

    private String kode;
    private String nama;
    private String kondisi; 

    public Barang(String kode, String nama) {
        this.kode    = kode;
        this.nama    = nama;
        this.kondisi = BAGUS;
    }

    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public String getKondisi() { return kondisi; }

    public void tandaiRusak() {
        this.kondisi = RUSAK;
    }

    public void tandaiHilang() {
        this.kondisi = HILANG;
    }

    public void perbaiki() {
        this.kondisi = BAGUS;
    }

    @Override
    public String toString() {
        return "kode=" + kode
             + ", nama=" + nama
             + ", kondisi=" + kondisi;
    }
}
