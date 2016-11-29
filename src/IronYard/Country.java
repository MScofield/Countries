package IronYard;

import java.util.ArrayList;

/**
 * Created by scofieldservices on 11/29/16.
 */
public class Country {
    String name;
    String abbreviation;


    public Country() {

    }

    public Country(String name, String abbreviation) {
        this.name = name;
        this.abbreviation = abbreviation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}
