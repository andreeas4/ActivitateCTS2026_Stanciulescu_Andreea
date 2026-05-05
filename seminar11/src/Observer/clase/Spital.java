package Observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital{
    private List<IPacient>pacienti;
    private String nume;


    public Spital(String nume) {
        this.nume = nume;
        this.pacienti=new ArrayList<>();
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(IPacient p : pacienti){
            p.receptioneazaMesaj(mesaj+"de la SPITALUL "+ this.nume);
        }
    }

    @Override
    public void aboneaza(IPacient p) {
        this.pacienti.add(p);
    }

    @Override
    public void dezaboneaza(IPacient p) {
        this.pacienti.remove(p);
    }

    public void notificaVirus(){
        trimiteMesaj("Exista un virus in oras");
    }
    public void notificaEpidemie()
    {
        trimiteMesaj("Exista o epidemie in oras");
    }
}
