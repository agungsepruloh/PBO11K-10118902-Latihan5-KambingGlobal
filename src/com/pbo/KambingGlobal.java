package com.pbo;

/**
 *
 * # Author
 * Nama : Agung Sepruloh
 * Kelas : PBO11K
 * NIM : 10118902
 * Deskripsi Program : Program ini berisi
 *
 */

public class KambingGlobal {

    // Variabel jumlahKambing menjadi variabel instance

    int jumlahKambing = 88;

    public void getJumlahKambing() {
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }

    public void tambahKambing() {
        jumlahKambing += 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }

    public static void main(String[] args) {
        KambingGlobal kambingSusu = new KambingGlobal();

        // Menampilkan jumlah kambing yang ada saat program pertama kali berjalan
        kambingSusu.getJumlahKambing();

        // Menambah satu kambing
        kambingSusu.tambahKambing();

        // Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
}
