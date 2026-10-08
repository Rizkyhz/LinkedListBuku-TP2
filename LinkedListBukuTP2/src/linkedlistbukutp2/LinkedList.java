package linkedlistbukutp2;

public class LinkedList {

    private Node head;
    private int jumlahBuku;

    // Constructor
    public LinkedList() {
        head = null;
        jumlahBuku = 0;
    }

    // Menambahkan data buku di akhir Linked List
    
    public void tambahBuku(String kodeBuku, String judul, String penulis) {

        // Validasi kode buku maksimal 5 karakter
        if (kodeBuku.length() > 5) {
            System.out.println("Kode buku maksimal 5 karakter!");
            return;
        }

        // Membuat node baru
        Node baru = new Node(kodeBuku, judul, penulis);

        // Jika Linked List masih kosong
        if (head == null) {
            head = baru;
        } else {
            // Mencari node terakhir
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            // Menambahkan node baru di akhir
            current.next = baru;
        }

        jumlahBuku++;

        System.out.println("Data berhasil ditambahkan!");
    }

    /**
     * Menghapus data buku terakhir dari Linked List.
     */
    public void hapusBuku() {

        // Jika Linked List kosong
        if (head == null) {
            System.out.println("Tidak ada data untuk dihapus.");
            return;
        }

        // Jika hanya terdapat satu buku
        if (head.next == null) {
            head = null;
            jumlahBuku--;

            System.out.println("Buku terakhir berhasil dihapus.");
            return;
        }

        // Mencari node sebelum node terakhir
        Node current = head;

        while (current.next.next != null) {
            current = current.next;
        }

        // Menghapus node terakhir
        current.next = null;
        jumlahBuku--;

        System.out.println("Buku terakhir berhasil dihapus.");
    }

    /**
     * Mencari buku berdasarkan kode buku.
     */
    public void cariBuku(String kodeCari) {

        Node current = head;

        // Melakukan pencarian dari node pertama
        while (current != null) {

            if (current.kodeBuku.equalsIgnoreCase(kodeCari)) {

                System.out.println("\nBuku ditemukan:");
                System.out.println("Kode    : " + current.kodeBuku);
                System.out.println("Judul   : " + current.judul);
                System.out.println("Penulis : " + current.penulis);

                return;
            }

            current = current.next;
        }

        // Jika buku tidak ditemukan
        System.out.println("Buku tidak ditemukan.");
    }

    /**
     * Menampilkan seluruh data buku.
     */
    public void tampilkanBuku() {

        // Jika Linked List kosong
        if (head == null) {
            System.out.println("Daftar buku kosong.");
            return;
        }

        Node current = head;

        System.out.println("\n===== DAFTAR BUKU =====");

        // Menampilkan semua node dari awal sampai akhir
        while (current != null) {

            System.out.println(
                "Kode: " + current.kodeBuku
                + " | Judul: " + current.judul
                + " | Penulis: " + current.penulis
            );

            current = current.next;
        }

        // Menampilkan jumlah seluruh buku
        System.out.println("Total Buku: " + jumlahBuku);
    }
}