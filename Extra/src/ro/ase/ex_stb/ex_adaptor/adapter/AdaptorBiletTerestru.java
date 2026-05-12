package ro.ase.ex_stb.ex_adaptor.adapter;

import ro.ase.ex_stb.ex_adaptor.clase.BiletTerestru;
import ro.ase.ex_stb.ex_adaptor.clase.IValidatorSubteran;

public class AdaptorBiletTerestru implements IValidatorSubteran {

    private BiletTerestru bilet;

    public AdaptorBiletTerestru(BiletTerestru bilet) {
        this.bilet = bilet;
    }

    @Override
    public void valideazaBilet() {
        this.bilet.verificaBilet();
    }
}
