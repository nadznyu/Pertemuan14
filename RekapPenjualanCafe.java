import java.util.Scanner;

public class RekapPenjualanCafe {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jmlMenu = input.nextInt();
        System.out.print("Jumlah hari penjualan cafe: ");
        int jmlHari = input.nextInt();
        input.nextLine();

        String[] menu = new String[jmlMenu];
        int[][] penjualan = new int[jmlMenu][jmlHari];

        inputPenjualan(penjualan, menu, input);
        dataPenjualan(penjualan, menu);
        menuMaks(penjualan, menu);
        rataRata(penjualan, menu);

        input.close();
    }

    static int[][] inputPenjualan(int[][] penjualan, String[] menu, Scanner input) {
        int jmlMenu = menu.length;
        int jmlHari = penjualan[0].length;

        System.out.println("\n=== INPUT PENJUALAN ===");
        for (int i = 0; i < jmlMenu; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            menu[i] = input.nextLine();

            for (int j = 0; j < jmlHari; j++) {
                System.out.printf("Penjualan Hari ke-%d: ", (j + 1), menu[i]);
                penjualan[i][j] = input.nextInt();
            }
            input.nextLine();

        }
        return penjualan;
    }

    static void dataPenjualan(int[][] penjualan, String[] menu) {
        int jmlMenu = menu.length;
        int jmlHari = penjualan[0].length;

        System.out.println("\n=== DATA PENJUALAN ===");
        System.out.printf("%-20s", "Menu");
        for (int j = 0; j < jmlHari; j++) {
            System.out.printf("%8s", "Hari " + (j + 1));
        }
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");

        for (int i = 0; i < jmlMenu; i++) {
            System.out.printf("%-20s", menu[i]);
            for (int j = 0; j < jmlHari; j++) {
                System.out.printf("%8d", penjualan[i][j]);
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");
    }

    static void menuMaks(int[][] penjualan, String[] menu) {
        int jmlMenu = menu.length;
        int jmlHari = penjualan[0].length;

        int maksTotal = -1;
        int indexMaks = 0;

        for (int i = 0; i < jmlMenu; i++) {
            int total = 0;
            for (int j = 0; j < jmlHari; j++) {
                total += penjualan[i][j];
            }
            if (total > maksTotal) {
                maksTotal = total;
                indexMaks = i;
            }
        }
        System.out.println();
        System.out.println("=== MENU DENGAN PENJUALAN TERTINGGI ===");
        System.out.println("Menu: " + menu[indexMaks]);
        System.out.println("Total Penjualan: " + maksTotal);
    }

    static void rataRata(int[][] penjualan, String[] menu) {
        int jmlMenu = menu.length;
        int jmlHari = penjualan[0].length;

        System.out.println("\n=== RATA-RATA PENJUALAN MENU ===");
        for (int i = 0; i < jmlMenu; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < jmlHari; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double rataRata = (double) totalPenjualan / jmlHari;
            System.out.printf("Rata-rata penjualan menu %s: %.1f%n", menu[i], rataRata);
        }
    }

}
