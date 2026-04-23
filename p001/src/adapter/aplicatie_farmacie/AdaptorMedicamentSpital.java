package adapter.aplicatie_farmacie;

import adapter.aplicatie_spital.MedicamentSpital;

public class AdaptorMedicamentSpital extends MedicamentFarmacie{

    private MedicamentSpital medicamentSpital;

    public AdaptorMedicamentSpital(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
       medicamentSpital.achizitioneazaMedicament();
    }
}
