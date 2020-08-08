public class statusAdapter implements Buku {

    statusBuku statusBuku;

    public statusAdapter(String bukuType){

        if(bukuType.equalsIgnoreCase("dipinjam") ){
            statusBuku = new dipinjam();

        }else if (bukuType.equalsIgnoreCase("tersedia")){
            statusBuku = new tidakDipinjam();
        }
    }

    @Override
    public void cek(String bukuType, String fileName) {

        if(bukuType.equalsIgnoreCase("dipinjam")){
            statusBuku.dipinjam(fileName, bukuType);
        }
        else if(bukuType.equalsIgnoreCase("tersedia")){
            statusBuku.tidakDipinjam(fileName, bukuType);
        }
    }
}
