package asama1;
/*
  urun sınıfı,envanterdeki tek bir öğeyi/nesneyi temsil eder
  Alanlar: ad (öğenin adı), tür (öğenin türü), miktar (öğenin miktarı).
  Bu sınıf basittir (POJO - Plain Old Java Object).
*/
public class urun {
    private String ad;
    private String tur; // Silah, Zırh, İksir
    private int miktar;

    public urun(String ad, String tur, int miktar) {
        this.ad = ad;
        this.tur = tur;
        this.miktar = miktar;
    }
// getter, Öğe adı,Öğe turu, ve  Öğe miktari için  — ad alanına okuma erişimi sağlar

    public String getAd() { return ad; }
    public String getTur() { return tur; }
    public int getMiktar() { return miktar; }
    /*
          setter, Miktar ayarlayıcı — öğe sayısını değiştirmek istediğinizde kullanılır.
          Örnek: stok miktarını artırmak veya azaltmak.
        */
    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }
    /*
         toString() geçersiz kılma:
         Bu yöntem, bir nesne yazdırıldığında veya String olarak temsil edildiğinde çağrılır.
         Kullanılan biçim: "Ad (Tür) xMiktar"
         Örnek: "Demir (Malzeme) x2"
       */
    @Override
    public String toString() {
        return ad + " (" + tur + ") x" + miktar;
    }
}

