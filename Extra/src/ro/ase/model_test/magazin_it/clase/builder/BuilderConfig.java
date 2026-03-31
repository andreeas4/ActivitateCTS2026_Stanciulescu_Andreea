package ro.ase.model_test.magazin_it.clase.builder;

import ro.ase.model_test.magazin_it.clase.pc_uri.ConfiguratiePC;

public class BuilderConfig implements IBuilderConfig {
    private String procesor;

    private int memorieRAM ;

    private String placaVideo;

    private boolean racireLichida;

    private boolean  iluminareRGB;

    private boolean stocareSuplimentară;

    public BuilderConfig() {
        this.procesor = procesor;
        this.memorieRAM = 64;
        this.placaVideo = placaVideo;
        this.racireLichida = true;
        this.iluminareRGB = true;
        this.stocareSuplimentară = false;
    }

    public BuilderConfig(String procesor, int memorieRAM, String placaVideo, boolean racireLichida, boolean iluminareRGB, boolean stocareSuplimentară) {
        this.procesor = procesor;
        this.memorieRAM = memorieRAM;
        this.placaVideo = placaVideo;
        this.racireLichida = racireLichida;
        this.iluminareRGB = iluminareRGB;
        this.stocareSuplimentară = stocareSuplimentară;
    }

    public String getProcesor() {
        return procesor;
    }

    public BuilderConfig setProcesor(String procesor) {
        this.procesor = procesor;
        return this;
    }

    public int getMemorieRAM() {
        return memorieRAM;
    }

    public BuilderConfig setMemorieRAM(int memorieRAM) {
        this.memorieRAM = memorieRAM;
        return this;
    }

    public String getPlacaVideo() {
        return placaVideo;
    }

    public BuilderConfig setPlacaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
        return this;
    }

    public boolean isRacireLichida() {
        return racireLichida;
    }

    public BuilderConfig setRacireLichida(boolean racireLichida) {
        this.racireLichida = racireLichida;
        return this;
    }

    public boolean isIluminareRGB() {
        return iluminareRGB;
    }

    public BuilderConfig setIluminareRGB(boolean iluminareRGB) {
        this.iluminareRGB = iluminareRGB;
        return this;
    }

    public boolean isStocareSuplimentară() {
        return stocareSuplimentară;
    }

    public BuilderConfig setStocareSuplimentară(boolean stocareSuplimentară) {
        this.stocareSuplimentară = stocareSuplimentară;
        return this;
    }

    @Override
    public ConfiguratiePC build() {
        return new ConfiguratiePC(this.procesor,this.memorieRAM,this.placaVideo,this.racireLichida,this.iluminareRGB,this.stocareSuplimentară);
    }
}
