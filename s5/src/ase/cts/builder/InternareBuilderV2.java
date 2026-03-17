package ase.cts.builder;

public class InternareBuilderV2 implements InternareBuilderAbstractV2{
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean  papuciDeCamera;
    private boolean halatPentruInterior;


    public InternareBuilderV2() {

        this.halatPentruInterior=false;
        this.micDejun=false;
        this.papuciDeCamera=false;
        this.patRabatabil=false;
    }

    public InternareBuilderV2 setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    public InternareBuilderV2 setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
        return this;
    }

    public InternareBuilderV2 setPapuciDeCamera(boolean papuciDeCamera) {
        this.papuciDeCamera = papuciDeCamera;
        return this;
    }

    public InternareBuilderV2 setHalatPentruInterior(boolean halatPentruInterior) {
        this.halatPentruInterior = halatPentruInterior;
        return this;
    }



    @Override
    public Internare build(String numePacient) {
        Internare internare=new Internare(this.patRabatabil,this.micDejun,this.papuciDeCamera,this.halatPentruInterior,numePacient);
        return internare;
    }
}
