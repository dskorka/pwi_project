package app;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Damian on 03.07.2017.
 */
public class Competence {
    private String titile;
    private Map<String,Integer> technology;

    public Competence(String titile, Map<String, Integer> technology) {
        this.titile = titile;
        this.technology = technology;
    }

    public String getTitile() {
        return titile;
    }

    public Map<String, Integer> getTechnology() {
        return technology;
    }

}
