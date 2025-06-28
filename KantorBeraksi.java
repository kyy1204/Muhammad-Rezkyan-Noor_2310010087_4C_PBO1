
package pbo1;

import java.util.Scanner;    

public class KantorBeraksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan nama kantor: ");
            String nama = input.nextLine();

            System.out.print("Masukkan lokasi kantor: ");
            String lokasi = input.nextLine();

            System.out.print("Masukkan jumlah karyawan: ");
            int jumlah = Integer.parseInt(input.nextLine());

            System.out.print("Berapa divisi yang ingin dimasukkan? ");
            int jmlDivisi = Integer.parseInt(input.nextLine());

            String[] divisi = new String[jmlDivisi];
            for (int i = 0; i < jmlDivisi; i++) {
                System.out.print("Divisi ke-" + (i + 1) + ": ");
                divisi[i] = input.nextLine();
            }

            // Membuat objek
            KantorDetail kantor = new KantorDetail(nama, lokasi, jumlah, divisi);

            // Menampilkan Data
            System.out.println("\n=== Data Kantor ===");
            kantor.tampilkanInfo();

            // Seleksi 
            if (kantor.getJumlahKaryawan() > 50) {
                System.out.println("Status: Kantor besar");
            } else {
                System.out.println("Status: Kantor kecil");
            }

        } catch (NumberFormatException e) {
            System.out.println("Input angka tidak valid!");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}