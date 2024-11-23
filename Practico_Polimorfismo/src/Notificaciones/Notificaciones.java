package Notificaciones;

import SistemPagos.Cancelable;

import java.util.ArrayList;
import java.util.Scanner;

public class Notificaciones {
    ArrayList<CanalNotificacion> canales_notificacion = new ArrayList<>();

    public Notificaciones() {
    }
    public void agregar_canal(CanalNotificacion nuevo_canal) {
        canales_notificacion.add(nuevo_canal);
    }
    public void enviar_notificaciones() {
        for (CanalNotificacion canal_actual : canales_notificacion) {
            canal_actual.enviarNotificacion();
        }
        System.out.println("Notificacion enviada a los " + canales_notificacion.toArray().length + " canales");
    }
    public void modificar_mensaje() {
        Scanner input = new Scanner(System.in);

        int i=1;
        for (CanalNotificacion canal : canales_notificacion){
            System.out.println(i + ". " + canal.getUsuario() + " - " + canal.getMensaje());
            i++;
        }
        System.out.println("Selecciona mensaje a modificar");
        int seleccion = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el nuevo mensaje para modificar");
        String mensaje = input.nextLine();
        ((Personalizable) canales_notificacion.get(seleccion-1)).personalizarMensaje(mensaje);
        System.out.println("Se modifico el mensaje");

    }
    public void mostrar_canales() {
        System.out.println("-------Canales de notificacion--------");
        for (CanalNotificacion canal : canales_notificacion) {
            System.out.println(canal.getUsuario() + " - " + canal.getMensaje());
        }
    }
}
