package ase.ro.cts.factory_method.restaurant.feluri_de_mancare.deserturi;

public class Placinta extends Desert{

    public Placinta(float gramaj, int calorii, String denumire) {
        super(gramaj, calorii, denumire);
    }

    @Override
    public void afiseazaMancare() {
        System.out.println("Placinta cu "+super.denumire+" are " +super.gramaj +" au "+super.calorii+" calorii.");
    }
}
