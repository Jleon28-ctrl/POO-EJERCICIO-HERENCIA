import Geometria.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        figuraGeometrica figura = new figuraGeometrica();
        Cuadrado cuadrado = new Cuadrado();
        Rectangulo rectangulo = new Rectangulo();
        Circulo circulo = new Circulo();
        Triangulo triangulo = new Triangulo();

        int opcion;
        do {
            System.out.println("---- MENÚ DE FIGURAS GEOMÉTRICAS ----");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectángulo");
            System.out.println("3. Circulo");
            System.out.println("4. Triángulo");
            System.out.println("5. Salir");
            System.out.println("Escoja una opción");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el lado: ");
                    double lado = sc.nextDouble();

                    cuadrado = new Cuadrado(figura.getColor(), lado);
                    System.out.println("-- INFORMACÓN --");
                    cuadrado.imprimirDatos();
                    cuadrado.calcularArea();
                    cuadrado.calcularPerimetro();
                    break;

                case 2:
                    System.out.println("Ingrese el lado1: ");
                    double lado1 = sc.nextDouble();

                    System.out.println("Ingrese el lado2: ");
                    double lado2 = sc.nextDouble();

                    rectangulo = new Rectangulo(figura.getColor(), lado1, lado2);
                    System.out.println("-- INFORMACÓN --");
                    rectangulo.imprimirDatos();
                    rectangulo.calcularArea();
                    rectangulo.calcularPerimetro();
                    break;

                case 3:
                    System.out.println("Ingrese el radio: ");
                    double radio = sc.nextDouble();

                    circulo = new Circulo(figura.getColor(), radio);
                    System.out.println("-- INFORMACÓN --");
                    circulo.imprimirDatos();
                    circulo.calcularArea();
                    circulo.calcularPerimetro();
                    break;

                case 4:
                    System.out.println("Ingrese la base: ");
                    double base = sc.nextDouble();

                    System.out.println("Ingrese la altura: ");
                    double altura = sc.nextDouble();

                    System.out.println("Ingrese el lado 3: ");
                    double lado3 = sc.nextDouble();

                    System.out.println("Ingrese el lado 4: ");
                    double lado4 = sc.nextDouble();

                    triangulo = new Triangulo (figura.getColor(), base, altura, lado3, lado4);
                    System.out.println("-- INFORMACÓN --");
                    triangulo.imprimirDatos();
                    triangulo.calcularArea();
                    triangulo.calcularPerimetro();
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }while (opcion != 5);

    }
}