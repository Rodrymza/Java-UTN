import java.util.Random;
//Leer el nombre y sueldo de 20 empleados y mostrar el nombre y sueldo del empleado que más gana.
public class Ejercicio08 {
    public static int elemento_mayor (int[] lista) {
        int max = lista[0], indice_mayor = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > max) {
                indice_mayor = i;
                max = lista[i];
            }
        }
        return indice_mayor;
    }
    public static void main(String[] args) {
        Random random = new Random();
        int total_empleados = 20;
        int[] sueldos = new int[total_empleados];
        String[] nombres = {"González", "Rodríguez", "Martínez", "Pérez", "Fernández", "Gómez", "López", "Díaz",
                "Torres", "Ruiz", "Sánchez", "Ramírez", "Romero", "Hernández", "Álvarez", "Molina", "Castro",
                "Vargas", "Silva", "Ortiz"};
        for (int i = 0; i < sueldos.length; i++) {
            sueldos[i] = random.nextInt(400, 800);
        }
        System.out.println("Empleados y sueldos:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + " $" + sueldos[i]);
        }
        int indice_max = elemento_mayor(sueldos);
        System.out.println("El empleado con mayor sueldo es " + nombres[indice_max] + " $" + sueldos[indice_max]);
    }
}



