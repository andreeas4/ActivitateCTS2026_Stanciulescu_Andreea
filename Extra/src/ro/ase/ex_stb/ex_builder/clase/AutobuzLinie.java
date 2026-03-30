package ro.ase.ex_stb.ex_builder.clase;

public class AutobuzLinie {
    private String modelAutobuz;
    private String sofer;
    private boolean areOpriri;
    private boolean deschideUsiFaraCerere;
    private String infoEcran;
    private int nrPasageri;

    public AutobuzLinie(int nrPasageri, String infoEcran, boolean deschideUsiFaraCerere, boolean areOpriri, String sofer, String modelAutobuz) {
        this.nrPasageri = nrPasageri;
        this.infoEcran = infoEcran;
        this.deschideUsiFaraCerere = deschideUsiFaraCerere;
        this.areOpriri = areOpriri;
        this.sofer = sofer;
        this.modelAutobuz = modelAutobuz;
    }

    public String getModelAutobuz() {
        return modelAutobuz;
    }

    public String getSofer() {
        return sofer;
    }

    public boolean isAreOpriri() {
        return areOpriri;
    }

    public boolean isDeschideUsiFaraCerere() {
        return deschideUsiFaraCerere;
    }

    public String getInfoEcran() {
        return infoEcran;
    }

    public int getNrPasageri() {
        return nrPasageri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("modelAutobuz='").append(modelAutobuz).append('\'');
        sb.append(", sofer='").append(sofer).append('\'');
        sb.append(", areOpriri=").append(areOpriri);
        sb.append(", deschideUsiFaraCerere=").append(deschideUsiFaraCerere);
        sb.append(", infoEcran='").append(infoEcran).append('\'');
        sb.append(", nrPasageri=").append(nrPasageri);
        sb.append('}');
        return sb.toString();
    }
}
