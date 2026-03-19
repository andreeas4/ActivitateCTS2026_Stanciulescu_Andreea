package ase.ro.cts.factory_method.restaurant.feluri_de_mancare.deserturi;

import ase.ro.cts.factory_method.restaurant.feluri_de_mancare.FelDeMancare;

public abstract class Desert implements FelDeMancare {
    protected float gramaj;
    protected int calorii;
    protected String denumire;

    public Desert(float gramaj, int calorii, String denumire) {
        this.gramaj = gramaj;
        this.calorii = calorii;
        this.denumire = denumire;
    }

}
