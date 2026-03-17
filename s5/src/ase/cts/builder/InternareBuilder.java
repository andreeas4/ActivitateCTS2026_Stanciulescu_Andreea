package ase.cts.builder;

public class InternareBuilder implements InternareBuilderAbstract {
    private Internare internare;

    public InternareBuilder(String Nume) {
        this.internare=new Internare(false,false,false,false,Nume);

    }
    public InternareBuilder setPat(boolean arePatRabat)
    {
        internare.patRabatabil=arePatRabat;
        return this;

    }

    public InternareBuilder setMicDejun(boolean areMicDejun)
    {
        internare.micDejun=areMicDejun;
        return this;

    }
    public InternareBuilder setPapuciDeCamera(boolean arePapuci)
    {
        internare.papuciDeCamera=arePapuci;
        return this;

    }
    public InternareBuilder setHalatPtInterior(boolean areHalat)
    {
        internare.halatPentruInterior=areHalat;
        return this;

    }

    public InternareBuilder setNume(String Nume)
    {
        internare.numePacient=Nume;
        return this;

    }

    @Override
    public Internare build() {
        return this.internare;
    }
}
