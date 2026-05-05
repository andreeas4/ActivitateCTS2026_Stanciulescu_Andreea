package Command.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<IComanda> comenzi=new ArrayList<>();

    public void inregireaza(IComanda comanda){//invocare
        comenzi.add(comanda);
    }
    public void executaComanda()
    {
        if(comenzi.size()>0)
        {
           comenzi.get(0).executa();
           comenzi.remove(0);

        }
    }
}
