package ro.ase.cts.simpleFactory.clase.mijloace_transport;

public class Autobuz implements MijlocDeTransport{
    private Integer nrLinie;
    private String marca;

    public Autobuz(Integer nrLinie, String marca) {
        this.nrLinie = nrLinie;
        this.marca = marca;
    }

    @Override
    public void afiseazaTipTransport() {
        StringBuilder sb=new StringBuilder();
        sb.append("Autobuzul de pe linia");
        sb.append(nrLinie);
        sb.append(" este produs de ").append(marca);
        System.out.println(sb.toString());
    }
}
