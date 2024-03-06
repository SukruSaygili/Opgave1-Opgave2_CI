package be.kuleuven;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Calculator c = new Calculator();
        c.optellen(5,2);
        c.aftrekken(5,2);
        c.vermenigvuldigen(5,2);
        c.delen(5,2);
    }
}