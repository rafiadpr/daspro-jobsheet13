
import java.util.Scanner;

public class HitungTotalHarga23 {

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            hargaTotal *= 0.5; // Diskon 50%
            System.out.println("Selamat! Anda mendapatkan diskon 50%!");
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal *= 0.7; // Diskon 30%
            System.out.println("Selamat! Anda mendapatkan diskon 30%!");
        } else if (!kodePromo.equals("")) {
            System.out.println("Kode promo tidak valid. Tidak ada diskon yang diberikan."); 
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = input.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = input.nextInt();
        input.nextLine(); // Membersihkan buffer
        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = input.nextLine();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);

        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
    }
}
