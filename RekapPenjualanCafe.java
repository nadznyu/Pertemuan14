import java.util.Scanner;

public class RekapPenjualanCafe {
    static String[] menu = { "Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan" };
    static int[][] cafe = new int[5][7];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inputPenjualan(cafe, menu, sc);
        dataPenjualan();
        menuMaks();
        rataRata(cafe, menu);
    }

    static int[][] inputPenjualan(int[][] cafe, String[] menu, Scanner input) {
        for (int i = 0; i < cafe.length; i++) {
            System.out.print("Menu " + menu[i]);
            System.out.println();
            for (int j = 0; j < cafe[i].length; j++) {
                System.out.print("Penjualan hari ke-" + (j + 1) + ": ");
                cafe[i][j] = input.nextInt();
            }
        }
        return cafe;
    }

    static void dataPenjualan() {
        System.out.println();
        System.out.println("=== DATA PENJUALAN ===");
        System.out.printf("%-20s", "Menu");
        for (int j = 0; j < cafe[0].length; j++) {
            System.out.printf("%8s", "Hari " + (j + 1));
        }
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");

        for (int i = 0; i < cafe.length; i++) {
            System.out.printf("%-20s", menu[i]);
            for (int j = 0; j < cafe[i].length; j++) {
                System.out.printf("%8d", cafe[i][j]);
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");
    }

    static void menuMaks() {
        int maksTotal = -1;
        int indexmenuMaks = -1;
        for (int i = 0; i < cafe.length; i++) {
            int total = 0;
            for (int j = 0; j < cafe[i].length; j++) {
                total += cafe[i][j];
            }
            if (total > maksTotal) {
                maksTotal = total;
                indexmenuMaks = i;
            }
        }
        System.out.println();
        System.out.println("=== MENU DENGAN PENJUALAN TERTINGGI ===");
        System.out.println("Menu: " + menu[indexmenuMaks]);
        System.out.println("Total Penjualan: " + maksTotal);
    }

    static int[][] rataRata(int[][] cafe, String[] menu) {
        System.out.println();
        System.out.println("=== RATA-RATA PENJUALAN ===");
        for (int i = 0; i < cafe.length; i++) {
            int total = 0;
            for (int j = 0; j < cafe[i].length; j++) {
                total += cafe[i][j];
            }
            double rataRata = total / cafe[i].length;
            System.out.println("Menu " + menu[i] + ": " + rataRata);
        }
        return cafe;
    }

}
