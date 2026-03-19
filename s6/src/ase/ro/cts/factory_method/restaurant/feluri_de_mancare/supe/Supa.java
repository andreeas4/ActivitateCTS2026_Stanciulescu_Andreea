package ase.ro.cts.factory_method.restaurant.feluri_de_mancare.supe;

import ase.ro.cts.factory_method.restaurant.feluri_de_mancare.FelDeMancare;

public abstract class Supa implements FelDeMancare {

    protected float gramaj;
    protected String denumire;

    public Supa(float gramaj, String denumire) {
        this.gramaj = gramaj;
        this.denumire = denumire;
    }
}
