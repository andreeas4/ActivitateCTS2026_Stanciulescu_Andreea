package ro.ase.model_test.pizzerie.clase.factory_method;

import ro.ase.model_test.pizzerie.clase.preparate.IPreparat;

public interface FabricaPreparate {
    public IPreparat creeazaPreparat(String nume,double timp,double pret);
}
