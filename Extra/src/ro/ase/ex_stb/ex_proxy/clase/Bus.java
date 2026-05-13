package ro.ase.ex_stb.ex_proxy.clase;

public class Bus implements IOprire{

    private Boolean suntPersoane;

    public Boolean getSuntPersoane() {
        return suntPersoane;
    }

    public Bus(Boolean suntPersoane) {
        this.suntPersoane = suntPersoane;
    }

    @Override
    public void opreste() {
        System.out.println("Autobuzul se opreste.");
    }

}
