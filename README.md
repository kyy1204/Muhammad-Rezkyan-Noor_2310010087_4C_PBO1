# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data kantor menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama kantor, lokasi, jumlah karyawan, dan daftar divisi, lalu menampilkan informasi lengkap tentang kantor tersebut, termasuk menentukan apakah kantor tergolong "besar" atau "kecil" berdasarkan jumlah karyawan.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Kantor`, `KantorDetail`, dan `KantorBeraksi` adalah contoh dari class.

```java
public class Kantor {
    ...
}

public class KantorDetail extends Kantor {
    ...
}

public class KantorBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `KantorDetail kantor = new KantorDetail(...);` adalah contoh pembuatan object.

```java
KantorDetail kantor = new KantorDetail(nama, lokasi, jumlahKaryawan, divisi);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `lokasi`, `jumlahKaryawan`, dan `divisi` adalah contoh atribut.

```java
private String nama;
private String lokasi;
private int jumlahKaryawan;
private String[] divisi;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Kantor` dan `KantorDetail`.

```java
public Kantor(String nama, String lokasi, int jumlahKaryawan) {
    this.nama = nama;
    this.lokasi = lokasi;
    this.jumlahKaryawan = jumlahKaryawan;
}

public KantorDetail(String nama, String lokasi, int jumlahKaryawan, String[] divisi) {
    super(nama, lokasi, jumlahKaryawan);
    this.divisi = divisi;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut.

```java
public void setNama(String nama) {
    this.nama = nama;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut.

```java
public String getNama() {
    return nama;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method.

```java
private String nama;
private String lokasi;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `KantorDetail` mewarisi `Kantor` dengan sintaks `extends`.

```java
public class KantorDetail extends Kantor {
    ...
}
```

9. **Polymorphism** dengan **Overriding** adalah saat method `tampilkanInfo()` diubah dalam class turunan agar bisa menampilkan informasi tambahan (divisi).

```java
@Override
public void tampilkanInfo() {
    super.tampilkanInfo();
    for (String d : divisi) {
        System.out.println("- " + d);
    }
}
```

10. **Seleksi** digunakan untuk membuat keputusan berdasarkan kondisi, seperti menentukan apakah kantor termasuk besar atau kecil.

```java
if (kantor.getJumlahKaryawan() > 50) {
    System.out.println("Status: Kantor besar");
} else {
    System.out.println("Status: Kantor kecil");
}
```

11. **Perulangan** digunakan untuk meminta input divisi dari user.

```java
for (int i = 0; i < jmlDivisi; i++) {
    divisi[i] = input.nextLine();
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` dan `System.out.println`.

```java
Scanner input = new Scanner(System.in);
System.out.print("Masukkan nama kantor: ");
```

13. **Array** digunakan untuk menyimpan daftar divisi kantor.

```java
String[] divisi = new String[jmlDivisi];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime, terutama pada saat menerima input dari user di class `KantorBeraksi`. Misalnya jika user memasukkan huruf padahal diminta angka.

```java
} catch (NumberFormatException e) {
    System.out.println("Input angka tidak valid!");
} catch (Exception e) {
    System.out.println("Terjadi kesalahan: " + e.getMessage());
} finally {
    input.close();
}
```

## Usulan nilai

|  No | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |    10   |
|  10 | Seleksi        |    5    |
|  11 | Perulangan     |    5    |
|  12 | IO Sederhana   |    10   |
|  13 | Array          |    15   |
|  14 | Error Handling |    15   |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Rezkyan Noor
NPM: 2310010087
