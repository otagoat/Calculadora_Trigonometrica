import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Función (sin, cos, tan, arcsin, arccos, arctan, sinh, cosh, tanh): ");
            String funcion = sc.nextLine();

            System.out.print("Ángulo α (en grados): ");
            double angulo = sc.nextDouble();

            
            double resultado = switch (funcion.toLowerCase()){
                case "sin" -> Math.sin(angulo);
                case "cos" -> Math.cos(angulo);
                case "tan" -> Math.tan(angulo);
                case "arcsin" -> Math.toDegrees(Math.asin(angulo));
                case "arccos" -> Math.toDegrees(Math.acos(angulo));
                case "arctan" -> Math.toDegrees(Math.atan(angulo));
                case "sinh" -> Math.sinh(angulo);
                case "cosh" -> Math.cosh(angulo);
                case "tanh" -> Math.tanh(angulo);
                default -> throw new IllegalArgumentException("Función no reconocida: " + funcion);


            }; 

            

        }
    }
}
