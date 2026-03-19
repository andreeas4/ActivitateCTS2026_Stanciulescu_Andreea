package ase.ro.cts.factory_method.restaurant.factories;

import ase.ro.cts.factory_method.restaurant.feluri_de_mancare.FelDeMancare;
import ase.ro.cts.factory_method.restaurant.feluri_de_mancare.deserturi.Papanasi;
import ase.ro.cts.factory_method.restaurant.feluri_de_mancare.deserturi.Placinta;

public class FabricaDesert implements FabricaFelDeMancare{
    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire, int calorii) {
        switch (tip){
            case TipDesert.PAPANASI -> {
                return new Papanasi(gramaj,calorii,denumire);
            }
            case TipDesert.PLACINTA -> {
                return new Placinta(gramaj,calorii,denumire);
            }
            default -> {
                return null;
            }
        }
    }

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire) {
        return this.getFelDeMancare(tip,gramaj,denumire,500);
    }
}
