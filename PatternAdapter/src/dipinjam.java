public class dipinjam implements statusBuku{

    @Override
    public void tidakDipinjam(String fileName, String bukuType) {
        //do nothing
    }

    @Override
    public void dipinjam(String fileName, String bukuType) {
        System.out.println("Buku: "+ fileName+", Status: "+ bukuType);
    }
}
