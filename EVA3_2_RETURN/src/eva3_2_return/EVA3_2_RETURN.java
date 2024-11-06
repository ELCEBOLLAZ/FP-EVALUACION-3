/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_return;

/**
 *
 * @author samue
 */
public class EVA3_2_RETURN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //invocar o llamar al metodo
        //SI RERESA RESULTADOS TENEMOS DOS OPCIONES
        //HACER ALGO CON EL VALOR
            //GUARDARLO Y USARLO VARIAS VECES
            int valor;
            valor = sumarDosEnteros(200, 150);
            System.out.println("Resultado = " + valor);
            //USARLO UNA SOLA VEZ
            System.out.println("Resultado = " + sumarDosEnteros(100, 50));
        //IGNORAR EL VALOR
    }
    
    //SUMAR DOS ENTEROS
    public static int sumarDosEnteros(int num1, int num2){
        int resu;
        resu = num1 + num2;
        return resu;
    }
    
}
