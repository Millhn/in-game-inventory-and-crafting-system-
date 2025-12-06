
import java.util.ArrayList;

public class envantor {
    private ArrayList<urun> urunler = new ArrayList<>();

    public void addUrun(String ad, String tur, int qty) {
        for (urun it : urunler) {
            if (it.getAd().equalsIgnoreCase(ad)) {
                it.setMiktar(it.getMiktar() + 1);
                System.out.println(qty + " adet " + ad + " eklendi.");
                return;
            }
        }
        urunler.add(new urun(ad, tur, qty));
        System.out.println(ad + " envantere eklendi!");
    }

    public boolean removeUrun(String ad, int qty) {
        for (urun it : urunler) {
            if (it.getAd().equalsIgnoreCase(ad)) {
                if (it.getMiktar() >= qty) {
                    it.setMiktar(it.getMiktar() - qty);
                    if (it.getMiktar() == 0) urunler.remove(it);
                    return true;
                }
            }
        }
        return false;
    }

    public void showEnvantor() {
        System.out.println("\n--- Envanter ---");
        if (urunler.isEmpty()) {
            System.out.println("Envanter boş.");
        } else {
            for (urun it : urunler) System.out.println(it.toStirng()); // <-- COMPILE ERROR: toStirng() typo
        }
    }

    public boolean hasUrun(String name, int qty) {
        for (urun it : urunler) {
            if (it.getAd().equalsIgnoreCase(name) && it.getMiktar() >= qty) {
                return true;
            }
        }
        return false;
    }
}
