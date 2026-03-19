package ase.ro.cts.factory_method.restaurant.feluri_de_mancare.supe;

public class Ciorba extends Supa{

    public Ciorba(float gramaj, String denumire) {
        super(gramaj, denumire);
    }

    @Override
    public void afiseazaMancare() {
        System.out.println("Ciorba "+super.denumire+" are " +super.gramaj+" ml.");
    }
}
