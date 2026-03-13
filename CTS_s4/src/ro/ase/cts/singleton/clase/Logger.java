package ro.ase.cts.singleton.clase;

public class Logger {
    protected int cod;
    protected String sender;
    protected String categorie;
    private static Logger instanta=null;

    private Logger(String categorie, String sender) {
        this.categorie = categorie;
        this.sender = sender;
        this.cod = 0;
    }

    private Logger() {
    }

    public int getCod() {
        return cod;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void afiseazaLog(String text){
        System.out.println("Log cu id "+ cod+" efectuat de utilizatorul "
                +sender +" a constat in "
                + text +" din categoria");
        this.cod++;
    }

    public static synchronized Logger getInstanta(String sender,String categorie){
        if(instanta==null){
            instanta=new Logger(categorie,sender);
        }
        return instanta;
    }

}
