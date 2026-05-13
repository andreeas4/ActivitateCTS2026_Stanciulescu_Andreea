package ro.ase.ex_stb.ex_flyweight.clase;

public class LinieAutobuz implements ILinie{

    private int linie;
    private String primaStatie;
    private String ultimaStatie;

    public LinieAutobuz(int linie, String ultimaStatie, String primaStatie) {
        this.linie = linie;
        this.ultimaStatie = ultimaStatie;
        this.primaStatie = primaStatie;
    }

    @Override
    public void afiseazaDetalii(Autobuz a) {
        System.out.println("Autobuzul "+a.getModel()
                + " "+a.getAnFabricatie()+" "+a.getNrInmatriculare()+" cu "+a.getNrLocuri()+" locuri");
    }


}
