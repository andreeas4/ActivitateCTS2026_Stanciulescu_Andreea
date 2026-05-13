package ro.ase.ex_restaurant.ex_chain_of_responsability.chain;

import ro.ase.ex_restaurant.ex_chain_of_responsability.clase.Client;

public abstract class Handler {
    protected Handler succestor=null;

    public void setSuccestor(Handler succestor) {
        this.succestor = succestor;
    }

    public abstract void notifica(Client c,String mesaj);
}
