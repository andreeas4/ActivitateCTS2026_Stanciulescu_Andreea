package ro.ase.model_test.pizzerie.clase.preparate;

public interface IPreparat {
    void gătire();        // Afișează pașii de gătire
    String getDetalii();  // Returnează numele și ingredientele
    double getPret();     // Returnează prețul
    boolean adaugaSos();  // Returnează dacă s-a adăugat sos extra
}
