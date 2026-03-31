package ro.ase.model_test.spital.clase.Singleton;

public class ConfiguratieGlobala {
    private String adresaServer;
    private int versiuneAplicatie;
    private String setariSecuritate;

    private static ConfiguratieGlobala instanta=null;

    private ConfiguratieGlobala(String adresaServer, String setariSecuritate, int versiuneAplicatie) {
        this.adresaServer = adresaServer;
        this.setariSecuritate = setariSecuritate;
        this.versiuneAplicatie = versiuneAplicatie;
    }

    public String getAdresaServer() {
        return adresaServer;
    }

    public void setAdresaServer(String adresaServer) {
        this.adresaServer = adresaServer;
    }

    public String getSetariSecuritate() {
        return setariSecuritate;
    }

    public void setSetariSecuritate(String setariSecuritate) {
        this.setariSecuritate = setariSecuritate;
    }

    public int getVersiuneAplicatie() {
        return versiuneAplicatie;
    }

    public void setVersiuneAplicatie(int versiuneAplicatie) {
        this.versiuneAplicatie = versiuneAplicatie;
    }
    public static synchronized ConfiguratieGlobala getInstanta(String adresaServer, String setariSecuritate, int versiuneAplicatie){
        if(instanta==null){
            instanta=new ConfiguratieGlobala( adresaServer, setariSecuritate, versiuneAplicatie);
            return instanta;
        }
        return instanta;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ConfiguratieGlobala{");
        sb.append("adresaServer='").append(adresaServer).append('\'');
        sb.append(", versiuneAplicatie=").append(versiuneAplicatie);
        sb.append(", setariSecuritate='").append(setariSecuritate).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
