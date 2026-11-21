public interface MetodeBayar {
    String nama();

     //Kontrak: hasil totalBayar() tidak pernah negatif (>= 0).

    int totalBayar(int totalBelanja);
}