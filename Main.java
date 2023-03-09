package latihan_strukdat;

import java.util.ArrayList;

/**
 *
 * @author Rudi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<konsumsi> Listkonsumsi = new ArrayList<>();
       konsumsi<Makanan,Minuman> breakfast = new konsumsi<>();
       konsumsi<Makanan,Minuman> lunch = new konsumsi<>();
       Makanan roti = new Makanan ();
       roti.setnamahidangan("roti tawar");
       Minuman susu = new Minuman();
       susu.setnamahidangan("susu sapi");
       breakfast.setkonsumsi(roti, susu);
       Listkonsumsi.add(breakfast);
       Makanan nasi = new Makanan();
       nasi.setnamahidangan("nasi putih");
       Minuman air = new Minuman();
       air.setnamahidangan("air putih");
    }
    
}
