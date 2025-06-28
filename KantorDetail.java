
package pbo1;

public class KantorDetail extends Kantor {
    private final String[] divisi;

    public KantorDetail(String nama, String lokasi, int jumlahKaryawan, String[] divisi) {
        super(nama, lokasi, jumlahKaryawan);
        this.divisi = divisi;
    }

        // Override method
        @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Daftar Divisi:");
        for (String d : divisi) {
            System.out.println("- " + d);
        }
    }

    public String[] getDivisi() {
        return divisi;
    }
}