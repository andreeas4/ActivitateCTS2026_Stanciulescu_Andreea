package ase.ro.cts.factory_method.restaurant.factories;

import ase.ro.cts.factory_method.restaurant.feluri_de_mancare.FelDeMancare;

public interface FabricaFelDeMancare {
    FelDeMancare getFelDeMancare(TipFelDeMancare tip,float gramaj,String denumire,int calorii);
    FelDeMancare getFelDeMancare(TipFelDeMancare tip,float gramaj,String denumire);
}
