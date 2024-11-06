/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_captura;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class EVA3_3_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = capturarTexto("Introduce tu nombre");
        String apellido = capturarTexto("Introduce tu apellido");
        int edad = pedirEdad("Introduce tu edad");
        double salario = pedirSalario("Introduce tu salario");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
    
    public static String capturarTexto(String mensaje){
        Scanner captu = new Scanner(System.in);
        String texto;
        System.out.println(mensaje);
        texto = captu.nextLine();
        return texto;
    }
    
    public static int pedirEdad(String mensaje){
        Scanner captu = new Scanner(System.in);
        int edad;
        System.out.println(mensaje);
        edad = captu.nextInt();
        return edad;
    }
    
    public static double pedirSalario(String mensaje){
        Scanner captu = new Scanner(System.in);
        double salario;
        System.out.println(mensaje);
        salario = captu.nextDouble();
        return salario;
    }
    
}
