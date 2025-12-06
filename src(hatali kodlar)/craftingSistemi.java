

public class craftingSistemi {
    public static void craftUrun(envantor inv, String urun1, String urun2) {
        if (inv.hasUrun(urun1, 2) && inv.hasUrun(urun2, 2)) { 
            String crafted = ogeVeritabani.craft(urun1);
            if (crafted != null) {
                inv.removeUrun(urun1, 1);
                inv.removeUrun(urun2, 1);
                inv.addUrun(crafted, "Üretilmiş", 1);
                System.out.println("Crafting başarılı → Yeni ürün: " + crafted);
            } else {
                System.out.println("Bu iki öğe ile crafting yapılamaz!");
            }
        } else {
            System.out.println("Gerekli öğeler envanterde yok!");
        }
    }
}
