package adapter.aplicatie_spital;

public class MedicamentSpital{
    public void achizitioneazaMedicament(){

        System.out.println(
                this.prezintaReteta()?"Medicament achizitionat":
                "Medicamentul nu poate fi achizitionat!");
    }

   protected boolean prezintaReteta(){
        System.out.println("Clientul are reteta pt acest medicament");
        return true;
    }
}
