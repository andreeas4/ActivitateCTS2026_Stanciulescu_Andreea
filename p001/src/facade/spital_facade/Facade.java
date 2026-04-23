package facade.spital_facade;

import facade.clase.Medic;
import facade.clase.Pacient;
import facade.clase.Salon;

public class Facade {
    private Medic m;
    private Salon s;

    public Facade(Medic m, Salon s) {
        this.m = m;
        this.s = s;
    }

    public void verificaEligibilitatePacient(Pacient p){
        if(p.getGravitate()>=4){
            if(m.verificaPacientInternare(p)){
                if(s.suntPaturiLibere()!=-1)
                    {
                    System.out.println("Pacientul "+p.getNume()+" trebuie internat in patul "+s.suntPaturiLibere());
                    s.setPaturiLibere(s.suntPaturiLibere());
                    }else System.out.println("Nu exista locuri disponibile!");

            }
            else System.out.println("Nu se interneaza (nu are trimitere) !");
        }
        else System.out.println("Trimite la ambulatoriu (nu este destul de grav)!");
    }

}
