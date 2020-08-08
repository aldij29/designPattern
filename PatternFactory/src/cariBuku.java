/**
 *
 * NIM: 10116394
 * Nama: Aldi Jayadi
 */

import java.io.*;

public class cariBuku {
    public static void main(String[] args)throws IOException {
        GetKategoriBuku kategoriBuku = new GetKategoriBuku();

        System.out.print("Cari Buku berdasarkan Kategori (Pelajaran, Novel, Dongeng): ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String namaKat=br.readLine();

        Buku b = kategoriBuku.getBuku(namaKat);

        System.out.print("Daftar Buku Kategori : "+namaKat+"\n");
        b.getJudul();
        b.getPenerbit();
        b.getPengarang();
        b.printBuku();
    }
}
