import java.util.Locale;

public class StrukPrinter {

    // Format angka: 120000 -> "Rp120.000"
    public static String rupiah(int nilai) {
        return "Rp" + String.format(Locale.US, "%,d", nilai).replace(',', '.');
    }

    public void cetakKeranjang(String judul, Keranjang keranjang) {
        int lebar = 41;
        int sisa = lebar - judul.length() - 2;
        int kiri = sisa / 2;
        int kanan = sisa - kiri;
        System.out.println("=".repeat(kiri) + " " + judul + " " + "=".repeat(kanan));

        for (Buku b : keranjang.getIsi()) {
            System.out.println(b.getJudul() + " (" + b.getPenulis() + ")");
            System.out.println("  Harga       : " + rupiah(b.getHarga()));
            System.out.println("  Keterangan  : " + b.getKeterangan());
            System.out.println("  Harga akhir : " + rupiah(b.hitungHargaAkhir()));
        }

        System.out.println("-".repeat(40));
        System.out.println("Total belanja : " + rupiah(keranjang.hitungTotal()));
    }

    public void cetakPembayaran(int totalBelanja, MetodeBayar[] pilihan) {
        System.out.println("-------------- PEMBAYARAN ---------------");
        for (MetodeBayar m : pilihan) {
            System.out.printf("%-20s : %s%n", m.nama(), rupiah(m.totalBayar(totalBelanja)));
        }
    }
}