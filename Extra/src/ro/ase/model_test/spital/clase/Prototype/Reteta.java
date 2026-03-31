package ro.ase.model_test.spital.clase.Prototype;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements IReteta {
    private Map<String, Double> listaMedicamente=new HashMap<String, Double>();

    public Reteta(Map<String, Double> listaMedicamente) {
        this.listaMedicamente = listaMedicamente;
    }

    public Reteta(String siropCalmant, Map<String, Double> ingredienteBaza) {
    }

    public Map<String, Double> getListaMedicamente() {
        return listaMedicamente;
    }

    public void setListaMedicamente(Map<String, Double> listaMedicamente) {
        this.listaMedicamente = listaMedicamente;
    }

    public Reteta() {
    }

    @Override
    public IReteta copy() {
        //shallow copy
        Reteta copy = new Reteta();
        copy.listaMedicamente= new HashMap<>(this.listaMedicamente);
        return copy;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("listaMedicamente=").append(listaMedicamente);
        sb.append('}');
        return sb.toString();
    }
}
