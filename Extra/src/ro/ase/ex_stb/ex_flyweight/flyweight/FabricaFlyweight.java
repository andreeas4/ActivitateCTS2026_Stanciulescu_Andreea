package ro.ase.ex_stb.ex_flyweight.flyweight;

import ro.ase.ex_stb.ex_flyweight.clase.Autobuz;
import ro.ase.ex_stb.ex_flyweight.clase.ILinie;
import ro.ase.ex_stb.ex_flyweight.clase.LinieAutobuz;

import java.util.HashMap;
import java.util.Map;

public class FabricaFlyweight {
    Map<Integer, ILinie>linii;

    public FabricaFlyweight() {
        this.linii = new HashMap<>();
    }

    public ILinie getLinie(int nrLinie){
        if(linii.containsKey(nrLinie))
        {
            return linii.get(nrLinie);
        }
        else {
            ILinie linie=new LinieAutobuz(nrLinie,"Nichita Stanescu","Unirii");
            linii.put(nrLinie,linie);
            return linie;
        }

    }
}
