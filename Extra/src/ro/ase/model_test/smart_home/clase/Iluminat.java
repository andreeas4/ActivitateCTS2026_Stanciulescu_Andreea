package ro.ase.model_test.smart_home.clase;

public class Iluminat implements IServices{
    private String nume;

    protected Iluminat(String nume) {
        this.nume = nume;
    }

    @Override
    public void detalii() {
        System.out.println("Configurtii de Iluminat");
    }
}
