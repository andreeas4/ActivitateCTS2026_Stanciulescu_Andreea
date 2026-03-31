package ro.ase.model_test.pizzerie.clase.factory_method;

import ro.ase.model_test.pizzerie.clase.preparate.IPreparat;
import ro.ase.model_test.pizzerie.clase.preparate.Pizza;

public class FabricaPizza implements FabricaPreparate{


    @Override
    public IPreparat creeazaPreparat(String nume, double timp, double pret) {
        return new Pizza(nume,timp,pret);
    }
}
