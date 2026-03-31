package ro.ase.model_test.magazin_it.clase.pc_uri;

public class ConfiguratiePC {
    private String procesor;

    private int memorieRAM ;

    private String placaVideo;

    private boolean racireLichida;

    private boolean  iluminareRGB;

    private boolean stocareSuplimentară;

    public ConfiguratiePC(String procesor, int memorieRAM, String placaVideo, boolean racireLichida, boolean iluminareRGB, boolean stocareSuplimentară) {
        this.procesor = procesor;
        this.memorieRAM = memorieRAM;
        this.placaVideo = placaVideo;
        this.racireLichida = racireLichida;
        this.iluminareRGB = iluminareRGB;
        this.stocareSuplimentară = stocareSuplimentară;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ConfiguratiePC{");
        sb.append("procesor='").append(procesor).append('\'');
        sb.append(", memorieRAM=").append(memorieRAM);
        sb.append(", placaVideo='").append(placaVideo).append('\'');
        sb.append(", racireLichida=").append(racireLichida);
        sb.append(", iluminareRGB=").append(iluminareRGB);
        sb.append(", stocareSuplimentară=").append(stocareSuplimentară);
        sb.append('}');
        return sb.toString();
    }
}
