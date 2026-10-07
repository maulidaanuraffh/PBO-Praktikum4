public class BarangElektronik extends Barang {
    private String merek;
    private int daya; 
    
    public BarangElektronik(String kode, String nama, String merek, int daya) {
        super(kode, nama);
        this.merek = merek;
        this.daya  = daya;
    }

    public String getMerek() { return merek; }
    public int getDaya() { return daya;  }

    @Override
    public String toString() {
        return "BarangElektronik["
             + super.toString()         
             + ", merek=" + merek
             + ", daya="  + daya + "W]";
    }
}
