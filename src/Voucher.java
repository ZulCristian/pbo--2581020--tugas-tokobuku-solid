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
        return totalBelanja - nilai;
    }
}