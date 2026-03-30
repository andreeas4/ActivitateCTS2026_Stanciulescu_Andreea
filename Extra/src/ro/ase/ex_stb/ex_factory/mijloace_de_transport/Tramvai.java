package ro.ase.ex_stb.ex_factory.mijloace_de_transport;

public class Tramvai implements MijlocDeTransport{
    private int linia;

    public Tramvai(int linia) {
        this.linia = linia;
    }

    public int getLinia() {
        return linia;
    }

    public void setLinia(int linia) {
        this.linia = linia;
    }

    @Override
    public void transporta() {
        System.out.println("Tramvaiul de pe linia "+linia+" transporta pasagerii");
    }

    @Override
    public MijlocDeTransport copiaza() {
        Tramvai copie=new Tramvai(this.linia);
        return copie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tramvai{");
        sb.append("linia=").append(linia);
        sb.append('}');
        return sb.toString();
    }
}
