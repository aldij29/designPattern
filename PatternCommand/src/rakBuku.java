/**
 *
 * NIM: 10116394
 * Nama: Aldi Jayadi
 */

import java.util.*;

public class rakBuku {
    public static List produceRequests() {
        List<listRak> queue = new ArrayList<>();
        queue.add(new bukuEkonomi());
        queue.add(new bukuSejarah());
        queue.add(new bukuTeknik());
        queue.add(new bukuSeni());
        return queue;
    }

    public static void workOffRequests(List queue) {
        for (Object rakBuku : queue) {
            ((listRak)rakBuku).listRak();
        }
    }

    public static void main( String[] args ) {
        List queue = produceRequests();
        workOffRequests(queue);
    }
}
