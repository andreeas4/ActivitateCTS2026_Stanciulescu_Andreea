package ro.ase;

import ro.ase.ex_stb.ex_builder.builder.BuilderAutobuzLinie;
import ro.ase.ex_stb.ex_builder.clase.AutobuzLinie;
import ro.ase.ex_stb.ex_factory.mijloace_de_transport.Autobuz;
import ro.ase.model_test.pizzerie.clase.bucatarie.BucatarieManager;
import ro.ase.model_test.pizzerie.clase.bucatarie.Comanda;
import ro.ase.model_test.pizzerie.clase.factory_method.FabricaPaste;
import ro.ase.model_test.pizzerie.clase.factory_method.FabricaPizza;
import ro.ase.model_test.pizzerie.clase.factory_method.FabricaPreparate;
import ro.ase.model_test.pizzerie.clase.preparate.IPreparat;
import ro.ase.model_test.pizzerie.clase.preparate.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        testare ex A2 Spital
//        SingletonFactory factory=SingletonFactory.getInstanta();
//        Angajat asistent= factory.getAngajat(TipAngajat.ASISTENT,"Marian Popescu",3700,9);
//        System.out.println(asistent.returneazaAngajat());
//
//        Brancardier b= (Brancardier) factory.getAngajat(TipAngajat.BRANCARDIER,"Mihai Pop",4000,4);
//        b.setLocatie("Ambulanta");
//        System.out.println(b.returneazaAngajat());

        //testez ex F1
//        FactoryMijlocDeTransport factory=new FactoryMijlocDeTransport();
//        MijlocDeTransport m=factory.getMijlocDetransport(TipMijlocDeTransport.AUTOBUZ,23,40,"Obor");
//        m.transporta();
//        MijlocDeTransport m1=factory.getMijlocDetransport(TipMijlocDeTransport.TRAMVAI,23,40,"Obor");
//        m1.transporta();
//        MijlocDeTransport m2=factory.getMijlocDetransport(TipMijlocDeTransport.TROLEIBUZ,23,40,"Obor");
//        m2.transporta();

        //testez F2

//        Autobuz a=new Autobuz(28);
//        Autobuz b= (Autobuz) a.copiaza();
//        System.out.println(a);
//        System.out.println(b);

        // testez F3
//        BuilderAutobuzLinie b=new BuilderAutobuzLinie();
//        AutobuzLinie a=b.setSofer("Ion").setModelAutobuz("Mercedes").build();
//        System.out.println(a);
        //testez W1
        FabricaPreparate f=new FabricaPizza();
        IPreparat i =f.creeazaPreparat("Margherita",30.0,50.0);
        System.out.println(i.getDetalii());
        i.gătire();

        FabricaPreparate f2=new FabricaPaste();
        IPreparat paste=f2.creeazaPreparat("Carbonara",40.0,60.90);
        System.out.println(paste.getDetalii());
        paste.gătire();

        //testez W2
        List<IPreparat>preparate=new ArrayList<>();
        preparate.add(paste);
        preparate.add(i);
        Comanda c=new Comanda(preparate);
        List <Comanda>comenzi=new ArrayList<>();
        comenzi.add(c);

        BucatarieManager b =BucatarieManager.getInstance(1,comenzi);
        System.out.println(b);

        BucatarieManager o=BucatarieManager.getInstance(2,comenzi);
        System.out.println(o);


        IPreparat paste2=f2.creeazaPreparat("Bolognese",40.0,60.90);
        o.adaugaPreparat(paste2,1);

        System.out.println(o);





    }
}
