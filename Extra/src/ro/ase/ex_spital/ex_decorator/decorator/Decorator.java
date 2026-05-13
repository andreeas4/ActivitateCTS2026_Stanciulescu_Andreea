package ro.ase.ex_spital.ex_decorator.decorator;

import ro.ase.ex_spital.ex_decorator.clase.IRezultate;
import ro.ase.ex_spital.ex_decorator.clase.Rezultate;

public abstract class Decorator implements IRezultate {

    IRezultate rezultate;

    public Decorator(IRezultate rezultate) {
        this.rezultate = rezultate;
    }

    @Override
    public void printeaza() {
        this.rezultate.printeaza();
    }
    public abstract void afiseazaOnline();

}
