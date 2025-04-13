package org.example;

import java.util.ArrayList;

public class Gezinslid extends Persoon {
    private ArrayList<String> eetJeMee;

    public Gezinslid(String naam) {
        super(naam);
        this.eetJeMee = new ArrayList<>();
    }

    public void voegEetDagenToe(String dagen) {
        if (dagen == null || dagen.trim().isEmpty()) {
            eetJeMee.add("maandag");
            eetJeMee.add("dinsdag");
            eetJeMee.add("woensdag");
            eetJeMee.add("donderdag");
            eetJeMee.add("vrijdag");
            eetJeMee.add("zaterdag");
            eetJeMee.add("zondag");
        } else {
            String[] dagenArray = dagen.split(",");
            for (String dag : dagenArray) {
                eetJeMee.add(dag.trim());
            }
        }
    }

    @Override
    public boolean eetMee(String dag) {
        return eetJeMee.contains(dag);
    }
}
