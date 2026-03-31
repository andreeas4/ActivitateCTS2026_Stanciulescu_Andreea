package ro.ase.model_test.pizzerie.clase.factory_method;

import ro.ase.model_test.pizzerie.clase.preparate.IPreparat;
import ro.ase.model_test.pizzerie.clase.preparate.Paste;

public class FabricaPaste implements FabricaPreparate{


    @Override
    public IPreparat creeazaPreparat(String nume, double timp, double pret) {
        return new Paste(nume,timp,pret);
    }
}
