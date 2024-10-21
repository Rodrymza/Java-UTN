import java.util.ArrayList;
//En las colecciones solo pueden guardarse objetos
//En los arrays pueden guardarse ademas de objetos tipos de datos primitivos
//Las colecciones son estructuras dinamicas, mientras que los arrays se crea una estructura
// con una longitud determinada
/*
Listas: son un conjunto de elemetos ordenados
    ArraysList: similares a los arrays, pero dinamicos
    LinkedList: la lista tiene un puntero hacia el elmento anterior y otro al siguiente

Set: no estan ordenados, no se admiten elementos repetidos
    HashSet: un solo elmento
    TreeSet: usado cuando se necesita clave:valor
    LinkedHashSet:
Map: son listas con clave:valor, como los diccionarios

 */
/*
 */
public class Colecciones {
    public static void main(String[] args) {
        //creacion de ArrayList
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Rodrigo");
        nombres.add("Juan");
        nombres.add("Clara");
        nombres.add("Rocio");
        System.out.println(nombres.get(0));
        mostrarLista(nombres);

        System.out.println(nombres.contains("Fede"));

    }
    public static void mostrarLista(ArrayList<String> lista) {
        for (String nombre:lista) {
            System.out.println(nombre);
        }
    }
}
