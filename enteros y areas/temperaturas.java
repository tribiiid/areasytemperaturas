import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);

        System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
        fahrenheit = scanner.nextDouble();

        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("La temperatura en Celsius es: " + celsius);
    }
}