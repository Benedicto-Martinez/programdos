import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void holamundo() {
        System.out.println("mira mama mi primer programa en java");

    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("menu de ejercicio");
            System.out.println(" 1.- hola mundo");
            System.out.println("2. Suma de dos números");
            System.out.println("3. Número par o impar");
            System.out.println("4. Factorial de un número");
            System.out.println("5. Tabla de multiplicar");
            System.out.println("6.= pa juera");
            opcion = scanner.nextint();

            switch (opcion) {
                case 1:
                    holamundo();
                    break;
                case 2:
                    sumaDosNumeros();
                    break;
                case 3:
                    numeroParImpar();
                    break;
                case 4:
                    factorialNumero();
                    break;
                case 5:
                    tablaMultiplicar();
                    break;
                case 6:
                    System.out.println("saliendo del programa ");
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        }  while (option != 6);
        scanner.close();
    }
    public static void sumaDosNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
        scanner.close();
    }
    public static void numeroParImpar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " es un número par.");
        } else {
            System.out.println(num + " es un número impar.");
        }
        scanner.close();
    }
    public static void factorialNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para calcular su factorial: ");
        int num = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
        scanner.close();
    }
    public static void tablaMultiplicar(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para mostrar su tabla de multiplicar: ");
        int num = scanner.nextInt();
        System.out.println("Tabla de multiplicar del " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        scanner.close();
    }

}


