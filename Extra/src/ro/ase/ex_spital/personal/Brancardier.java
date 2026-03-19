package ro.ase.ex_spital.personal;

public class Brancardier extends Angajat{
    private String locatie;

    public Brancardier(String nume, int vechime, double salariu, String locatie) {
        super(nume, vechime, salariu);
        this.locatie = locatie;
    }

    public Brancardier() {

    }

    public Brancardier(String nume, int vechime, double salariu) {
        super(nume, vechime, salariu);
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }
    @Override
    public String returneazaAngajat() {
        String s =super.returneazaAngajat();
        StringBuilder sb=new StringBuilder(s);
        sb.append(",Locatie= ,").append(locatie)
                .append('}');
        return sb.toString();
    }
}
