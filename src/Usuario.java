public class Usuario {
    //variables a usar
    int dpi;
    String nombreUsuario;
    String apellidoUsuario;
    int rol;
    String password;
    String nickname;
    //fin variables a usar
    //creador de los parametros
    Usuario(int dpi,String nombreUsuario, String apellidoUsuario, String password, String nickname){
        this.dpi = dpi;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.password = password;
        this.nickname=nickname;
    }
    //fin de los parametros

    //inicio get/set de todas las variables (con método rápido)
    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getnickname() {
        return nickname;
    }

    public void setnickname(String nickname) {
        this.nickname = nickname;
    }

    static class usuarios {

        public usuarios() {
        }
    }
//fin get/set de todas las variables
 
}
