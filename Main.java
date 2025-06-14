import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Función (sin, cos, tan, arcsin, arccos, arctan, sinh, cosh, tanh): ");
            String funcion = sc.nextLine();

            System.out.print("Ángulo α (en grados): ");
            double angulo = sc.nextDouble();

            
            double resultado = switch (funcion.toLowerCase()){}

        }
    }
}
