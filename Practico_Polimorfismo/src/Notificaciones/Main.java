package Notificaciones;

public class Main {
    public static void main(String[] args) {
        Notificaciones notificaciones = new Notificaciones(); // Crear instancias de los canales de notificación
        CorreoElectronico correo = new CorreoElectronico("Juan", "Hola Juan, tienes una nueva oferta", "juan@gmail.com");
        MensajeTexto mensajeTexto = new MensajeTexto("Maria", "Hola Maria, tu pedido esta en camino", "261223308");
        notificaciones.agregar_canal(correo);
        notificaciones.agregar_canal(mensajeTexto);
        notificaciones.modificar_mensaje();
        notificaciones.enviar_notificaciones();
        notificaciones.mostrar_canales();
    }

}
