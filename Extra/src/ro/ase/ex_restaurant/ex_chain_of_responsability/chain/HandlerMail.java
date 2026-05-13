package ro.ase.ex_restaurant.ex_chain_of_responsability.chain;

import ro.ase.ex_restaurant.ex_chain_of_responsability.clase.Client;

public class HandlerMail extends Handler{
    @Override
    public void notifica(Client c,String mesaj) {
        if(c.getEmail()!=null&&!c.getEmail().isEmpty()){
            System.out.println("S-a trimis MAIL la "+c.getNume()+" cu "+mesaj );
        }
        else System.out.println("nu se poate contacta clientul ");
    }
}
