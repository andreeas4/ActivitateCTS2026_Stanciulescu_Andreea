package ro.ase.ex_stb.ex_adaptor.clase;

public class BiletTerestru {
    private int cod;

    public BiletTerestru(int cod) {
        this.cod = cod;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void verificaBilet(){
        System.out.println("Biletul de autobuz a fost verificat");
    }
}
