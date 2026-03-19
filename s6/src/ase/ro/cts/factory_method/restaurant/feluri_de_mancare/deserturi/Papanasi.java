package ase.ro.cts.factory_method.restaurant.feluri_de_mancare.deserturi;

public class Papanasi extends Desert{

    public Papanasi(float gramaj, int calorii, String denumire) {
        super(gramaj, calorii, denumire);
    }

    @Override
    public void afiseazaMancare() {
        System.out.println("Papanasii cu "+super.denumire+" are " +super.gramaj +" au "+super.calorii+" calorii.");
    }
}
