package ase.cts.builder;

public class Internare {
    protected boolean patRabatabil;
    protected boolean micDejun;
    protected boolean  papuciDeCamera;
    protected boolean halatPentruInterior;
    protected String numePacient;

    public Internare(boolean patRabatabil, boolean micDejun, boolean papuciDeCamera, boolean halatPentruInterior, String numePacient) {
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.papuciDeCamera = papuciDeCamera;
        this.halatPentruInterior = halatPentruInterior;
        this.numePacient = numePacient;
    }

    public void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    public void setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
    }

    public void setPapuciDeCamera(boolean papuciDeCamera) {
        this.papuciDeCamera = papuciDeCamera;
    }

    public void setHalatPentruInterior(boolean halatPentruInterior) {
        this.halatPentruInterior = halatPentruInterior;
    }

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("patRabatabil=").append(patRabatabil);
        sb.append(", micDejun=").append(micDejun);
        sb.append(", papuciDeCamera=").append(papuciDeCamera);
        sb.append(", halatPentruInterior=").append(halatPentruInterior);
        sb.append(", numePacient='").append(numePacient).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
