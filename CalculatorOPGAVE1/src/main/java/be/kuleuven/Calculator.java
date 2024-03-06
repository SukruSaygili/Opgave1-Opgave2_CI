package be.kuleuven;

public class Calculator {

    public Calculator() {
    }

    public double optellen(double getal1, double getal2) {
        double som = getal1 + getal2;
        System.out.print("Resultaat:");
        System.out.println(som);
        return som;
    }

    public double aftrekken(double getal1, double getal2) {
        double verschil = getal1 - getal2;
        System.out.print("Resultaat:");
        System.out.println(verschil);
        return verschil;
    }

    public double vermenigvuldigen(double getal1, double getal2) {
        double deling = getal1 * getal2;
        System.out.print("Resultaat:");
        System.out.println(deling);
        return deling;
    }

    public double delen(double getal1, double getal2) {
        double product = getal1 / getal2;
        System.out.print("Resultaat:");
        System.out.println(product);
        return product;
    }
}
