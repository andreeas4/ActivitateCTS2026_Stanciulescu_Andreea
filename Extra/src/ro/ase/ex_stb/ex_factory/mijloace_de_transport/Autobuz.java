package ro.ase.ex_stb.ex_factory.mijloace_de_transport;

public class Autobuz implements MijlocDeTransport{
    private int nrPasageri;

    public Autobuz(int nrPasageri) {
        this.nrPasageri = nrPasageri;
    }

    public int getNrPasageri() {
        return nrPasageri;
    }

    public void setNrPasageri(int nrPasageri) {
        this.nrPasageri = nrPasageri;
    }

    @Override
    public void transporta() {
        System.out.println("Autobuzul transporta "+nrPasageri+" de pasageri catre destinatie ");
    }

    @Override
    public MijlocDeTransport copiaza() {
        Autobuz copie=new Autobuz(this.nrPasageri);
        return copie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("nrPasageri=").append(nrPasageri);
        sb.append('}');
        return sb.toString();
    }
}
