package ro.ase.ex_spital.clase.personal;

public class Medic extends Angajat{
    private String specializare;

    public Medic(String nume, int vechime, double salariu, String specializare) {
        super(nume, vechime, salariu);
        this.specializare = specializare;
    }

    public Medic() {

    }

    public Medic(String nume, int vechime, double salariu) {
        super(nume, vechime, salariu);
    }

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }
    @Override
    public String returneazaAngajat() {
        String s =super.returneazaAngajat();
        StringBuilder sb=new StringBuilder(s);
        sb.append(",Specializare= ,").append(specializare)
                .append('}');
        return sb.toString();
    }
}
