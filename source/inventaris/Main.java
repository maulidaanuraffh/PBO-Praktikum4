public class Main {
    public static void main(String[] args) {

        // ============================================================
        // BASE CASE Tugas Kelas: Inventaris Barang Kampus
        // ============================================================

        // 2 Lokasi
        Lokasi labKomputer = new Lokasi("L01", "Lab Komputer");
        Lokasi ruangKelas  = new Lokasi("L02", "Ruang Kelas 3A");

        // 2 Barang (tipe dasar, sebelum inheritance)
        Barang proyektor = new Barang("B01", "Proyektor Epson");
        Barang kursi     = new Barang("B02", "Kursi Kuliah");

        // 2 PencatatanInventaris
        PencatatanInventaris catatan1 = new PencatatanInventaris("INV-001", proyektor, labKomputer);
        PencatatanInventaris catatan2 = new PencatatanInventaris("INV-002", kursi, ruangKelas);

        System.out.println("=== DATA HASIL PENCATATAN INVENTARIS ===");
        System.out.println("--- Catatan 1 ---");
        catatan1.tampilInfo();
        System.out.println();
        System.out.println("--- Catatan 2 ---");
        catatan2.tampilInfo();
        System.out.println();

        // Tampilkan status sebelum dan sesudah behavior dijalankan
        System.out.println("=== STATUS BARANG SEBELUM DAN SESUDAH BEHAVIOR ===");
        System.out.println("Proyektor kondisi SEBELUM : " + proyektor.getKondisi());
        proyektor.tandaiRusak();
        System.out.println("Proyektor kondisi SESUDAH tandaiRusak()  : "
                + proyektor.getKondisi());
        proyektor.perbaiki();
        System.out.println("Proyektor kondisi SESUDAH perbaiki()     : "
                + proyektor.getKondisi());
        System.out.println();

        System.out.println("Kursi kondisi SEBELUM : " + kursi.getKondisi());
        kursi.tandaiHilang();
        System.out.println("Kursi kondisi SESUDAH tandaiHilang() : "
                + kursi.getKondisi());
        System.out.println();


        // ============================================================
        // MODUL 4 — INHERITANCE: Barang → BarangElektronik / BarangFurnitur
        // ============================================================

        // T4-01 — Object subclass dibuat melalui constructor
        // super() di setiap constructor menginisialisasi bagian Barang
        System.out.println("=== T4-01: Constructor Subclass + super() ===");

        BarangElektronik laptop   = new BarangElektronik(
                                        "E01", "Laptop Lenovo", "Lenovo", 65);
        BarangElektronik ac       = new BarangElektronik(
                                        "E02", "AC Ruangan", "Daikin", 900);
        BarangFurnitur   mejaDosen = new BarangFurnitur(
                                        "F01", "Meja Dosen", "Kayu Jati", "Coklat");
        BarangFurnitur   lemari   = new BarangFurnitur(
                                        "F02", "Lemari Arsip", "Besi", "Abu-abu");

        // Bukti bagian Barang terinisialisasi melalui super():
        // getNama(), getKode(), getKondisi() berasal dari Barang
        System.out.println("laptop.getNama()    → " + laptop.getNama());
        System.out.println("laptop.getKondisi() → " + laptop.getKondisi()); // BAGUS (default)
        System.out.println("ac.getKode()        → " + ac.getKode());
        System.out.println("mejaDosen.getNama() → " + mejaDosen.getNama());
        System.out.println();


        // T4-02 — Method warisan dipanggil dari object subclass
        // tandaiRusak(), tandaiHilang(), perbaiki(), getKondisi()
        // tidak ditulis di BarangElektronik/BarangFurnitur, tapi tetap bisa dipanggil
        System.out.println("=== T4-02: Inherited Method dari Subclass ===");
        System.out.println("laptop.getKondisi() sebelum  : " + laptop.getKondisi());
        laptop.tandaiRusak(); // tandaiRusak() diwarisi dari Barang
        System.out.println("laptop.getKondisi() sesudah tandaiRusak()  : "
                + laptop.getKondisi());
        laptop.perbaiki(); // perbaiki() diwarisi dari Barang
        System.out.println("laptop.getKondisi() sesudah perbaiki()     : "
                + laptop.getKondisi());
        System.out.println();

        System.out.println("lemari.getKondisi() sebelum  : " + lemari.getKondisi());
        lemari.tandaiHilang(); // tandaiHilang() diwarisi dari Barang
        System.out.println("lemari.getKondisi() sesudah tandaiHilang() : "
                + lemari.getKondisi());
        System.out.println();


        // T4-03 — Override toString() dipanggil
        // Java menjalankan versi toString() paling spesifik dari setiap object
        System.out.println("=== T4-03: Override toString() ===");
        System.out.println(laptop);    // → BarangElektronik.toString()
        System.out.println(ac);        // → BarangElektronik.toString()
        System.out.println(mejaDosen); // → BarangFurnitur.toString()
        System.out.println(lemari);    // → BarangFurnitur.toString()
        System.out.println();


        // T4-04 — super.toString() terlihat dalam output T4-03
        // Output BarangElektronik menyertakan kode/nama/kondisi dari Barang.toString()
        // Output BarangFurnitur juga menyertakan bagian yang sama
        System.out.println("=== T4-04: super.toString() dalam Output ===");
        System.out.println("Bukti: output T4-03 mengandung");
        System.out.println("  'kode=..., nama=..., kondisi=...'");
        System.out.println("  → bagian itu berasal dari super.toString() milik Barang");
        System.out.println("  → masing-masing subclass menambahkan atribut spesifiknya");
        System.out.println();


        // T4-05 — Encapsulation tetap terjaga pada hierarchy
        // Field private Barang tidak bisa diakses langsung dari subclass maupun Main
        // Baris berikut jika di-uncomment akan menyebabkan compiler error:
        // laptop.kode    = "X";    → error: kode has private access in Barang
        // laptop.kondisi = "RUSAK";→ error: kondisi has private access in Barang
        System.out.println("=== T4-05: Encapsulation pada Hierarchy ===");
        System.out.println("Field private Barang (kode, nama, kondisi)");
        System.out.println("tidak bisa diakses langsung dari BarangElektronik,");
        System.out.println("BarangFurnitur, maupun dari Main.");
        System.out.println("Subclass hanya bisa akses via getKode(), getNama(), getKondisi().");
        System.out.println();


        // T4-06 — Dua subclass menampilkan output berbeda
        System.out.println("=== T4-06: Dua Subclass, Behavior Berbeda ===");
        System.out.println("BarangElektronik : " + laptop);
        System.out.println("BarangFurnitur   : " + mejaDosen);
        System.out.println("→ toString() berbeda: Elektronik tampilkan merek+daya,");
        System.out.println("  Furnitur tampilkan material+warna");
        System.out.println();


        // T4-07 — Regression: PencatatanInventaris masih bisa pakai subclass
        // field "private Barang barang" di PencatatanInventaris
        // menerima BarangElektronik/BarangFurnitur karena is-a Barang
        System.out.println("=== T4-07: Regression — PencatatanInventaris + Subclass ===");

        Lokasi labElektro = new Lokasi("L03", "Lab Elektronika");
        Lokasi gudang     = new Lokasi("L04", "Gudang Sarana");

        PencatatanInventaris catatan3 =
                new PencatatanInventaris("INV-003", laptop,    labElektro);
        PencatatanInventaris catatan4 =
                new PencatatanInventaris("INV-004", ac,        labElektro);
        PencatatanInventaris catatan5 =
                new PencatatanInventaris("INV-005", mejaDosen, ruangKelas);
        PencatatanInventaris catatan6 =
                new PencatatanInventaris("INV-006", lemari,    gudang);

        System.out.println("--- INV-003 ---");
        catatan3.tampilInfo(); // laptop (BarangElektronik) → tampilInfo() tetap bekerja
        System.out.println();
        System.out.println("--- INV-004 ---");
        catatan4.tampilInfo(); // ac (BarangElektronik)
        System.out.println();
        System.out.println("--- INV-005 ---");
        catatan5.tampilInfo(); // mejaDosen (BarangFurnitur)
        System.out.println();
        System.out.println("--- INV-006 ---");
        catatan6.tampilInfo(); // lemari (BarangFurnitur, kondisi HILANG)
    }
}