package Utils;

public enum Color {
    ROJO, AMARILLO, VERDE, AZUL, NARANJA, MAGENTA, ROSA, BLANCO, NEGRO;

    public static Color getRandomColor() {
        Color[] colores = Color.values();
        return colores[(int) (Math.random() * colores.length)];
    }

    public String toString() {
        return this.name();
    }
}
