public class PencatatanInventaris {
    private String kode;
    private Barang barang;
    private Lokasi lokasi;

    public PencatatanInventaris(String kode, Barang barang, Lokasi lokasi) {
        this.kode = kode;
        this.barang = barang;
        this.lokasi = lokasi;
    }

    public String getKode() {return kode;}
    public Barang getBarang() {return barang;}
    public Lokasi getLokasi() {return lokasi;}

    public void tampilInfo() {
        System.out.println("=== Hasil Pencatatan ===");
        System.out.println("Kode        : "+ kode);
        System.out.println("Nama Barang : "+ barang.getNama());
        System.out.println("Kondisi     : "+ barang.getKondisi());
        System.out.println("Lokasi      : "+ lokasi.getNamaLokasi());
        System.out.println("Detail Barang   : " + barang);
    }
}
