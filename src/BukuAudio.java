public class BukuAudio extends Buku implements BisaDiunduh {
    private final int durasiMenit;
    private final int diskonPersen;

    public BukuAudio(String judul, String penulis, int harga, int durasiMenit, int diskonPersen) {
        super(judul, penulis, harga);
        this.durasiMenit = durasiMenit;
        this.diskonPersen = diskonPersen;
    }

    @Override
    public int getDiskonPersen() { return diskonPersen; }

    @Override
    public int hitungHargaAkhir() {
        return getHarga() * (100 - diskonPersen) / 100;
    }

    @Override
    public String getKeterangan() {
        return durasiMenit + " menit, diskon " + diskonPersen + "%";
    }
}