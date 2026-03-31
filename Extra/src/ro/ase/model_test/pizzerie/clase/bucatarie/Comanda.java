package ro.ase.model_test.pizzerie.clase.bucatarie;

import ro.ase.model_test.pizzerie.clase.preparate.IPreparat;

import java.util.List;

public class Comanda {
    private List<IPreparat> preparate;

    public Comanda(List<IPreparat> preparate) {
        this.preparate = preparate;
    }

    public List<IPreparat> getPreparate() {
        return preparate;
    }

    public void setPreparate(List<IPreparat> preparate) {
        this.preparate = preparate;
    }

    public void addPreparat(IPreparat p)
    {
        this.preparate.add(p);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Comanda{");
        sb.append("preparate=").append(preparate);
        sb.append('}');
        return sb.toString();
    }
}
