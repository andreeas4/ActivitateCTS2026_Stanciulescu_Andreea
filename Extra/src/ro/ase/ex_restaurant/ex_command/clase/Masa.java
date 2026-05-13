package ro.ase.ex_restaurant.ex_command.clase;

public class Masa {
    private int nrMasa;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public void rezerva(){
        System.out.println("Masa cu nr "+this.nrMasa+ "este rezervata");
    }

    public void ocupa(){
        System.out.println("Masa cu nr "+this.nrMasa+ "este ocupata");
    }
}
