package ro.ase.model_test.smart_home.clase;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class RegistruConfiguratii {
    private static Map<String,IServices> instante=new HashMap<>();

    public static synchronized IServices getConfig(String nume) {

            if (!instante.containsKey(nume)) {
                if (Objects.equals(nume, "Iluminat")) {
                    instante.put("Iluminat", new Iluminat(nume));
                }
                if (Objects.equals(nume, "Securitate")) {
                    instante.put("Securitate", new Securitate(nume));
                }
                if (nume.equals("Temperatura")) {
                    instante.put("Temperatura", new Temperatura(nume));
                }

            }
        IServices rezultat = instante.get(nume);
            if(rezultat==null){
                return new IServices() {
                    @Override
                    public void detalii() {
                        System.out.println("LOG: S-a încercat accesarea unui serviciu inexistent: " + nume);
                    }
                };
            }

        return rezultat;

    }
}
