package ro.ase.ex_spital.factory;

import ro.ase.ex_spital.personal.Angajat;
import ro.ase.ex_spital.personal.Asistent;
import ro.ase.ex_spital.personal.Brancardier;
import ro.ase.ex_spital.personal.Medic;

public class SingletonFactory {

    private static SingletonFactory instanta=null;

    private SingletonFactory() {
    }


    public Angajat getAngajat(TipAngajat tip, String nume, double salariu, int vechime)
    {
        switch (tip){
            case tip.ASISTENT ->
            {
                return new Asistent(nume,vechime,salariu);
            }
            case tip.MEDIC ->
            {
                return new Medic(nume,vechime,salariu);
            }
            case tip.BRANCARDIER -> {
                return new Brancardier(nume,vechime,salariu);
            }
            default -> {
                return null;
            }
        }
    }
    public synchronized static SingletonFactory getInstanta()
    {
        if(instanta==null){
            return new SingletonFactory();
        }
        else return instanta;
    }


}
