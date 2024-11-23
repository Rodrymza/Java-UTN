package Notificaciones;

public class CorreoElectronico extends CanalNotificacion implements Personalizable{
    private String direccion_correo;
    public CorreoElectronico(String usuario, String mensaje, String direccion_correo) {
        super(usuario, mensaje);
        this.direccion_correo = direccion_correo;
    }
    @Override
    void enviarNotificacion() {
        if (direccion_correo.contains("@")) {
            System.out.println("Correo enviado correctamente a " + getUsuario());
        } else {
            System.out.println("El correo ingresado no es valido");
        }

    }


    @Override
    public void personalizarMensaje(String mensaje_nuevo) {
        this.setMensaje(mensaje_nuevo);
        System.out.println("Correo electronico modificado satisfactoriamente");

    }
}
