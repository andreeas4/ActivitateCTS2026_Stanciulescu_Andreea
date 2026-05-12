package Command.clase;

public class Medic implements PersonalSpital{
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void preluarePacient(Pacient pacient) {
        System.out.println("Medicul "+this.nume+" interneaza pacientul "+pacient.getNume());
    }
}
