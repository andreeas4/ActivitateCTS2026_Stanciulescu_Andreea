package ase.ro.cts.factory_method.restaurant;

import ase.ro.cts.factory_method.restaurant.factories.*;
import ase.ro.cts.factory_method.restaurant.feluri_de_mancare.FelDeMancare;
import ase.ro.cts.factory_method.restaurant.feluri_de_mancare.supe.Supa;
import ase.ro.cts.factory_method.restaurant.feluri_de_mancare.supe.SupaCrema;

public class Main {
    static void main() {
        FabricaFelDeMancare fabrica=new FabricaSupa();
        FelDeMancare supaCrema=fabrica.getFelDeMancare(TipSupa.SUPA_CREMA,300,"ciuperci");

        FabricaFelDeMancare fabrica2=new FabricaDesert();
        FelDeMancare papanasi= fabrica2.getFelDeMancare(TipDesert.PAPANASI,350,"visine",2000);
        FelDeMancare placinta=fabrica2.getFelDeMancare(TipDesert.PLACINTA,400,"Caise",4000);

        papanasi.afiseazaMancare();
        placinta.afiseazaMancare();
        supaCrema.afiseazaMancare();
    }
}
