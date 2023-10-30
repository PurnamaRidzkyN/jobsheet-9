import java.util.Scanner;

public class ArrayRataNilai23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jumlah mahasiswa : ");
        int jmlMhs = input.nextInt();
        int[] nilaiMhs = new int[jmlMhs];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int lulus = 0;
        int tidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = input.nextInt();

            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                lulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                tidakLulus++;
            }
        }

        double rata2Lulus = totalLulus / lulus;
        double rata2TidakLulus = totalTidakLulus / tidakLulus;

        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);
    }
}
