import java.util.Scanner;

public class Kafe17 {

    public static void Menu() {

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        double diskon = 0;

        if (kodePromo.equals("DISKON50")) {
            diskon = hargaTotal * 0.50;
            System.out.println("Anda mendapatkan diskon 50%");
        } else if (kodePromo.equals("DISKON30")) {
            diskon = hargaTotal * 0.30;
            System.out.println("Anda mendapatkan diskon 30%");
        } else {
            System.out.println("Tidak ada diskon yang diberikan");
        }

        return (int) (hargaTotal - diskon);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu();

        int totalHargaKeseluruhan = 0;

        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan (1-6): ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            sc.nextLine();
            System.out.print("Masukkan kode promo: ");
            String kodePromo = sc.nextLine();

            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);

            System.out.println("Harga untuk menu ini: Rp." + totalHarga);
            totalHargaKeseluruhan += totalHarga;

            System.out.print("Ingin memesan menu lain (ya/tidak): ");
            String menuLain = sc.nextLine();
            if (menuLain.equalsIgnoreCase("tidak")) {
                break;
            }

        }
        System.out.println("\n=========================================");
        System.out.println("Total keseluruhan pesanan Anda: Rp." + totalHargaKeseluruhan);

    }

}