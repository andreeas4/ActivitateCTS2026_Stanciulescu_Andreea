package ro.ase.cts.decoratorEx;

public class Elev extends Aplicant {
    private int clasa;
    private String tutore;
    private static float sumaFinantata = 15;

    public void setClasa(int i) {
        this.clasa = i;
    }

    public void setTutore(String tutore) {
        this.tutore = tutore;
    }

    public static float getSumaFinantata() {
        return sumaFinantata;
    }

    public static void setSumaFinantata(float sumaFinantata) {
        Elev.sumaFinantata = sumaFinantata;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Elev{");
        sb.append(super.toString());
        sb.append("clasa=").append(clasa);
        sb.append(", tutore='").append(tutore).append('\'');

        return sb.toString();
    }

    public Elev() {
        super();
    }

    public Elev(String nume, String prenume, int varsta, int punctaj,
                int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
        super(nume, prenume, varsta, punctaj, nr_proiecte, denumireProiect);
        this.clasa = clasa;
        this.tutore = tutore;
    }

    public void afisareVenit() {

        System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste" + Elev.getSumaFinantata() + " Euro/zi in proiect.");

    }

}
