package asama1;

public class ogeVeritabani {
    // Crafting için gereken malzemeler ve ürün eşleşmeleri
    //Craft yöntemi statiktir, yani bu sınıftan bir nesne oluşturmadan çağrılabilir.
    public static String craft(String urun1, String urun2) {
        if ((urun1.equalsIgnoreCase("Demir") && urun2.equalsIgnoreCase("Tahta")) ||
                (urun2.equalsIgnoreCase("Demir") && urun1.equalsIgnoreCase("Tahta"))) {
            return "Demir Kılıç";
        }

        if ((urun1.equalsIgnoreCase("Şişe") && urun2.equalsIgnoreCase("Bitki")) ||
                (urun2.equalsIgnoreCase("Şişe") && urun1.equalsIgnoreCase("Bitki"))) {
            return "Sağlık İksiri";
        }

        if ((urun1.equalsIgnoreCase("Bez") && urun2.equalsIgnoreCase("Deri")) ||
                (urun2.equalsIgnoreCase("Bez") && urun1.equalsIgnoreCase("Deri"))) {
            return "Hafif Zırh";
        }

        return null; // Eşleşme yok
    }
}

