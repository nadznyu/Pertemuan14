import java.util.Scanner;

public class Kubus17 {

    static int volumeKubus(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }

    static int LpKubus(int angka, int sisi) {
        int Lpermukaan = 6 * (sisi * sisi);
        return Lpermukaan;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sisi, volume, Lpermukaan;
        System.out.print("Masukkan nilai sisi: ");
        sisi = input.nextInt();

        volume = volumeKubus(sisi);
        System.out.println("Volume kubus adalah: " + volume + " cm3");

        Lpermukaan = LpKubus(6, sisi);
        System.out.println("Luas Permukaan Kubus adalah: " + Lpermukaan + " cm2");
        input.close();

    }
}
