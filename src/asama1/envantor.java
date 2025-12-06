package asama1;

import java.util.ArrayList;
/*
Envantor sınıfı, öğelerin (urun) listesini depolamak için bir konteyner görevi görür.
ArrayList kullanarak birden fazla urun nesnesini dinamik olarak tutar.
*/
public class envantor {
    // Oyuncunun sahip olduğu tüm öğeleri depolamak için liste
    private ArrayList<urun> urunler = new ArrayList<>();

    /*
      addUrun()
      - Envantere bir öğe ekler.
      - Öğe zaten mevcutsa (aynı isimde),
        sadece miktar eklenir.
      - Mevcut değilse, yeni bir öğe oluşturulur ve listeye eklenir.
    */
    public void addUrun(String ad, String tur, int qty) {
        // Aynı ada sahip bir öğenin zaten mevcut olup olmadığını arama
        for (urun it : urunler) {
            if (it.getAd().equalsIgnoreCase(ad)) {
                /* equalsIgnoreCase(), Java'da bir dizgi karşılaştırma yöntemidir ve şunları yapar:
                    -İki dizginin içeriğini karşılaştırır
                    -Büyük/küçük harf farklarını (büyük/küçük harfe duyarlı) yok sayar
                */
                it.setMiktar(it.getMiktar() + qty);
                System.out.println(qty + " adet " + ad + " eklendi.");
                return;
            }
        }
        // Bu isimde bir öğe yoksa → yeni bir tane oluştur
        urunler.add(new urun(ad, tur, qty));
        System.out.println(ad + " envantere eklendi!");
    }

    /*
removeUrun()
- Envanterdeki öğe sayısını azaltır.
- İstenen miktar stok miktarını aşarsa → başarısız olur (false döndürür).
- Azaltma işleminden sonra miktar = 0 ise → öğe listeden kaldırılır.
*/
    public boolean removeUrun(String ad, int qty) {
        for (urun it : urunler) {
            if (it.getAd().equalsIgnoreCase(ad)) {
                // Azaltmak için yeterli stok olup olmadığını kontrol edin
                if (it.getMiktar() >= qty) {
                    // Stokları azaltın
                    it.setMiktar(it.getMiktar() - qty);
                    // Stok bitmişse → öğeyi listeden kaldır
                    if (it.getMiktar() == 0) urunler.remove(it);
                    return true; // Başarıyla silindi
                }
            }
        }
        return false; // Başarısız, ürün bulunamadı veya stok yetersiz
    }
    /*
          showEnvantor()
          - Envanterdeki tüm öğeleri görüntüler.
          - Boşsa → "Envanter boş." mesajını görüntüler.
        */

    /*
      showEnvantor()
      - Envanterdeki tüm öğeleri görüntüler.
      - Boşsa → "Envanter boş." mesajını görüntüler.
    */
    public void showEnvantor() {
        System.out.println("\n--- Envanter ---");
        if (urunler.isEmpty()) {
            System.out.println("Envanter boş.");
        } else {
            for (urun it : urunler) System.out.println(it);
        }
    }
    /*
          hasUrun()
          - Envanterde belirli bir öğenin belirli bir miktarda mevcut olup olmadığını kontrol eder.
          - Üretim sürecinde kullanılır (iki malzeme gerektirir).
        */
    public boolean hasUrun(String name, int qty) {
        for (urun it : urunler) {
            if (it.getAd().equalsIgnoreCase(name) && it.getMiktar() >= qty) {
                return true; // Ürün mevcut ve miktarı yeterli
            }
        }
        return false; // Kullanılamıyor
    }
}

