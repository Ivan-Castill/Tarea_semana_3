import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Empleados empleado_1 = new Empleados("Norfe",52,408.68);
        Empleados empleado_2 = new Empleados();

        System.out.println("");
        System.out.println("------------------------------------------");
        System.out.println("Bienvenido querido Usuario.");
        System.out.println("------------------------------------------");
        System.out.println("");
        System.out.println("Ingrese el nombre del empleado: ");
        empleado_2.setNombre(input.nextLine());
        System.out.println("");
        System.out.println("Ingrese la edad del empleado: ");
        empleado_2.setEdad(input.nextInt());
        input.nextLine();
        System.out.println("");
        System.out.println("Ingrese el sueldo del empleado: ");
        empleado_2.setSueldo(input.nextDouble());
        System.out.println("------------------------------------------------------");
        System.out.println("Empledo N_1 Datos quemados:");
        System.out.println("El nombre es:" + empleado_1.getNombre());
        System.out.println("La edad que tiene es:" + empleado_1.getEdad()+" Anios");
        System.out.println("El salario es de:" + empleado_1.getSueldo()+" $");
        System.out.println("------------------------------------------------------");
        System.out.println("Empleado N_2 ingresado");
        System.out.println("El nombre es:" + empleado_2.getNombre());
        System.out.println("La edad que tiene es:" + empleado_2.getEdad()+" Anios");
        System.out.println("El salario es de:" + empleado_2.getSueldo()+" $");

    }
}
