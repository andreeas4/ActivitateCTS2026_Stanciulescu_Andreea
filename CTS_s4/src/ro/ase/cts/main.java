package ro.ase.cts;

import ro.ase.cts.simpleFactory.clase.factory.SimpleFactory;
import ro.ase.cts.simpleFactory.clase.factory.tipTransport;
import ro.ase.cts.simpleFactory.clase.mijloace_transport.Autobuz;
import ro.ase.cts.simpleFactory.clase.mijloace_transport.MijlocDeTransport;
import ro.ase.cts.singleton.clase.Logger;

public class main {
    public static void main(String[] params){
        Logger instanta=Logger.getInstanta("Interfata","afisare");

        instanta.afiseazaLog(" Fisierul json nu este afisat corect");
        instanta.afiseazaLog(" Xml indisponibil");

        Logger instanta2=Logger.getInstanta("Baza de date","eroare");
        instanta2.afiseazaLog("!!! eroare");

        instanta.setCategorie("eroare");
        instanta.setSender("Baza de date");

        instanta2.afiseazaLog("!!! eroare critica la inserare !!!");

        //Logger nuSePoate=new Logger();


        SimpleFactory factory=new SimpleFactory();
        MijlocDeTransport autobuz=factory.getMijlocDeTransport(tipTransport.AUTOBUZ,"MAN",34);
        autobuz.afiseazaTipTransport();

        MijlocDeTransport tramvai=factory.getMijlocDeTransport(tipTransport.TRAMVAI,"Mercedes",89);
        tramvai.afiseazaTipTransport();
    }

}
