
import java.util.Scanner;

public class HitungTotalHarga23 {

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        // Penerapan kode promo
        if (kodePromo.equals("DISKON50")) {
            hargaTotal *= 0.5; // Diskon 50%
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal *= 0.7; // Diskon 30%
        } else if (!kodePromo.equals("")) {
            System.out.println("Kode promo tidak valid. Tidak ada diskon yang diberikan.");
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalKeseluruhan = 0;
        String lanjut;

        // Meminta kode promo di awal
        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = input.nextLine();

        do {
            // Memasukkan detail pesanan
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = input.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = input.nextInt();

            // Menghitung total harga untuk pesanan ini
            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            totalKeseluruhan += totalHarga;

            System.out.print("Apakah Anda ingin memesan menu lain? (y/n): ");
            lanjut = input.next();

        } while (lanjut.equalsIgnoreCase("y"));

        System.out.println("\nTotal keseluruhan pesanan Anda: Rp" + totalKeseluruhan);
    }
}
