package Notificaciones;

public class MensajeTexto extends CanalNotificacion implements Personalizable{
    private String numeroTelefono;
    public MensajeTexto(String usuario, String mensaje, String numeroTelefono) {
        super(usuario, mensaje);
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    void enviarNotificacion() {
        if (numero_valido()) {
            System.out.println("Mensaje de texto enviado a " + getUsuario());
        } else {
            System.out.println("El numero ingresado es incorrecto");
        }

    }

    @Override
    public void personalizarMensaje(String mensaje_nuevo) {
        this.setMensaje(mensaje_nuevo);
        System.out.println("Mensaje de texto modificado satisfactoriamente");
    }
    public boolean numero_valido(){
        try {
            int numero = Integer.parseInt(numeroTelefono);
            if (numeroTelefono.length() <= 10) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
}
