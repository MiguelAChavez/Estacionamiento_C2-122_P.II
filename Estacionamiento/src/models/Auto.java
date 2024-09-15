package models;

public class Auto {
    private final String marca;
    private final String modelo;
    private String color;
    private String placa;
    private Motor motor;

    public Auto(String marca, String modelo, String color, String placa, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
        this.motor = motor;
    }

    public Auto(String marca, String modelo, String color, String placa, double cilindraje, double rpm,
            String combustible) {
        this(marca, modelo, color, placa, new Motor(cilindraje, rpm, combustible));
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public Motor getMotor() {
        return motor;
    }

    public void acelerar(double incremento) {
        motor.acelerar(incremento);
    }

    public void desacelerar(double decremento) {
        motor.desacelerar(decremento);
    }

    @Override
    public String toString() {
        return String.format(
                "Auto: %s %s\n" +
                        "  Color: %s\n" +
                        "  Placa: %s\n" +
                        "  Motor: %s",
                marca, modelo, color, placa, motor);
    }
}
