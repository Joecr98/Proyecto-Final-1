/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Joe
 */
public class Usuarios {

    private int id;
    private String user;
    private String password;
    private String correo;

    public Usuarios() {

    }

    public Usuarios(int id) {
        this.id = id;
    }

    public Usuarios(String user, String password) {
        this.user = user;
        this.password = password; 
    }

    public Usuarios(String user, String password, String correo) {
        this.user = user;
        this.password = password;
        this.correo = correo;
    }

    public Usuarios(int id, String user, String password, String correo) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "usuarios{" + "id=" + id + ", usuario=" + user + ", password=" + password + ", correo=" + correo + '}';
    }

    public boolean datosMinimosLlenos() {
        boolean usernameBool = this.user.length() > 0;
        boolean passwordBool = this.password.length() > 0;
        boolean correoBool = this.correo.length() > 0;
        return (usernameBool && passwordBool && correoBool);
    }
}
