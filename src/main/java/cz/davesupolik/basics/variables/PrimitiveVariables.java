package cz.davesupolik.basics.variables;

public class PrimitiveVariables {
    public static void main(String[] args) {
        System.out.println("PRIMITIVE VARIABLES");

        // 1byte a rozmezí [-128, 127]
        byte age = 25;

        // 2byte a rozmezí [-32K,32K]
        short monthlySalary = 31_313;

        // 4byte a rozmezí [-2B,2B]
        int yearlySalary = 375_756;

        // 8byte - musí mít za číslem syntax L
        long viewsCount = 1_233_456_789L;

        // 4byte - desetinné číslo, taktéž syntax F za číslem
        float newPrice = 10.99F;

        // 8byte - nemusí být syntax
        double oldPrice = 345.99;

        // 2byte - pro uložení písmene
        char letter = 'A';

        // 1byte = výsledek jen true/false
        boolean isEligible = true;

        // výpis všech deklarovaných variables do příkazového řádku
        System.out.println("Věk: " + age);
        System.out.println("Měsíční plat: " + monthlySalary);
        System.out.println("Roční plat: " + yearlySalary);
        System.out.println("Počet slédnutí: " + viewsCount);
        System.out.println("Nová cena: " + newPrice);
        System.out.println("Stará cena: " + oldPrice);
        System.out.println("Písmeno:" + letter);
        System.out.println("Je plnoletý?: " + isEligible);
    }
}
