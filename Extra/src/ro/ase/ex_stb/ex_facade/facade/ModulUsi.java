package ro.ase.ex_stb.ex_facade.facade;

import ro.ase.ex_stb.ex_facade.clase.UsaFata;
import ro.ase.ex_stb.ex_facade.clase.UsaMijloc;
import ro.ase.ex_stb.ex_facade.clase.UsaSpate;

public class ModulUsi {
    private UsaFata usaFata;
    private UsaMijloc usaMijloc;
    private UsaSpate usaSpate;

    public ModulUsi(UsaFata usaFata, UsaMijloc usaMijloc, UsaSpate usaSpate) {
        this.usaFata = usaFata;
        this.usaMijloc = usaMijloc;
        this.usaSpate = usaSpate;
    }

    public void dechideUsiFortat(){
        this.usaFata.deschideFortat();
        this.usaMijloc.deschideFortat();
        this.usaSpate.deschideFortat();
    }

    public void seteazaModLiberUsi(){
        this.usaFata.modLiber();
        this.usaMijloc.modLiber();
        this.usaSpate.modLiber();
    }
}
