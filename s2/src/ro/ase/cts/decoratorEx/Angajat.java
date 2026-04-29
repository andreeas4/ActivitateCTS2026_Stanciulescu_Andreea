package ro.ase.cts.decoratorEx;

public class Angajat extends Aplicant {
    private String ocupatie;
    private int salariu;
    private static float sumaFinantata = 4;

    public static float getSumaFinantata() {
        return sumaFinantata;
    }

    public static void setSumaFinantata(float sumaFinantata) {
        Angajat.sumaFinantata = sumaFinantata;
    }

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumire_Proiecte, int salariu, String ocupatie) {
        super(nume, prenume, varsta, punctaj, nr_proiecte, denumire_Proiecte);
        this.salariu = salariu;
        this.ocupatie = ocupatie;
    }

    public Angajat() {
        super();

    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Angajat{");
        sb.append(super.toString());
        sb.append("ocupatie='").append(ocupatie).append('\'');
        sb.append(", salariu=").append(salariu);
        return sb.toString();
    }

    public void afisareVenit() {

        // TODO Auto-generated method stub
        System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste" + Angajat.getSumaFinantata() + " Euro/zi in proiect.");

    }

}
