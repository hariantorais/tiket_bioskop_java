package com.harianto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kode, jam, nama, nomor;
        int harga = 30000, pilihFilm, pilihJam;
        Scanner input = new Scanner(System.in);
        Tiket user = new Tiket();

        System.out.println("=====================================");
        System.out.println("PEMESANAN TIKET BIOSKOP");
        System.out.println("Masukkan Nama :");
        nama = input.next();
        System.out.println("Masukkan Nomor Telpon:");
        nomor = input.next();

        user.setNama(nama);
        user.setTelepon(nomor);

        System.out.println("Pilihan Film :");
        System.out.println("1. Spiderman");
        System.out.println("2. Superman");
        System.out.println("3. Batman");
        System.out.println("Masukkan pilihan : ");
        pilihFilm = input.nextInt();
        if (pilihFilm == 1) {
            kode = "A23 - Spiderman";
        }
        else if (pilihFilm == 2) {
            kode = "A34 - Superman";
        }
        else {
            kode = "A25 - Batman";
        }

        System.out.println("Pilihan Jam Film : ");
        System.out.println("1. 15.00");
        System.out.println("2. 18.00");
        System.out.println("3. 20.00");
        System.out.println("Masukkan pilihan : ");
        pilihJam = input.nextInt();

        if (pilihJam == 1) {
            jam = "15.00";
        }
        else if (pilihJam == 2) {
            jam = "18.00";
        }
        else {
            jam = "20.00";
        }

        user.setKode(kode);
        user.setWaktu(jam);
        user.setHarga(harga);

        System.out.println("==============================================");
        System.out.println("==            PEMESANAN BERHASIL            ==");
        System.out.println("==============================================");
        System.out.println("Nama\t\t: " + user.getNama());
        System.out.println("Telpon\t\t: " + user.getTelpon());
        System.out.println("----------------------------------------------");
        System.out.println("Kode Film\t\t\t: " + user.getKode());
        System.out.println("Waktu\t\t\t: " + user.getWaktu());
        System.out.println("Harga Tiket\t\t\t: " + user.getHarga());
        System.out.println("==============================================");
        System.out.println("==             SELAMAT MENONTON             ==");
        System.out.println("==============================================\n");
    }
}