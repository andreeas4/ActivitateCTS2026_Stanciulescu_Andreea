package ro.ase.ex_spital.clase.personal;

public abstract class Angajat {
    public String nume;
    public int vechime;
    public double salariu;

    public Angajat(String nume, int vechime, double salariu) {
        this.nume = nume;
        this.vechime = vechime;
        this.salariu = salariu;
    }

    public Angajat() {

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVechime() {
        return vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    public String returneazaAngajat() {
        final StringBuilder sb = new StringBuilder("Angajat{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", vechime=").append(vechime);
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }
}
