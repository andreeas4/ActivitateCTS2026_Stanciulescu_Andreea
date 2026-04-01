package ro.ase.model_test.smart_home.clase;

public class Temperatura implements IServices{
    private String nume;

    protected Temperatura(String nume) {
        this.nume = nume;
    }

    @Override
    public void detalii() {
        System.out.println("Configuratii de Temperatura!");
    }
}
