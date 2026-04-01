package ro.ase;

import ro.ase.model_test.echipamente_sportive.clase.Prototype.DesignComplex;
import ro.ase.model_test.echipamente_sportive.clase.ISportiv;
import ro.ase.model_test.echipamente_sportive.clase.Sportiv;

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
//        FabricaPreparate f=new FabricaPizza();
//        IPreparat i =f.creeazaPreparat("Margherita",30.0,50.0);
//        System.out.println(i.getDetalii());
//        i.gătire();
//
//        FabricaPreparate f2=new FabricaPaste();
//        IPreparat paste=f2.creeazaPreparat("Carbonara",40.0,60.90);
//        System.out.println(paste.getDetalii());
//        paste.gătire();
//
//        //testez W2
//        List<IPreparat>preparate=new ArrayList<>();
//        preparate.add(paste);
//        preparate.add(i);
//        Comanda c=new Comanda(preparate);
//        List <Comanda>comenzi=new ArrayList<>();
//        comenzi.add(c);
//
//        BucatarieManager b =BucatarieManager.getInstance(1,comenzi);
//        System.out.println(b);
//
//        BucatarieManager o=BucatarieManager.getInstance(2,comenzi);
//        System.out.println(o);
//
//
//        IPreparat paste2=f2.creeazaPreparat("Bolognese",40.0,60.90);
//        o.adaugaPreparat(paste2,1);
//
//        System.out.println(o);

//          test Z1
//        ConfiguratiePC pcGaming = new BuilderConfig()
//                .setProcesor("Intel i9")
//                .setMemorieRAM(32)
//                .setPlacaVideo("RTX 4090")
//                .setRacireLichida(true)
//                .setIluminareRGB(false)
//                .build();
//
//        ConfiguratiePC pcOffice = new BuilderConfig()
//                .setProcesor("AMD Ryzen 5")
//                .setMemorieRAM(16)
//                // restul rămân pe false/default automat
//                .build();
//
//        System.out.println(pcGaming);
//        System.out.println(pcOffice);
//
//        //test z2 -singleton
//
//        AtelierAsamblare atelierAsamblare=AtelierAsamblare.getInstanta();
//        atelierAsamblare.adaugaPc(pcGaming);
//        atelierAsamblare.adaugaPc(pcOffice);
//        System.out.println(atelierAsamblare);
//
//        AtelierAsamblare altAtelier = AtelierAsamblare.getInstanta();
//        System.out.println("Sunt aceleași instanțe? " + (atelierAsamblare == altAtelier));
//        System.out.println(altAtelier.toString());

//        //test x1
//        // --- Testare Singleton (1p) ---
//        ConfiguratieGlobala config = ConfiguratieGlobala.getInstanta("192.168.1.1", "v2.5", 2);
//        System.out.println("[Sistem] " + config.toString());
//        System.out.println("Server conectat cu succes!\n");
//
//
//        // --- Testare Prototype (3p + 1p Integrare) ---
//
//        // 1. Creăm rețeta originală (proces costisitor)
//        Map<String, Double> ingredienteBaza = new HashMap<>();
//        ingredienteBaza.put("Substanta Activa A", 0.05);
//        ingredienteBaza.put("Stabilizator B", 0.12);
//
//        Reteta retetaEtalon = new Reteta("Sirop Calmant", ingredienteBaza);
//        System.out.println("Original: " + retetaEtalon);
//
//        // 2. Generăm două copii pentru pacienți diferiți (proces rapid de clonare)
//        Reteta copiePacient1 = (Reteta) retetaEtalon.copy();
//        Reteta copiePacient2 = (Reteta) retetaEtalon.copy();
//
//        // 3. Demonstrăm independența (modificăm o copie fără a afecta originalul)
//        copiePacient1.getListaMedicamente().put("Zahar adaugat", 2.0);
//
//        System.out.println("\n--- Rezultate după clonare și modificare ---");
//        System.out.println("Copie Pacient 1 (modificată): " + copiePacient1);
//        System.out.println("Copie Pacient 2 (nemanipulată): " + copiePacient2);
//        System.out.println("Original (intact): " + retetaEtalon);
//
//        // 4. Verificare finală Singleton
//        ConfiguratieGlobala altaConfig = ConfiguratieGlobala.getInstanta("alt_ip", "v3", 2);
//        System.out.println(altaConfig+ " Asta e o alta configuratie teoretic");
        //ex s1
        ISportiv s = new Sportiv("Football", "S");


        DesignComplex prototip = new DesignComplex(s);


        DesignComplex d3 = (DesignComplex) prototip.copy();
        DesignComplex d4 = (DesignComplex) prototip.copy();

        System.out.println(d3);
        System.out.println(d4);


    }
}
