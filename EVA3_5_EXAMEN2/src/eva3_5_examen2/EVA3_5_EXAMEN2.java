/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_examen2;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class EVA3_5_EXAMEN2 {
    //CONSTANTES: variable que se le asigna UNA sola vez el valor
    public static int PIEDRA = 1;
    public static int PAPEL = 2;
    public static int TIJERA = 3;
    
    public static int EMPATE = 0;
    public static int GANA = 1;
    public static int PIERDE = 2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resu;
        int jugada;
        int resuJug;
        do{
            resu = pedirJugada("Introduce tu jugada (1-Piedra, 2-Papel, 3-Tijeras)");
            jugada = generarJugadaComp();
            System.out.println(jugada);
            resuJug = evaluarPartida(resu, jugada);
            System.out.println(resuJug);
            
        }while(resu != 0);
    }
    
    //PEDIR DATOS AL USUARIO
    public static int pedirJugada(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        int seleccion = captu.nextInt();
        return seleccion;
    }
    
    //GENERAR LA JUGADA DE LA COMPUTADORA
    public static int generarJugadaComp(){
        int jugada;
        double valor = Math.random();
        //¿COMO GENERAMOS LA JUGADA?
        if((valor >= 0) && (valor < 0.3))
            jugada = PIEDRA;//PIEDRA
        else if((valor >= 0.3) && (valor < 0.6))
            jugada = PAPEL;//PAPEL
        else
            jugada = TIJERA;//TIJERAS
        return jugada;
    }
    
    //EVALUAR LA JUGADA
    public static int evaluarPartida(int jugadaUsu, int jugadaComp){
        int resu = 0;
        if((jugadaUsu == PIEDRA) && (jugadaComp == PIEDRA))
            resu = EMPATE;
        else if((jugadaUsu == PIEDRA) && (jugadaComp == PAPEL))
            resu = PIERDE;
        else if((jugadaUsu == PIEDRA) && (jugadaComp == TIJERA))
            resu = GANA;
        else if((jugadaUsu == PAPEL) && (jugadaComp == PIEDRA))
            resu = GANA;
        else if((jugadaUsu == PAPEL) && (jugadaComp == PAPEL))
            resu = EMPATE;
        else if((jugadaUsu == PAPEL) && (jugadaComp == TIJERA))
            resu = PIERDE;
        else if((jugadaUsu == TIJERA) && (jugadaComp == PIEDRA))
            resu = PIERDE;
        else if((jugadaUsu == TIJERA) && (jugadaComp == PAPEL))
            resu = GANA;
        else if((jugadaUsu == TIJERA) && (jugadaComp == TIJERA))
            resu = EMPATE;
        else
            System.out.println("Jugada no valida");
        return resu;
    }
    
}
