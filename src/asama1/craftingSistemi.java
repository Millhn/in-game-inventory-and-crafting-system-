package asama1;
/*
  craftingSiatemi sınıfı, envanterdeki iki öğeyi kullanarak
  zanaatkarlık işlemlerini gerçekleştirmek için kullanılır.
*/
public class craftingSistemi {
    /*
          craftItem()

              -Her iki malzemenin de envanterde olup olmadığını kontrol edin.
              - OgeVeritabani.craft() kullanarak malzemelerin kombinasyonunu eşleştirin.
              - Kombinasyon geçerliyse → üretim başarılıdır.
              - Malzemeleri kaldırın ve yeni ürünü envantere ekleyin.
        */
    public static void craftUrun(envantor inv, String urun1, String urun2) {
        // Her iki öğenin de envanterde mevcut olup olmadığını kontrol etme
        if (inv.hasUrun(urun1, 1) && inv.hasUrun(urun2, 1)) {
           // Zanaat veritabanına (eşya kombinasyonları) dayalı zanaat sonuçlarını arama
            String crafted = ogeVeritabani.craft(urun1, urun2);

            if (crafted != null) {
                // Kullanılan malzemelerin azaltılması
                inv.removeUrun(urun1, 1);
                inv.removeUrun(urun2, 1);
                // Oyuncu envanterine zanaat sonuçları ekleme
                inv.addUrun(crafted, "Üretilmiş", 1);

                System.out.println("Crafting başarılı → Yeni ürün: " + crafted);
            } else {
                // Zanaat veritabanında bulunamayan kombinasyon
                System.out.println("Bu iki öğe ile crafting yapılamaz!");
            }

        } else {
            // Yetersiz veya eksik malzeme
            System.out.println("Gerekli öğeler envanterde yok!");
        }
    }
}
