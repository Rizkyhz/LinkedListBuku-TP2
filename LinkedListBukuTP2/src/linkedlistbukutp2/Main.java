package linkedlistbukutp2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Membuat Scanner untuk menerima input pengguna
        Scanner input = new Scanner(System.in);

        // Membuat objek Linked List
        LinkedList daftarBuku = new LinkedList();

        int pilihan;

        // Menu program dijalankan berulang kali
        do {

            System.out.println();
            System.out.println("===== SISTEM DATA BUKU =====");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Lihat Semua Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    // Input data buku
                    System.out.print("Masukkan Kode Buku: ");
                    String kodeBuku = input.nextLine();

                    System.out.print("Masukkan Judul: ");
                    String judul = input.nextLine();

                    System.out.print("Masukkan Penulis: ");
                    String penulis = input.nextLine();

                    // Menambahkan buku ke Linked List
                    daftarBuku.tambahBuku(
                        kodeBuku,
                        judul,
                        penulis
                    );

                    break;

                case 2:
                    // Menghapus buku terakhir
                    daftarBuku.hapusBuku();
                    break;

                case 3:
                    // Input kode buku yang ingin dicari
                    System.out.print("Masukkan Kode Buku: ");
                    String kodeCari = input.nextLine();

                    // Melakukan pencarian buku
                    daftarBuku.cariBuku(kodeCari);
                    break;

                case 4:
                    // Menampilkan seluruh buku
                    daftarBuku.tampilkanBuku();
                    break;

                case 5:
                    // Keluar dari program
                    System.out.println("Program selesai.");
                    break;

                default:
                    // Jika pilihan menu tidak tersedia
                    System.out.println("Pilihan menu tidak tersedia.");
            }

        } while (pilihan != 5);

        // Menutup Scanner
        input.close();
    }
}




