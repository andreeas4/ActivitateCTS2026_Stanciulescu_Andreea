package facade.clase;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private boolean paturiLibere[]=new boolean[50];
    private static Salon instance=null;
    private Salon() {
        this.paturiLibere[1]=true;
        this.paturiLibere[3]=true;
        this.paturiLibere[9]=true;
        this.paturiLibere[8]=true;
        this.paturiLibere[5]=true;
    }

    public void setPaturiLibere(int nr) {
        this.paturiLibere[nr] = false;
    }

    public int suntPaturiLibere(){

        for(int i=0;i<=paturiLibere.length;i++)
        {
            if(paturiLibere[i]==true){
                return i;
            }
        }

        return -1;
    }

    public static synchronized Salon getInstance() {
        if(instance==null){
            instance=new Salon();
            return instance;
        }
        else return instance;
    }
}
