import java.util.Scanner;
public class LinearSearch23{
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukan elemen array ke-" + (i) + ": ");
            arr[i] = input.nextInt();
        }
        System.out.print("Masukkan key yang ingin dicari: ");
        int key = input.nextInt();
        boolean ditemukan = false; 
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Key ada di posisi indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Key tidak ditemukan.");
        }
        }
    }
