package ro.ase.ex_stb.ex_proxy.proxy;

import ro.ase.ex_stb.ex_proxy.clase.Bus;
import ro.ase.ex_stb.ex_proxy.clase.IOprire;

public class ProxyOprire implements IOprire {
    private Bus bus;

    public ProxyOprire(Bus bus) {
        this.bus = bus;
    }


    @Override
    public void opreste() {
        if(bus.getSuntPersoane()) {
            bus.opreste();
        }
        else System.out.println("Autobuzul nu opreste (nu sunt persoane)");
    }
}
