package ase.ro.cts.factory_method.restaurant.feluri_de_mancare.supe;

public class SupaCrema extends Supa{

    public SupaCrema(float gramaj, String denumire) {
        super(gramaj, denumire);
    }

    @Override
    public void afiseazaMancare() {
        System.out.println("Supa crema "+super.denumire+" are " +super.gramaj);
    }
}
