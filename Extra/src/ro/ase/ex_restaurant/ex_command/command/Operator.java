package ro.ase.ex_restaurant.ex_command.command;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    public List<ICommand> comenzi;

    public Operator() {
        this.comenzi=new ArrayList<>();
    }

    public void primesteComanda(ICommand c){
        comenzi.add(c);
    }

    public void executaComenzi(){
        for(ICommand c:comenzi){
            c.executa();
        }
        comenzi.clear();
    }
}
