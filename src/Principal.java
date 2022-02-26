public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
         Usuario[] usuarios = new Usuario[1];
        
        usuarios[0] = new Usuario(202100058,"Justy","Rodríguez","202100058", "SebastianR");//Administradores
        Login login = new Login(usuarios);//Mostrar ventana de Login
        login.setVisible(true);
    }
    
}
