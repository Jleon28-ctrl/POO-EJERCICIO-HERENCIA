package Geometria;

public class Triangulo extends figuraGeometrica{
    private double base , altura, lado3, lado4;

    public Triangulo(){

    }

    public Triangulo(String color, double base, double altura, double lado3, double lado4){
        super(color);
        this.base = base;
        this.altura = altura;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base < 0){
            System.out.println("El lado no puede ser negativo");
        }else {
            this.base = base;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura < 0){
            System.out.println("El lado no puede ser negativo");
        }else {
            this.altura = altura;
        }
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        if (lado3 < 0){
            System.out.println("El lado no puede ser negativo");
        }else {
            this.lado3 = lado3;
        }
    }

    public double getLado4() {
        return lado4;
    }

    public void setLado4(double lado4) {
        if (lado4 < 0){
            System.out.println("El lado no puede ser negativo");
        }else {
            this.lado4 = lado4;
        }
    }

    @Override
    public double calcularArea(){
        return ((base * altura) / 2 );
    }

    @Override
    public double calcularPerimetro(){
        return (base  + lado3 + lado4);
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
    }
}
