package models;

public class Motor {
    private static final double MAX_RPM = 9000;
    private static final double MIN_RPM = 0;
    private final double cilindraje;
    private double rpm;
    private String combustible;

    public Motor(double cilindraje, double rpm, String combustible) {
        this.cilindraje = cilindraje;
        this.rpm = validarRPM(rpm);
        this.combustible = combustible;
    }

    private double validarRPM(double rpm) {
        return Math.min(Math.max(rpm, MIN_RPM), MAX_RPM);
    }

    public void acelerar(double incremento) {
        this.rpm = validarRPM(this.rpm + incremento);
    }

    public void desacelerar(double decremento) {
        this.rpm = validarRPM(this.rpm - decremento);
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public double getRpm() {
        return rpm;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return String.format(
                "Motor: %s\n" +
                        "  Cilindraje: %.2f\n" +
                        "  RPM: %.2f\n" +
                        "  Combustible: %s",
                combustible, cilindraje, rpm, combustible);
    }
}
