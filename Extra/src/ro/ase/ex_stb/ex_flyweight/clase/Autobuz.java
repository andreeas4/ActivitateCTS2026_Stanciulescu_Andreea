package ro.ase.ex_stb.ex_flyweight.clase;

public class Autobuz {
    private String model;
    private int anFabricatie; // Unic per vehicul
    private int nrLocuri;     // Unic per vehicul
    private String nrInmatriculare; // Unic per vehicul

    public Autobuz(String model, int anFabricatie, int nrLocuri, String nrInmatriculare) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
        this.nrInmatriculare = nrInmatriculare;
    }

    public String getModel() {
        return model;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }
}
