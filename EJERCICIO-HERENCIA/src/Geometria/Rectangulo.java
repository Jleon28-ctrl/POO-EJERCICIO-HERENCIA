package Geometria;

public class Rectangulo extends figuraGeometrica{
    private double lado1 , lado2;

    public Rectangulo (){

    }

    public Rectangulo(String color, double lado1, double lado2){
        super(color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        if (lado1 < 0){
            System.out.println("El lado no puede ser negativo");
        }else {
            this.lado1 = lado1;
        }
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        if (lado2 < 0){
            System.out.println("El lado no puede ser negativo");
        }else {
            this.lado2 = lado2;
        }
    }

    @Override
    public double calcularArea(){
        return (lado1 * lado2);
    }

    @Override
    public double calcularPerimetro(){
        return 2 * (lado1 + lado2);
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
    }
}
