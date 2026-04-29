package ro.ase.cts.compositeEx.clase;

public class Sectia implements Structura {
    private String numeSectie;
    private int nrAngajati;

    public Sectia(String numeSectie, int nrAngajati) {
        this.numeSectie = numeSectie;
        this.nrAngajati = nrAngajati;
    }


    @Override
    public void afiseazaDetalii() {
        final StringBuilder sb = new StringBuilder("Sectie{");
        sb.append("numeSectie='").append(numeSectie).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append('}');
        System.out.println(sb.toString());
    }
}
