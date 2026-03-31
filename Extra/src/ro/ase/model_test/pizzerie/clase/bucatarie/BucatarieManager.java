package ro.ase.model_test.pizzerie.clase.bucatarie;

import ro.ase.model_test.pizzerie.clase.preparate.IPreparat;

import java.util.List;

public class BucatarieManager {
    private int nrComenzi;
    private List <Comanda>comenzi;
    private static BucatarieManager instanta=null;

    private BucatarieManager(int nrComenzi, List<Comanda> comenzi) {
        this.nrComenzi = nrComenzi;
        this.comenzi = comenzi;
    }

    public void adaugaPreparat(IPreparat p, int nrComanda)
    {
        comenzi.get(nrComanda-1).addPreparat(p);
    }

    public int getNrComenzi() {
        return nrComenzi;
    }

    public void setNrComenzi(int nrComenzi) {
        this.nrComenzi = nrComenzi;
    }

    public List<Comanda> getComenzi() {
        return comenzi;
    }

    public void setComenzi(List<Comanda> comenzi) {
        this.comenzi = comenzi;
    }

    public static synchronized BucatarieManager getInstance(int nrComenzi, List<Comanda> comenzi)
    {
        if(instanta==null){
            instanta =new BucatarieManager(nrComenzi,comenzi);
            return instanta;
        }
        return instanta;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BucatarieManager{");
        sb.append("nrComenzi=").append(nrComenzi);
        sb.append(", comenzi=").append(comenzi);
        sb.append('}');
        return sb.toString();
    }
}
