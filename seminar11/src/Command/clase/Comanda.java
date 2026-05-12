package Command.clase;

public class Comanda implements IComanda{
    private PersonalSpital medic;
    private Pacient pacient;

    public Comanda(PersonalSpital medic, Pacient pacient) {
        this.medic = medic;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        medic.preluarePacient(pacient);
    }
    //to do :
    //trebuie comansata internare cu tratare in clasa asta

    
}
