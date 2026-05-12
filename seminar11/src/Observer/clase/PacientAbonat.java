package Observer.clase;

public class PacientAbonat implements IPacient{
    private String nume;
    private int varsta;

    public PacientAbonat(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public void receptioneazaMesaj(String mesaj) {
        System.out.println("Pacientul "+ this.nume+" a primit urmatorul mesaj: "+mesaj);
    }
}
