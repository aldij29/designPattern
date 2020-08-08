public class cekBuku implements Buku {
    statusAdapter statusAdapter;

    @Override
    public void cek(String bukuType, String fileName) {

        //inbuilt support to play mp3 music files
        if(bukuType.equalsIgnoreCase("dipinjam") || bukuType.equalsIgnoreCase("tersedia")){
            statusAdapter = new statusAdapter(bukuType);
            statusAdapter.cek(bukuType, fileName);
        } else{
            System.out.println("Buku tidak ditemukan");
        }
    }
}
