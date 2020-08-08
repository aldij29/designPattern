public class GetKategoriBuku {

    public Buku getBuku(String katBuku){
        if(katBuku == null){
            return null;
        }
        if(katBuku.equalsIgnoreCase("DONGENG")) {
            return new BukuDongeng();
        }
        else if(katBuku.equalsIgnoreCase("PELAJARAN")){
            return new BukuPelajaran();
        }
        else if(katBuku.equalsIgnoreCase("NOVEL")) {
            return new BukuNovel();
        }
        return null;
    }
}
