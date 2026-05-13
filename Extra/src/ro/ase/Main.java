package ro.ase;

//import ro.ase.ex_stb.ex_composite.clase.Autobuz;
import ro.ase.ex_restaurant.ex_command.clase.Masa;
import ro.ase.ex_restaurant.ex_command.command.ComandaOcupa;
import ro.ase.ex_restaurant.ex_command.command.ComandaRezerva;
import ro.ase.ex_restaurant.ex_command.command.ICommand;
import ro.ase.ex_restaurant.ex_command.command.Operator;
import ro.ase.ex_spital.ex_decorator.clase.IRezultate;
import ro.ase.ex_spital.ex_decorator.clase.Rezultate;
import ro.ase.ex_spital.ex_decorator.decorator.Decorator;
import ro.ase.ex_spital.ex_decorator.decorator.DecoratorOnline;
import ro.ase.ex_stb.ex_composite.clase.IAutobuz;
import ro.ase.ex_stb.ex_composite.composite.GrupAutobuze;
import ro.ase.ex_stb.ex_facade.clase.UsaFata;
import ro.ase.ex_stb.ex_facade.clase.UsaMijloc;
import ro.ase.ex_stb.ex_facade.clase.UsaSpate;
import ro.ase.ex_stb.ex_facade.facade.ModulUsi;
import ro.ase.ex_stb.ex_flyweight.clase.ILinie;
import ro.ase.ex_stb.ex_flyweight.clase.LinieAutobuz;
import ro.ase.ex_stb.ex_flyweight.flyweight.FabricaFlyweight;
import ro.ase.ex_stb.ex_proxy.clase.Bus;
import ro.ase.ex_stb.ex_proxy.clase.IOprire;
import ro.ase.ex_stb.ex_proxy.proxy.ProxyOprire;
import ro.ase.model_test.echipamente_sportive.clase.Prototype.DesignComplex;
import ro.ase.model_test.echipamente_sportive.clase.ISportiv;
import ro.ase.model_test.echipamente_sportive.clase.Sportiv;
import ro.ase.model_test.echipamente_sportive.clase.factory.ArticoleFactory;
import ro.ase.model_test.echipamente_sportive.clase.factory.ArticoleSportive;
import ro.ase.model_test.echipamente_sportive.clase.kit_sportiv.articole_sportive.IArticolSportiv;
import ro.ase.model_test.smart_home.clase.IServices;
import ro.ase.model_test.smart_home.clase.RegistruConfiguratii;
import ro.ase.model_test.smart_home.clase.Securitate;
import ro.ase.model_test.smart_home.clase.Temperatura;
import ro.ase.ex_stb.ex_flyweight.clase.Autobuz;
import java.util.ArrayList;
import java.util.Arrays;
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
//        ISportiv s = new Sportiv("Football", "S");
//
//
//        DesignComplex prototip = new DesignComplex(s);
//
//
//        DesignComplex d3 = (DesignComplex) prototip.copy();
//        DesignComplex d4 = (DesignComplex) prototip.copy();
//
//        System.out.println(d3);
//        System.out.println(d4);
//
//        //ex s2
//        ArticoleFactory fabrica = new ArticoleFactory();
//        List<IArticolSportiv> kitSportiv = new ArrayList<>();
//
//        // Creăm minim 4 obiecte din cel puțin 2 tipuri diferite (Cerința 1p)
//        kitSportiv.add(fabrica.getArticol(ArticoleSportive.TRICOU, "Albastru"));
//        kitSportiv.add(fabrica.getArticol(ArticoleSportive.TRICOU, "Alb"));
//        kitSportiv.add(fabrica.getArticol(ArticoleSportive.SORT, "Negru"));
//        kitSportiv.add(fabrica.getArticol(ArticoleSportive.JAMBIERE, "Albastru"));
//
//        // Afișăm rezultatele
//        System.out.println("--- Componente Kit Sportiv Generate ---");
//        for (IArticolSportiv articol : kitSportiv) {
//            if (articol != null) {
//                System.out.println(articol);; // Presupunând că ai metoda asta în interfață
//            }
//        }

//        //testare registru
//        IServices instanta= RegistruConfiguratii.getConfig("Iluminat");
//        IServices instanta1=RegistruConfiguratii.getConfig("Temperatura");
//        IServices instanta2=RegistruConfiguratii.getConfig("Securitate");
//
//        IServices instantaTest=RegistruConfiguratii.getConfig("Ceva nou");
//        IServices instantaTest2=RegistruConfiguratii.getConfig("Temperatura");
//
//        instanta.detalii();
//        instanta1.detalii();
//        instanta2.detalii();
//        System.out.println("TEORETIC INSTANTA NOUA:");
//        instantaTest.detalii();
//
//        instantaTest2.detalii();
//FACADE
//        UsaSpate usaSpate=new UsaSpate();
//        UsaFata usaFata =new UsaFata();
//        UsaMijloc usaMijloc=new UsaMijloc();
//
//        ModulUsi usi=new ModulUsi(usaFata,usaMijloc,usaSpate);
//
//        usi.dechideUsiFortat();
//        usi.seteazaModLiberUsi();
//
         //COMPOSITE
//        IAutobuz a1 = new Autobuz("Mercedes", "M3", 28);
//        IAutobuz a2 = new Autobuz("Mercedes", "M3", 19);
//        IAutobuz a3 = new Autobuz("Mercedes", "M3", 18);
//
//
//        GrupAutobuze grupMici = new GrupAutobuze("Grup Mici", new ArrayList<>());
//        GrupAutobuze flotaGenerala = new GrupAutobuze("Flota Bucuresti", new ArrayList<>());
//
//        List<IAutobuz> inventar = Arrays.asList(a1, a2, a3);
//        for(IAutobuz auto : inventar) {
//            if(auto.getNrLocuri() < 20) {
//                grupMici.adaugaAutobuz(auto);
//            }
//        }
//
//
//        flotaGenerala.adaugaAutobuz(grupMici);
//        flotaGenerala.adaugaAutobuz(a1); // Adăugăm și un autobuz mare direct în flotă
//
//
//        flotaGenerala.afiseazaDetalii();
//
//        System.out.println("Total locuri flotă: " + flotaGenerala.getNrLocuri());


//        PROXY
//
//        Bus bus=new Bus(true);
//        IOprire proxy=new ProxyOprire(bus);
//
//        proxy.opreste();
//
//        Bus bus2=new Bus(false);
//
//        IOprire proxy2=new ProxyOprire(bus2);
//        proxy2.opreste();

        //Flyweight

//        Autobuz a=new Autobuz("Mercedes",2020,34,"B456fre");
//        ILinie linie=new LinieAutobuz(3,"Marrie Currie","Capitanu George");
//        FabricaFlyweight flyweight=new FabricaFlyweight();
//        flyweight.getLinie(3).afiseazaDetalii(a);

        //decorator

//        IRezultate rezultate=new Rezultate();
//        rezultate.printeaza();
//        Decorator rezultateDecorate=new DecoratorOnline(rezultate);
//        rezultateDecorate.printeaza();

        //command
//
//        Masa masaTrbRezervata=new Masa(1);
//        Masa masaOcupata=new Masa(2);
//        ICommand comanda=new ComandaRezerva(masaTrbRezervata);
//        ICommand comanda2=new ComandaOcupa(masaOcupata);
//
//        Operator operator=new Operator();
//        operator.primesteComanda(comanda);
//        operator.primesteComanda(comanda2);
//        operator.executaComenzi();
    }
}
