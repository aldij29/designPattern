/**
 *
 * NIM: 10116394
 * Nama: Aldi Jayadi
 */

public class listPeminjamanBuku {
    public static void main(String[] args) {
        cekBuku tersedia = new cekBuku();

        tersedia.cek("dipinjam", "Nanti Kita Cerita tentang Hari Ini");
        tersedia.cek("tersedia", "Dongeng Anak Nusantara");
        tersedia.cek("dipinjam", "Komunikasi Bisnis");
        tersedia.cek("dipinjam", "Tokyo dan Perayaan Kesedihan");
    }
}
