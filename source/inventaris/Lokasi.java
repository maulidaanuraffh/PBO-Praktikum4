public class Lokasi {
    private String kodeLokasi;
    private String namaLokasi;

    public Lokasi(String kodeLokasi, String namaLokasi) {
        this.kodeLokasi = kodeLokasi;
        this.namaLokasi = namaLokasi;
    }

    public String getKodeLokasi() {return kodeLokasi;}
    public String getNamaLokasi() {return namaLokasi;}

    public String getLokasi() {
        return "=== Data Lokasi ===\n"
        + "Kode        : " + kodeLokasi + "\n"
        + "Nama Lokasi : " + namaLokasi + "\n";
    }
}
