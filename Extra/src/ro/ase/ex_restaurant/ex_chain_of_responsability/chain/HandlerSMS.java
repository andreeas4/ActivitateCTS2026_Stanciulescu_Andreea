package ro.ase.ex_restaurant.ex_chain_of_responsability.chain;

import ro.ase.ex_restaurant.ex_chain_of_responsability.clase.Client;

public class HandlerSMS extends Handler{
    @Override
    public void notifica(Client c, String mesaj) {
        if(c.getNrTelefon()!=null&&!c.getNrTelefon().isEmpty()){
            System.out.println("S-a trm SMS lui "+c.getNume() +" cu : " + mesaj);
        }
        else if (succestor!=null)
        {
            succestor.notifica(c,mesaj);
        }

    }
}
