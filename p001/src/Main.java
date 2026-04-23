import adapter.aplicatie_farmacie.AdaptorMedicamentSpital;
import adapter.aplicatie_farmacie.MedicamentFarmacie;
import adapter.aplicatie_spital.MedicamentSpital;
import facade.clase.Medic;
import facade.clase.Pacient;
import facade.clase.Salon;
import facade.spital_facade.Facade;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void realizeazaAchizitie(MedicamentFarmacie medicamentFarmacie)
    {
        medicamentFarmacie.cumparaMedicament();
    }

    public static void main(String[] args) {

     //-------------------A5----------------------------------
        MedicamentSpital paracetamol=new MedicamentSpital();
        MedicamentFarmacie nurofen=new MedicamentFarmacie();

        paracetamol.achizitioneazaMedicament();
        nurofen.cumparaMedicament();

        realizeazaAchizitie(nurofen);
        // realizeazaAchizitie(paracetamol);

        //nu putem face adapter de clase pt ca nu putem mosteni 2 clase

        //se face adapter de obiecte la farmacie

        AdaptorMedicamentSpital adaptorParacetamol=new AdaptorMedicamentSpital(paracetamol);

        realizeazaAchizitie(adaptorParacetamol);


        //----------------------A6--------------------------
        Pacient p=new Pacient("Andrei",9);
        Pacient d=new Pacient("Mariana",7);

        Salon s=Salon.getInstance();

        Medic m=new Medic("Luca");

        if(p.getGravitate()>=4){
            if(m.verificaPacientInternare(p));
                if(s.suntPaturiLibere()!=-1){
                    System.out.println("Pacientul "+p.getNume()+" trebuie internat in patul "+s.suntPaturiLibere());
                    s.setPaturiLibere(s.suntPaturiLibere());
                }
        }

        Facade fasade=new Facade(m,s);
        fasade.verificaEligibilitatePacient(d);

        Pacient e=new Pacient("Gloria",4);
        Pacient f=new Pacient("Ileana",8);
        fasade.verificaEligibilitatePacient(e);
        fasade.verificaEligibilitatePacient(f);

    }
}