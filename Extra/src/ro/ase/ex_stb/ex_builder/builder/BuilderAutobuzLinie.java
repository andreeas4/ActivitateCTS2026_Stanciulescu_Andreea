package ro.ase.ex_stb.ex_builder.builder;

import ro.ase.ex_stb.ex_builder.clase.AutobuzLinie;

public class BuilderAutobuzLinie implements AbstractBuilder{
    private String modelAutobuz;
    private String sofer;
    private boolean areOpriri;
    private boolean deschideUsiFaraCerere;
    private String infoEcran;
    private int nrPasageri;

    public BuilderAutobuzLinie setModelAutobuz(String modelAutobuz) {
        this.modelAutobuz = modelAutobuz;
        return this;
    }

    public BuilderAutobuzLinie setSofer(String sofer) {
        this.sofer = sofer;
        return this;
    }

    public BuilderAutobuzLinie setAreOpriri(boolean areOpriri) {
        this.areOpriri = areOpriri;
        return this;
    }

    public BuilderAutobuzLinie setDeschideUsiFaraCerere(boolean deschideUsiFaraCerere) {
        this.deschideUsiFaraCerere = deschideUsiFaraCerere;
        return this;
    }

    public BuilderAutobuzLinie setInfoEcran(String infoEcran) {
        this.infoEcran = infoEcran;
        return this;
    }

    public BuilderAutobuzLinie setNrPasageri(int nrPasageri) {
        this.nrPasageri = nrPasageri;
        return this;
    }

    public BuilderAutobuzLinie(int nrPasageri, String infoEcran, boolean deschideUsiFaraCerere, boolean areOpriri, String sofer, String modelAutobuz) {
        this.nrPasageri = nrPasageri;
        this.infoEcran = "Detalii statii: Statia x in 100m";
        this.deschideUsiFaraCerere = false;
        this.areOpriri = true;
        this.sofer = sofer;
        this.modelAutobuz = modelAutobuz;
    }

    public BuilderAutobuzLinie() {
        this.nrPasageri = nrPasageri;
        this.infoEcran = "Detalii statii: Statia x in 100m";
        this.deschideUsiFaraCerere = false;
        this.areOpriri = true;
        this.sofer = sofer;
        this.modelAutobuz = modelAutobuz;
    }

    @Override
    public AutobuzLinie build() {
        return new AutobuzLinie(this.nrPasageri,this.infoEcran,this.deschideUsiFaraCerere,this.areOpriri,this.sofer,this.modelAutobuz);
    }
}
