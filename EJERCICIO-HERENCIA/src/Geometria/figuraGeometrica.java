package Geometria;

public class figuraGeometrica {
    private String color;

    public figuraGeometrica() {
    }

    public figuraGeometrica(String color) {
        this.color = "Azul";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calcularArea(){
        return 0;
    }

    public double calcularPerimetro(){
        return 0;
    }

    public void imprimirDatos(){
        System.out.println("Color: " + color);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }
}
