package be.kuleuven;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void gegevenGetal1EnGetal2_SomWordtTeruggegeven() {
        Calculator c = new Calculator();
        double som = c.optellen(5,2);
        assert (som == 7);
    }

    @Test
    public void gegevenGetal1EnGetal2_VerschilWordtTeruggegeven() {
        Calculator c = new Calculator();
        double som = c.aftrekken(5,2);
        assert (som == 3);
    }

    @Test
    public void gegevenGetal1EnGetal2_ProductWordtTeruggegeven() {
        Calculator c = new Calculator();
        double som = c.vermenigvuldigen(5,2);
        assert (som == 10);
    }

    @Test
    public void gegevenGetal1EnGetal2_QuotientWordtTeruggegeven() {
        Calculator c = new Calculator();
        double som = c.delen(5,2);
        assert (som == 2.5);
    }


}
