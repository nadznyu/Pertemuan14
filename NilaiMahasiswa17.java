import java.util.Scanner;

public class NilaiMahasiswa17 {

    static void isianArray(int[] arr, int N, Scanner input) {
        for (int i = 0; i < N; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
    }

    static void tampilArray(int[] arr, int N) {
        System.out.println("\nDaftar nilai Mahasiswa: ");
        for (int i = 0; i < N; i++) {
            System.out.println("Mahasiswa " + (i + 1) + ": " + arr[i]);
        }
    }

    static int hitTot(int[] arr, int N) {
        int total = 0;
        for (int i = 0; i < N; i++) {
            total += arr[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah Mahasiswa (N): ");
        int N = input.nextInt();

        int[] nilai = new int[N];

        isianArray(nilai, N, input);
        tampilArray(nilai, N);

        int totalNilai = hitTot(nilai, N);

        System.out.println("\nTotal nilai seluruh Mahasiswa = " + totalNilai);

        input.close();
    }

}
