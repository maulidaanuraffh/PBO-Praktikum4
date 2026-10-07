public class BarangFurnitur extends Barang {
    private String material;
    private String warna;

    public BarangFurnitur(String kode, String nama, String material, String warna) {
        super(kode, nama);
        this.material = material;
        this.warna = warna;
    }

    public String getMaterial() { return material; }
    public String getWarna() { return warna;    }

    @Override
    public String toString() {
        return "BarangFurnitur["
             + super.toString()        
             + ", material=" + material
             + ", warna="    + warna + "]";
    }
}
