package pbo1;

public class Kantor {
     // Atribut
    private String nama;
    private String lokasi;
    private int jumlahKaryawan;

    // Constructor
    public Kantor(String nama, String lokasi, int jumlahKaryawan) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.jumlahKaryawan = jumlahKaryawan;
    }

    // Accessor (getter)
    public String getNama() {
        return nama;
    }

    public String getLokasi() {
        return lokasi;
    }

    public int getJumlahKaryawan() {
        return jumlahKaryawan;
    }

    // Mutator (setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public void setJumlahKaryawan(int jumlahKaryawan) {
        this.jumlahKaryawan = jumlahKaryawan;
    }

    // Method untuk override
    public void tampilkanInfo() {
        System.out.println("Nama Kantor: " + nama);
        System.out.println("Lokasi: " + lokasi);
        System.out.println("Jumlah Karyawan: " + jumlahKaryawan);
    }
}