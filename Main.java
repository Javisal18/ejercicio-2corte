/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

/**
 *
 * @author javier salcedo
 */
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar Usuario");
            System.out.println("2. Buscar Usuario");
            System.out.println("3. Eliminar Usuario");
            System.out.println("4. Salir");
            System.out.print("Ingrese opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre completo: ");
                    String nombreCompleto = scanner.nextLine();
                    System.out.print("Ingrese nickname: ");
                    String nickname = scanner.nextLine();
                    System.out.print("Ingrese clave: ");
                    String clave = scanner.nextLine();
                    System.out.print("Ingrese tipo: ");
                    String tipo = scanner.nextLine();
                    System.out.print("Ingrese fecha de creación: ");
                    String fechaCreacion = scanner.nextLine();
                    new Usuario(nombreCompleto, nickname, clave, tipo, fechaCreacion);
                    break;
                case 2:
                    System.out.print("Ingrese nickname a buscar: ");
                    String nicknameBuscar = scanner.nextLine();
                    Usuario usuarioEncontrado = Usuario.buscarUsuario(nicknameBuscar);
                    if (usuarioEncontrado != null) {
                        System.out.println("Usuario encontrado:");
                        System.out.println("Nombre completo: " + usuarioEncontrado.getNombreCompleto());
                        System.out.println("Nickname: " + usuarioEncontrado.getNickname());
                        System.out.println("Clave: " + usuarioEncontrado.getClave());
                        System.out.println("Tipo: " + usuarioEncontrado.getTipo());
                        System.out.println("Fecha de creación: " + usuarioEncontrado.getFechaCreacion());
                    } else {
                        System.out.println("Usuario no encontrado");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese nickname a eliminar: ");
                    String nicknameEliminar = scanner.nextLine();
                    Usuario.eliminarUsuario(nicknameEliminar);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 4);
    }
}
    
                

       
