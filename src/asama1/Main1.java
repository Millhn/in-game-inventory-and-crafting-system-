package asama1;

import asama1.craftingSistemi;
import asama1.envantor;
import java.util.Scanner; // Kullanıcıdan girdi okumak için


public class Main1 {
    public static void main(String[] args) {
        // Envanter nesnesi oluşturma → tüm oyuncu öğelerini depolamak için bir yer
        envantor inventory = new envantor();
        // Klavye girişi için tarayıcı
        Scanner sc = new Scanner(System.in);

        // Menüyü sürekli görüntülemek için sonsuz döngü
        while (true) {
            System.out.println("\n--- Oyun İçi Envanter ve Crafting Sistemi ---");
            System.out.println("1- Envantere Öğe Ekle");
            System.out.println("2- Crafting Yap");
            System.out.println("3- Envanteri Görüntüle");
            System.out.println("0- Çıkış");
            System.out.print("Seçim: ");

            int choice = sc.nextInt(); // Kullanıcı menü numarasını seçer
            sc.nextLine(); // Bir sonraki girişin kaçırılmaması için satır sonunu kaldırın

            if (choice == 1) {
                System.out.print("Öğe adı: ");
                String ad = sc.nextLine();
                System.out.print("Tür (Silah, Zırh, İksir...): ");
                String tur = sc.nextLine();
                System.out.print("Adet: ");
                int qty = sc.nextInt();
                // Envantere öğe eklemek için işlevi çağırma
                inventory.addUrun(ad, tur, qty);

            } else if (choice == 2) {
                System.out.print("1. Öğe adı: ");
                String urun1 = sc.nextLine();
                System.out.print("2. Öğe adı: ");
                String urun2 = sc.nextLine();
                // İşleme hazırlığı (işleme tarifi veritabanını kontrol etme)
                craftingSistemi.craftUrun(inventory, urun1, urun2);

            } else if (choice == 3) {
                inventory.showEnvantor();

            } else if (choice == 0) {
                System.out.println("Programdan çıkılıyor...");
                break; // While döngüsünü durdur → program bitti
            }
            // Kullanıcı 0-3 dışındaki bir sayı seçerse
            else {
                System.out.println("Geçersiz seçim! Tekrar deneyin.");
            }
        }
        // İşlem bittikten sonra tarayıcıyı kapatma
        sc.close();
    }
}
