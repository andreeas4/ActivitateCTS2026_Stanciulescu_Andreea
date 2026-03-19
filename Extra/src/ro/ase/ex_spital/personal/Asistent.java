package ro.ase.ex_spital.personal;

public class Asistent extends Angajat{

    private int gradAcces;
    private String departament;

    public Asistent(String nume, int vechime, double salariu, int gradAcces) {
        super(nume, vechime, salariu);
        this.gradAcces = gradAcces;
    }

    public Asistent(String nume, int vechime, double salariu, int gradAcces, String departament) {
        super(nume, vechime, salariu);
        this.gradAcces = gradAcces;
        this.departament = departament;
    }

    public Asistent(String nume,int vechime,double salariu) {
        super(nume, vechime, salariu);
    }



    public int getGradAcces() {
        return gradAcces;
    }

    public void setGradAcces(int gradAcces) {
        this.gradAcces = gradAcces;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    @Override
    public String returneazaAngajat() {
        String s =super.returneazaAngajat();
        StringBuilder sb=new StringBuilder(s);
        sb.append(",Grad Acces= ,").append(gradAcces).append(", departament= ,").append(departament)
                .append('}');
        return sb.toString();
    }
}
