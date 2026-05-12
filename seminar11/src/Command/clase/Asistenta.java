package Command.clase;

public class Asistenta implements PersonalSpital{
    private String nume;

    public Asistenta(String nume) {
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
        System.out.println("Asistenta "+this.nume+ " trateaza pe loc pacientul "+pacient.getNume());
    }
}
