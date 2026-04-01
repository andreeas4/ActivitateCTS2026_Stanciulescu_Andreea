package ro.ase.model_test.smart_home.clase;

public class Securitate implements IServices{
    private String nume;

    protected Securitate(String nume) {
        this.nume = nume;
    }

    @Override
    public void detalii() {
        System.out.println("Configuratii de securitate!");
    }
}
