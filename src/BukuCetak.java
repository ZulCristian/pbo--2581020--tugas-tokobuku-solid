public class BukuCetak extends Buku {
    private final int beratGram;
    private final int ongkir;

    public BukuCetak(String judul, String penulis, int harga, int beratGram, int ongkir) {
        super(judul, penulis, harga);
        this.beratGram = beratGram;
        this.ongkir = ongkir;
    }

    @Override
    public int hitungHargaAkhir() {
        return getHarga() + ongkir;
    }

    @Override
    public String getKeterangan() {
        return beratGram + " gram, ongkir " + StrukPrinter.rupiah(ongkir);
    }
}