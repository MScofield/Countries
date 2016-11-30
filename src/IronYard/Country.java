package IronYard;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by scofieldservices on 11/29/16.
 */
public class Country {
    String name;
    String abbreviation;


    public Country() {

    }

    @Override
    public String toString() {


//        StringBuilder builder = new StringBuilder();
//        for (IDK) {
//            builder.append(n.name + "\n")

 //       }
        return ("["+abbreviation+"]:["+name+"]\n");
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
