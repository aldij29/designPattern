public class tidakDipinjam implements statusBuku{

    @Override
    public void tidakDipinjam(String fileName, String bukuType) {
        System.out.println("Buku: "+ fileName+", Status: "+ bukuType);
    }

    @Override
    public void dipinjam(String fileName, String bukuType) {
        //do nothing
    }
}
