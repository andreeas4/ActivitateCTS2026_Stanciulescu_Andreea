package ro.ase.ex_spital.ex_strategy.strategy;

import ro.ase.ex_spital.ex_strategy.clase.IPlata;

public class Pacient {
    private String nume;
    private double suma;
    private IPlata tipPlata;

    public Pacient(String nume, IPlata tipPlata) {
        this.nume = nume;
        this.tipPlata = tipPlata;
    }

    public Pacient(String nume, double suma, IPlata tipPlata) {
        this.nume = nume;
        this.suma = suma;
        this.tipPlata = tipPlata;
    }

    public void setTipPlata(IPlata tipPlata) {
        this.tipPlata = tipPlata;
    }

    public void plateste(){
        tipPlata.plateste(this.suma);
    }
}
