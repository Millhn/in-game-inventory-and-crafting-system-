import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        envantor inventory = new envantor();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Oyun İçi Envanter ve Crafting Sistemi ---");
            System.out.println("1- Envantere Öğe Ekle");
            System.out.println("2- Crafting Yap");
            System.out.println("3- Envanteri Görüntüle");
            System.out.println("0- Çıkış");
            System.out.print("Seçim: ");

            int choice = sc.next();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Öğe adı: ");
                String ad = sc.nextLine();
                System.out.print("Tür (Silah, Zırh, İksir...): ");
                String tur = sc.nextLine();
                System.out.print("Adet: ");
                int qty = sc.nextInt();
                inventory.addUrun(ad, tur, qty);

            } else if (choice == 2) {
                System.out.print("1. Öğe adı: ");
                String urun1 = sc.nextLine();
                System.out.print("2. Öğe adı: ");
                String urun2 = sc.nextLine();
                craftingSistemi.craftUrun(inventory, urun1, urun2);

            } else if (choice == 3) {
                inventory.showEnvantor();

            } else if (choice == 0) {
                System.out.println("Programdan çıkılıyor...");
                break;
            } else {
                System.out.println("Geçersiz seçim! Tekrar deneyin.");
            }
        }
        sc.close();
    }
}
