package cz.davesupolik.basics.variables;

import java.util.Date;

public class ReferenceVariables {
    public static void main(String[] args) {
        System.out.println("REFERENCE VARIABLES");

        // Vytvoření instance třídy Date obsahující aktuální datum a čas
        Date now = new Date();
        System.out.println("Aktuální čas: " + now);
    }
}
