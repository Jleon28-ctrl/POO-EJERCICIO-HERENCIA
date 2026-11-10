package Geometria;

public class Cuadrado extends figuraGeometrica{
    private double lado;

    public Cuadrado(){

    }

    public Cuadrado(String color, double lado){
        super(color);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado < 0){
            System.out.println("El lado no puede ser negativo");
        }else {
            this.lado = lado;
        }
    }

    @Override
    public double calcularArea(){
        return (lado * lado);
    }

    @Override
    public double calcularPerimetro(){
        return (lado * 4);
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
    }
}
