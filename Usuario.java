/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * javier salcedo
 */
class Usuario {
    private String nombreCompleto;
    private String nickname;
    private String clave;
    private String tipo;
    private String fechaCreacion;
    private static Map<String, Usuario> usuarios = new HashMap<>();

    public Usuario(String nombreCompleto, String nickname, String clave, String tipo, String fechaCreacion) {
        this.nombreCompleto = nombreCompleto;
        this.nickname = nickname;
        this.clave = clave;
        this.tipo = tipo;
        this.fechaCreacion = fechaCreacion;
        usuarios.put(nickname, this);
    }

    public static Usuario buscarUsuario(String nickname) {
        return usuarios.get(nickname);
    }

    public static void eliminarUsuario(String nickname) {
        usuarios.remove(nickname);
    }

    // Getters y setters
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getNickname() {
        return nickname;
    }

    public String getClave() {
        return clave;
    }

    public String getTipo() {
        return tipo;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }
}