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

- `simple-java-calculator/`: Direktori utama proyek.
  - `.git/`: Direktori Git untuk kontrol versi.
  - `.gitignore`: File yang menentukan file dan folder yang diabaikan oleh Git.
  - `.project`: File konfigurasi proyek untuk Eclipse IDE.
  - `.settings/`: Direktori konfigurasi untuk Eclipse IDE.
  - `pom.xml`: File konfigurasi Maven untuk manajemen proyek.
  - `README.md`: Dokumentasi proyek.
  - `src/`: Direktori sumber kode.
    - `main/`: Direktori kode utama.
      - `java/`: Direktori kode Java.
        - `com/example/`: Struktur paket untuk kelas-kelas Java.
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


## Project Folder Structure (Getting Started)
- `src/`: Berisi file kode sumber.
- `test/`: Berisi file unit test.
- `README.md`: Dokumentasi proyek.
- File dan folder lain yang khusus untuk proyek yang dihasilkan oleh IDE Anda.

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

```
simple-java-calculator
├─ .classpath
├─ .git
│  ├─ COMMIT_EDITMSG
│  ├─ config
│  ├─ description
│  ├─ FETCH_HEAD
│  ├─ HEAD
│  ├─ hooks
│  │  ├─ applypatch-msg.sample
│  │  ├─ commit-msg.sample
│  │  ├─ fsmonitor-watchman.sample
│  │  ├─ post-update.sample
│  │  ├─ pre-applypatch.sample
│  │  ├─ pre-commit.sample
│  │  ├─ pre-merge-commit.sample
│  │  ├─ pre-push.sample
│  │  ├─ pre-rebase.sample
│  │  ├─ pre-receive.sample
│  │  ├─ prepare-commit-msg.sample
│  │  ├─ push-to-checkout.sample
│  │  ├─ sendemail-validate.sample
│  │  └─ update.sample
│  ├─ index
│  ├─ info
│  │  └─ exclude
│  ├─ logs
│  │  ├─ HEAD
│  │  └─ refs
│  │     ├─ heads
│  │     │  ├─ bond
│  │     │  └─ main
│  │     └─ remotes
│  │        └─ origin
│  │           ├─ bond
│  │           ├─ HEAD
│  │           └─ main
│  ├─ objects
│  │  ├─ 02
│  │  │  └─ 0aeb1a1cf1916f6dac21775434a86a2f289e5c
│  │  ├─ 06
│  │  │  └─ 318460c550c3779f1a3cc2e029acfc6ac92969
│  │  ├─ 08
│  │  │  └─ c8dcf68b34a2196c2d326384685fb4d211cb84
│  │  ├─ 1c
│  │  │  └─ 6c3d1c8279942f41c53ec543fbc0dfca3d92bf
│  │  ├─ 27
│  │  │  ├─ 37f17cee3d8cb9f1cf9aa2b23da50b5478a4af
│  │  │  └─ 6478887b283e417d35fafafef8d0b590f83560
│  │  ├─ 29
│  │  │  └─ 64a41d3032eb939b2ba9bb69955de6a10dd56f
│  │  ├─ 36
│  │  │  └─ 49c0da702ba6fe08f22d300e595e36c0dac392
│  │  ├─ 51
│  │  │  └─ 6ff358a2cbe68faab3231ecdc3015e7ffe4a5e
│  │  ├─ 5b
│  │  │  └─ e7908b4c6072ef78c86bde8c0b8d4721d0eea0
│  │  ├─ 6b
│  │  │  └─ 3b1cb228aad8c83ff760acfdf35deb5e9ad6a3
│  │  ├─ 71
│  │  │  └─ 25b4a3b6688e3c9225c26d4ea54b68f0920802
│  │  ├─ 75
│  │  │  └─ 905957557fa2fdb6e09cea243eede1c9fe81e6
│  │  ├─ 7a
│  │  │  └─ 7604453da3c4809db8ab90a7235af2784e3807
│  │  ├─ 90
│  │  │  └─ b40d39d5f646faaa71798af8883f15f880dd16
│  │  ├─ ad
│  │  │  └─ 090706122f1ec054cc7e5f0e9b860b1880e354
│  │  ├─ ae
│  │  │  └─ 832127faeb48f222dba3694d11fa33346a1f10
│  │  ├─ b5
│  │  │  ├─ ca0896ae73786d726c3342572305a76bca0bf5
│  │  │  └─ f3e6926e4daa38bb303c8b63c699ebfc008613
│  │  ├─ c6
│  │  │  └─ c617f3a52ca70997d88a3a154a140d0f3c8cb3
│  │  ├─ c9
│  │  │  └─ d1e5535e31b3ff37379440cfca69944ca28ec5
│  │  ├─ dc
│  │  │  └─ 8a68df17cd610b18a8800492d76ae845537cdb
│  │  ├─ df
│  │  │  └─ 66b20f801f79dfd0a9a0b2afd5ad13fa9efee2
│  │  ├─ e5
│  │  │  └─ 55ff24bf68a53090e323d75090bbbc5d7abfdb
│  │  ├─ e6
│  │  │  └─ 86101be0348c65e6a8087c3581e71a952a2142
│  │  ├─ e7
│  │  │  └─ 9b04dbd86e0ef86c952d67abefd8fa712cad29
│  │  ├─ ed
│  │  │  └─ 119364bd615b58a27edd5771c2e1f14f4946be
│  │  ├─ ef
│  │  │  └─ 6317af17344d924b59fd7ae0c54aab2ee5cd4e
│  │  ├─ f8
│  │  │  └─ 97a7f1cb2389f85fe6381425d29f0a9866fb65
│  │  ├─ fc
│  │  │  └─ 247e281e21e51add6779e415fd16b618c2e17f
│  │  ├─ info
│  │  └─ pack
│  │     ├─ pack-efe2f105b01e824562459e18a284ab107f3b9f78.idx
│  │     ├─ pack-efe2f105b01e824562459e18a284ab107f3b9f78.pack
│  │     └─ pack-efe2f105b01e824562459e18a284ab107f3b9f78.rev
│  ├─ ORIG_HEAD
│  ├─ packed-refs
│  └─ refs
│     ├─ heads
│     │  ├─ bond
│     │  └─ main
│     ├─ remotes
│     │  └─ origin
│     │     ├─ bond
│     │     ├─ HEAD
│     │     └─ main
│     └─ tags
├─ .gitignore
├─ .project
├─ .settings
│  ├─ org.eclipse.jdt.apt.core.prefs
│  ├─ org.eclipse.jdt.core.prefs
│  └─ org.eclipse.m2e.core.prefs
├─ pom.xml
├─ README.md
└─ src
   ├─ main
   │  └─ java
   │     └─ com
   │        └─ example
   │           ├─ Calculator.java
   │           ├─ Compute.java
   │           ├─ Main.java
   │           └─ Validate.java
   └─ test
      └─ java
         ├─ CalculatorTest.java
         ├─ ComputeTest.java
         ├─ ValidateInputTest.java
         └─ ValidateTest.java

```