package ro.ase.cts.simpleFactory.clase.factory;

import ro.ase.cts.simpleFactory.clase.mijloace_transport.*;

public class SimpleFactory {

    public SimpleFactory() {
    }

    public MijlocDeTransport getMijlocDeTransport(tipTransport tip, String marca, Integer nrlinie){
        switch(tip){
            case tipTransport.AUTOBUZ -> {
                return new Autobuz(nrlinie,marca);
            }
            case tipTransport.TRAMVAI -> {
                return new Tramvai(nrlinie,marca);
            }
            case tipTransport.TROLEIBUZ -> {
                return new Troleibuz(nrlinie,marca);
            }
            default -> {
                return null;
            }
        }
    }
}
