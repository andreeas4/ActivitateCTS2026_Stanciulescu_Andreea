package ro.ase.model_test.echipamente_sportive.clase.Prototype;

import ro.ase.model_test.echipamente_sportive.clase.ISportiv;

public class DesignComplex implements IPrototype {
    private String sport;
    private String dimensiune;

    public DesignComplex(ISportiv sportiv) {
        this.sport = sportiv.getSport();
        this.dimensiune = sportiv.getMarime();
    }

    public DesignComplex() {
    }

    @Override
    public DesignComplex copy() {
        DesignComplex clona=new DesignComplex();
        clona.dimensiune=this.dimensiune;
        clona.sport=this.sport;
        return clona;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DesignComplex{");
        sb.append("sport='").append(sport).append('\'');
        sb.append(", dimensiune='").append(dimensiune).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
