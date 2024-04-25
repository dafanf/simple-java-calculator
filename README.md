# README

## Overview Project
Proyek ini adalah program kalkulator sederhana berbasis konsol yang diimplementasikan dalam bahasa Java. Ini memungkinkan pengguna untuk melakukan operasi aritmatika dasar seperti penambahan, pengurangan, perkalian, dan pembagian.

## Library yang dibutuhkan untuk Build (Build With)
Proyek ini dibangun menggunakan Java dan tidak memerlukan pustaka eksternal.

## Prerequisites
Untuk menjalankan proyek ini, pastikan Anda telah menginstal Java Development Kit (JDK) di sistem Anda.

## Installation
1. Clone repositori ke mesin lokal Anda.
2. Buka proyek di IDE Java pilihan Anda (misalnya IntelliJ IDEA, Eclipse).
3. Bangun proyek untuk mengompilasi kode.

## File Configuration
Tidak ada konfigurasi file khusus yang diperlukan. Struktur proyek diorganisir sebagai berikut:

## File Configuration
Tidak ada konfigurasi file khusus yang diperlukan. Struktur proyek diorganisir sebagai berikut:

## File Configuration
Tidak ada konfigurasi file khusus yang diperlukan. Struktur proyek diorganisir sebagai berikut:

```
simple-java-calculator/
├─ .git/
│  └─ (file dan folder Git lainnya)
├─ .gitignore
├─ .project
├─ .settings/
│  ├─ org.eclipse.jdt.apt.core.prefs
│  ├─ org.eclipse.jdt.core.prefs
│  └─ org.eclipse.m2e.core.prefs
├─ pom.xml
├─ README.md
└─ src/
   ├─ main/
   │  └─ java/
   │     └─ com/
   │        └─ example/
   │           ├─ Calculator.java
   │           ├─ Compute.java
   │           ├─ Main.java
   │           └─ Validate.java
   └─ test/
      └─ java/
         ├─ CalculatorTest.java
         ├─ ComputeTest.java
         ├─ ValidateInputTest.java
         └─ ValidateTest.java
```

- `.git/`: Direktori yang berisi file dan folder untuk kontrol versi Git, termasuk riwayat perubahan, cabang (branches), dan konfigurasi Git lainnya.
- `.gitignore`: File yang berisi daftar file dan folder yang diabaikan oleh Git saat melakukan pelacakan perubahan.
- `.project`: File konfigurasi proyek yang digunakan oleh lingkungan pengembangan Eclipse IDE.
- `.settings/`: Direktori yang berisi berbagai file konfigurasi untuk pengembangan menggunakan Eclipse IDE, seperti pengaturan kompiler dan pengintegrasian Maven.
  - `org.eclipse.jdt.apt.core.prefs`: Pengaturan prosesor anotasi (APT) untuk proyek Java.
  - `org.eclipse.jdt.core.prefs`: Pengaturan inti Java untuk proyek.
  - `org.eclipse.m2e.core.prefs`: Pengaturan untuk pengintegrasian Maven dalam proyek.
- `pom.xml`: File konfigurasi Maven yang digunakan untuk manajemen proyek, termasuk dependensi, plugin, dan konfigurasi Maven lainnya.

## Project Structure

- `src/`: Direktori utama yang berisi kode sumber proyek.
  - `main/`: Direktori kode sumber utama proyek.
    - `java/`: Direktori kode Java.
      - `com/`: Direktori root untuk struktur paket.
        - `example/`: Paket yang digunakan untuk kelas-kelas Java.
          - `Calculator.java`: Kelas yang mengimplementasikan logika kalkulator.
          - `Compute.java`: Kelas yang menangani operasi aritmatika.
          - `Main.java`: Kelas utama untuk menjalankan program.
          - `Validate.java`: Kelas untuk validasi input.
  - `test/`: Direktori unit test.
    - `java/`: Direktori unit test Java.
      - `CalculatorTest.java`: Unit test untuk kelas Calculator.
      - `ComputeTest.java`: Unit test untuk kelas Compute.
      - `ValidateInputTest.java`: Unit test untuk validasi input.
      - `ValidateTest.java`: Unit test untuk kelas Validate.

## How To Run Execution Testing
1. Buka proyek di IDE Anda.
2. Jalankan unit test yang terletak di direktori `test/`.
3. Unit test akan menjalankan berbagai skenario untuk memvalidasi fungsionalitas program kalkulator.

## Software Under Test
Perangkat lunak yang diuji adalah program kalkulator sederhana yang ditulis dalam bahasa Java. Ini melakukan operasi aritmatika dasar pada operan integer.

## Test Case
Test case mencakup skenario berikut:
- Kombinasi input valid untuk penambahan, pengurangan, perkalian, dan pembagian.
- Penanganan pembagian oleh nol.
- Kombinasi input tidak valid untuk operan dan operator.
- Kasus batas untuk validasi input.
- Penanganan kesalahan untuk operasi tidak valid.

## Author
- Dafa Nurul Fauziansyah
- Fariz Rahman Maulana
- Muhammad Deo Audha Rizki.

## Reference
Tidak ada referensi eksternal khusus yang digunakan dalam proyek ini.
