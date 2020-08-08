abstract class Buku {
    protected String judul;
    protected String namaPengarang;
    protected String penerbit;
    abstract void getJudul();
    abstract void getPengarang();
    abstract void getPenerbit();

    public void printBuku(){
        System.out.print("Judul: "+judul);
        System.out.print(", Pengarang: "+namaPengarang);
        System.out.print(", Penerbit: "+penerbit);
    }

}
