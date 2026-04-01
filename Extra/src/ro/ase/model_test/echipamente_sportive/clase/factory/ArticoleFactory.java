package ro.ase.model_test.echipamente_sportive.clase.factory;

import ro.ase.model_test.echipamente_sportive.clase.kit_sportiv.articole_sportive.*;

public class ArticoleFactory {

        public IArticolSportiv getArticol(ArticoleSportive tip, String culoare) {
            return switch (tip) {
                case JAMBIERE -> new Jambiere(culoare);
                case TRICOU -> new Tricou(culoare);
                case SORT -> new Sort(culoare);
                case TRENING -> new Trening(culoare);
                default -> null;
            };
        }


}
