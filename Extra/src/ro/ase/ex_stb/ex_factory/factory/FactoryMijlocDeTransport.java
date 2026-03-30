package ro.ase.ex_stb.ex_factory.factory;

import ro.ase.ex_stb.ex_factory.mijloace_de_transport.Autobuz;
import ro.ase.ex_stb.ex_factory.mijloace_de_transport.MijlocDeTransport;
import ro.ase.ex_stb.ex_factory.mijloace_de_transport.Tramvai;
import ro.ase.ex_stb.ex_factory.mijloace_de_transport.Troleibuz;

public class FactoryMijlocDeTransport {
    public FactoryMijlocDeTransport() {
    }

    public MijlocDeTransport getMijlocDetransport(TipMijlocDeTransport tip, int nrLinie, int nrPasageri, String zona){
        switch (tip){
            case tip.AUTOBUZ ->{
                return new Autobuz(nrPasageri);
            }
            case tip.TROLEIBUZ -> {
                return new Troleibuz(zona);
            }
            case tip.TRAMVAI -> {
                return new Tramvai(nrLinie);

            }
            default -> {
                return null;
            }
        }

    }
}
