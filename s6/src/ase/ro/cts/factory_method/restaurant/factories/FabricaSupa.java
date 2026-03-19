package ase.ro.cts.factory_method.restaurant.factories;

import ase.ro.cts.factory_method.restaurant.feluri_de_mancare.FelDeMancare;
import ase.ro.cts.factory_method.restaurant.feluri_de_mancare.supe.Ciorba;
import ase.ro.cts.factory_method.restaurant.feluri_de_mancare.supe.SupaCrema;

public class FabricaSupa implements FabricaFelDeMancare{

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire, int calorii) {
        return this.getFelDeMancare(tip,gramaj,denumire);
    }

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire) {
        switch(tip){
            case TipSupa.SUPA_CREMA-> {
                return new SupaCrema(gramaj,denumire);
            }
            case TipSupa.CIORBA -> {
                return new Ciorba(gramaj,denumire);
            }
            default -> {
                return null;
            }
        }
    }
}
