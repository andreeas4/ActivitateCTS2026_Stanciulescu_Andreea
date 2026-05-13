package ro.ase.ex_stb.ex_composite.composite;

import ro.ase.ex_stb.ex_composite.clase.IAutobuz;

import java.util.List;

public class GrupAutobuze implements  IAutobuz{
    private String tipGrup;
    private List<IAutobuz> autobuze;

    public GrupAutobuze(String tipGrup, List<IAutobuz> autobuze) {
        this.tipGrup = tipGrup;
        this.autobuze = autobuze;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println(this.tipGrup + " cu autobuzele: ");
        for(IAutobuz a :autobuze){
            a.afiseazaDetalii();
        }
    }

    @Override
    public int getNrLocuri() {
        int totalLocuri = 0;
        for (IAutobuz element : autobuze) {
            // Polimorfism: nu contează dacă e autobuz sau alt grup
            totalLocuri += element.getNrLocuri();
        }
        return totalLocuri;
    }

    public void adaugaAutobuz(IAutobuz a)
    {
        autobuze.add(a);
    }

    public void stergeAutobuz(IAutobuz a){
        autobuze.remove(a);
    }
}
