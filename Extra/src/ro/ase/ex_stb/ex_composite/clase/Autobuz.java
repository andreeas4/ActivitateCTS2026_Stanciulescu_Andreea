package ro.ase.ex_stb.ex_composite.clase;

public class Autobuz implements IAutobuz {
    private String producator;
    private int nrLocuri;
    private String model;

    public Autobuz(String producator, String model, int nrLocuri) {
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    @Override
    public void afiseazaDetalii() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("producator='").append(producator).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append(", model='").append(model).append('\'');
        sb.append('}');
        System.out.println(sb.toString());

    }


}
