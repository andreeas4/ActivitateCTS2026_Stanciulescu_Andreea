package ro.ase.model_test.pizzerie.clase.factory_method;

import ro.ase.model_test.pizzerie.clase.preparate.IPreparat;
import ro.ase.model_test.pizzerie.clase.preparate.Salata;

public class FabricaSalata implements FabricaPreparate{

    @Override
    public IPreparat creeazaPreparat(String nume, double timp, double pret) {
        return new Salata(nume,timp,pret);
    }
}
