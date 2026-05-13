package ro.ase.ex_spital.ex_decorator.decorator;

import ro.ase.ex_spital.ex_decorator.clase.IRezultate;

public class DecoratorOnline extends Decorator{
    public DecoratorOnline(IRezultate rezultate) {
        super(rezultate);
    }

    @Override
    public void printeaza() {
        super.printeaza();
        this.afiseazaOnline();
    }

    @Override
    public void afiseazaOnline() {
        System.out.println("Rezultatele sunt afisate online!");
    }
}
