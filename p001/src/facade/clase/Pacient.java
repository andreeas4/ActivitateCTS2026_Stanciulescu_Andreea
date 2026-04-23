package facade.clase;

public class Pacient {
    private String nume;
    private int gravitate; //de la 1 la 10

    public Pacient(String nume, int gravitate) {
        this.nume = nume;
        this.gravitate = gravitate;
    }

    public String getNume() {
        return nume;
    }

    public int getGravitate() {
        return gravitate;
    }
}
