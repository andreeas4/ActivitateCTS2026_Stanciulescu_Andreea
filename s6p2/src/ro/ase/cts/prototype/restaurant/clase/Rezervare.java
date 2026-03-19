package ro.ase.cts.prototype.restaurant.clase;

public class Rezervare implements IRezervare{
    private String numeClient;
    private int ora;
    private int nrPersoane;
    private String nrCard; //are permisiune

    private Rezervare() {
    }

    public Rezervare(String numeClient, int ora, int nrPersoane, String nrCard) {
        this.numeClient = numeClient;

        if(ora>=11 && ora <=22){
            this.ora = ora;
        }
        else {
            this.ora=11;
        }

        this.nrPersoane = nrPersoane;
        if(nrCard.length()==16){
            this.nrCard = nrCard;
        }
        else {
            this.nrCard="0000000000000000";
        }

    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public int getOra() {
        return ora;
    }

    public void setOra(int ora) {
        this.ora = ora;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public String getNrCard() {
        return nrCard;
    }

    public void setNrCard(String nrCard) {
        this.nrCard = nrCard;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", ora=").append(ora);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", nrCard='").append(nrCard).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public IRezervare copiaza() {
       //deepCopy
       Rezervare rezervareCopie=new Rezervare();

       rezervareCopie.numeClient=numeClient;
       rezervareCopie.ora=ora;
       rezervareCopie.nrCard=nrCard;
       rezervareCopie.nrPersoane=nrPersoane;


       return rezervareCopie;
    }
}
