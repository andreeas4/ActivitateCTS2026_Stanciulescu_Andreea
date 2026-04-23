package facade.clase;

public class Medic {
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public boolean verificaPacientInternare(Pacient p)
    {
        if(p.getGravitate()>5){
            return true;
        }
        else return false;
    }
}
