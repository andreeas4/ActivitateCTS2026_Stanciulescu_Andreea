package ro.ase.ex_stb.ex_factory.mijloace_de_transport;

public class Troleibuz implements MijlocDeTransport{
    private String zona;

    public Troleibuz(String zona) {
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public void transporta() {
        System.out.println("Troleibuzul din zona "+zona+" transporta pasagerii");
    }

    @Override
    public MijlocDeTransport copiaza() {
        Troleibuz copie=new Troleibuz(this.zona);
        return copie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Troleibuz{");
        sb.append("zona='").append(zona).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
