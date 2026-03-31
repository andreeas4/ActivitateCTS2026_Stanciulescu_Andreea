package ro.ase.model_test.magazin_it.clase;

import ro.ase.model_test.magazin_it.clase.pc_uri.ConfiguratiePC;

import java.util.ArrayList;
import java.util.List;

//singleton
public class AtelierAsamblare {
    private List<ConfiguratiePC> pcs=new ArrayList<>();
    private static AtelierAsamblare instanta=null;

    private AtelierAsamblare(List<ConfiguratiePC> pcs) {
        this.pcs = pcs;
    }

    private AtelierAsamblare() {
    }

    public void adaugaPc(ConfiguratiePC pc){
        pcs.add(pc);
    }

    public List<ConfiguratiePC> getPcs() {
        return pcs;
    }

    public void setPcs(List<ConfiguratiePC> pcs) {
        this.pcs = pcs;
    }

    public static synchronized AtelierAsamblare getInstanta(){
        if(instanta==null){
            instanta=new AtelierAsamblare();
            return instanta;
        }
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AtelierAsamblare{");
        sb.append("pcs=").append(pcs);
        sb.append('}');
        return sb.toString();
    }
}
