public class Voucher implements MetodeBayar {
    private final int nilai;

    public Voucher(int nilai) {
        this.nilai = nilai;
    }

    @Override
    public String nama() {
        return "Voucher " + StrukPrinter.rupiah(nilai);
    }

    @Override
    public int totalBayar(int totalBelanja) {
        // Versi awal (melanggar kontrak):
        // Keranjang kedua: Voucher Rp100.000 : Rp-36.000
        return Math.max(0, totalBelanja - nilai);
    }
}