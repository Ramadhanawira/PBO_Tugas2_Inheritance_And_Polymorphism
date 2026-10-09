# PBO-Inheritance And Polymorphism

## Deskripsi Program

Program ini merupakan latihan Pemrograman Berorientasi Objek (PBO) menggunakan bahasa pemrograman Java. Program menerapkan konsep *inheritance* (pewarisan) untuk merepresentasikan beberapa bangun geometri, yaitu bentuk umum, bujur sangkar, lingkaran, dan silinder.

Class `Bentuk` menjadi class induk yang menyimpan informasi warna. Class `BujurSangkar` dan `Lingkaran` mewarisi class `Bentuk`, sedangkan class `Silinder` mewarisi class `Lingkaran`.

Program juga menggunakan konsep *method overriding* untuk menampilkan informasi sesuai dengan jenis bangun yang dibuat. Selain itu, program melakukan perhitungan luas bujur sangkar, luas lingkaran, dan volume silinder.

## Tujuan Pembelajaran

- Memahami konsep *class* dan *object* dalam Java.
- Memahami penerapan *inheritance* atau pewarisan.
- Menggunakan constructor untuk menginisialisasi objek.
- Memahami penggunaan `super()` untuk memanggil constructor class induk.
- Menerapkan *method overriding* menggunakan anotasi `@Override`.
- Menggunakan method getter dan setter untuk mengakses serta mengubah atribut.
- Menghitung luas bujur sangkar, luas lingkaran, dan volume silinder.

## Struktur File

Program ini terdiri dari lima file Java dengan fungsi sebagai berikut.

| File | Fungsi |
|---|---|
| `Bentuk.java` | Class induk yang menyimpan informasi warna dan menyediakan method `printInfo()`. |
| `BujurSangkar.java` | Class turunan dari `Bentuk` yang menyimpan panjang sisi dan menghitung luas bujur sangkar. |
| `Lingkaran.java` | Class turunan dari `Bentuk` yang menyimpan jari-jari dan menghitung luas lingkaran. |
| `Silinder.java` | Class turunan dari `Lingkaran` yang menyimpan tinggi dan menghitung volume silinder. |
| `Main.java` | Class utama untuk membuat objek dan menjalankan program. |

## Konsep PBO yang Digunakan

### 1. Inheritance (Pewarisan)

Inheritance memungkinkan suatu class mewarisi atribut dan method dari class lain.

Dalam program ini:
- `BujurSangkar` mewarisi `Bentuk`.
- `Lingkaran` mewarisi `Bentuk`.
- `Silinder` mewarisi `Lingkaran`.

Pewarisan ditulis menggunakan kata kunci `extends`.

### 2. Constructor dan `super()`

Constructor digunakan untuk memberikan nilai awal pada objek. Pada class turunan, `super()` digunakan untuk memanggil constructor class induk.

Contohnya, constructor `Silinder` memanggil constructor `Lingkaran` menggunakan `super(radius, warna)`, kemudian menginisialisasi tinggi silinder.

### 3. Method Overriding

Method overriding dilakukan ketika class turunan menyediakan implementasi baru dari method yang diwarisi.

Dalam program ini, method `printInfo()` ditulis ulang pada class `BujurSangkar`, `Lingkaran`, dan `Silinder` agar setiap objek dapat menampilkan informasi yang sesuai dengan jenis bangunnya.

### 4. Encapsulation

Class `BujurSangkar`, `Lingkaran`, dan `Silinder` menggunakan atribut `private` untuk menyimpan sisi, jari-jari, dan tinggi. Getter dan setter disediakan untuk membaca atau mengubah nilai atribut tersebut.

Pada class `Bentuk`, atribut `warna` menggunakan akses `public`, sehingga belum sepenuhnya menerapkan encapsulation pada atribut tersebut.

### 5. Perhitungan Geometri

Program menggunakan rumus berikut:

- **Luas bujur sangkar:** sisi × sisi
- **Luas lingkaran:** π × jari-jari × jari-jari
- **Volume silinder:** luas alas × tinggi

Nilai π pada class `Lingkaran` menggunakan konstanta `Math.PI`.

## Alur Kerja Program

Program dijalankan melalui method `main()` pada class `Main`.

1. Membuat objek `Bentuk` dengan warna Pink.
2. Membuat objek `BujurSangkar` dengan sisi 5 dan warna Jingga.
3. Membuat objek `Lingkaran` dengan jari-jari 7 dan warna Kuning.
4. Membuat objek `Silinder` dengan tinggi 10, jari-jari 7, dan warna Hitam.
5. Memanggil method `printInfo()` pada setiap objek untuk menampilkan informasi dan hasil perhitungan.

## Hasil Program

Berdasarkan kode pada `Main.java`, keluaran program secara berurutan adalah:

```text
Bentuk berwarna Pink
Bujursangkar berwarna Jingga, luas = 25.0
Lingkaran Kuning, luas = 153.93804002589985
Silinder warna Hitam, volume = 1539.3804002589986
```

Hasil tersebut diperoleh dari nilai yang diberikan pada setiap objek:
- Bujur sangkar memiliki sisi 5, sehingga luasnya adalah 5 × 5 = 25.
- Lingkaran memiliki jari-jari 7, sehingga luasnya adalah π × 7 × 7.
- Silinder memiliki jari-jari 7 dan tinggi 10, sehingga volumenya adalah π × 7 × 7 × 10.

Angka desimal yang panjang muncul karena hasil perhitungan menggunakan tipe data `double` dan nilai π dari `Math.PI`.

## Cara Menjalankan Program

Pastikan Java Development Kit (JDK) sudah terpasang pada komputer.

1. Simpan kelima file Java dalam satu folder.
2. Pastikan nama file utama adalah `Main.java`.
3. Buka terminal atau Command Prompt pada folder tersebut.
4. Kompilasi seluruh file dengan perintah berikut:

```bash
javac Bentuk.java BujurSangkar.java Lingkaran.java Silinder.java Main.java
```

5. Jalankan program menggunakan perintah:

```bash
java Main
```

## Kesimpulan

Program ini menunjukkan penerapan konsep dasar Pemrograman Berorientasi Objek menggunakan Java, khususnya inheritance dan method overriding. Melalui hubungan pewarisan antara class `Bentuk`, `BujurSangkar`, `Lingkaran`, dan `Silinder`, program dapat mengelola informasi warna serta melakukan perhitungan sesuai dengan jenis bangun. Program ini menjadi dasar untuk memahami hubungan antarclass dan pengembangan program berorientasi objek yang lebih kompleks.
