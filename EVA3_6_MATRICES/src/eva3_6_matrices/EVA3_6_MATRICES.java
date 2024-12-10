/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_matrices;

/**
 *
 * @author samue
 */

import java.util.Scanner;

public class EVA3_6_MATRICES {

    public static void main(String[] args) {
        char[][] tablero = new char[3][3];
        inicializarTablero(tablero);
        Scanner captu = new Scanner(System.in);
        boolean gameOver = false;
        boolean playerTurn = true; // Empieza el jugador
        
  
        System.out.println("¡Bienvenido a Tic Tac Toe!");
        imprimirTablero(tablero);
        
        while (!gameOver) {
            if (playerTurn) {
                // Turno del jugador
                System.out.println("Tu turno. Ingresa la fila y columna (0, 1, 2):");
                int row = captu.nextInt();
                int col = captu.nextInt();
                
                if (movimientoValido(tablero, row, col)) {
                    tablero[row][col] = 'X';
                    playerTurn = false;
                    imprimirTablero(tablero);
                } else {
                    System.out.println("Movimiento inválido. Intenta nuevamente.");
                }
            } else {
                // Turno de la computadora
                System.out.println("Turno de la computadora:");
                boolean validMove = false;
                while (!validMove) {
                    int row = (int) (Math.random() * 3);
                    int col = (int) (Math.random() * 3);
                    if (movimientoValido(tablero, row, col)) {
                        tablero[row][col] = 'O';
                        validMove = true;
                        System.out.println("La computadora eligió: " + row + ", " + col);
                        imprimirTablero(tablero);
                    }
                }
                playerTurn = true;
            }

            // Comprobar si alguien ganó o hay empate
            if (verificarVictoria(tablero, 'X')) {
                System.out.println("¡Felicidades! Ganaste.");
                gameOver = true;
            } else if (verificarVictoria(tablero, 'O')) {
                System.out.println("La computadora ganó. ¡Suerte la próxima vez!");
                gameOver = true;
            } else if (tableroLleno(tablero)) {
                System.out.println("Es un empate.");
                gameOver = true;
            }
        }
    }

    // Inicializa el tablero vacío
    public static void inicializarTablero(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '-';
            }
        }
    }

    // Imprime el tablero
    public static void imprimirTablero(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Verifica si un movimiento es válido
    public static boolean movimientoValido(char[][] tablero, int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && tablero[row][col] == '-';
    }

    // Comprueba si hay un ganador
    public static boolean verificarVictoria(char[][] tablero, char player) {
        // Verifica filas, columnas y diagonales
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == player && tablero[i][1] == player && tablero[i][2] == player) {
                return true;
            }
            if (tablero[0][i] == player && tablero[1][i] == player && tablero[2][i] == player) {
                return true;
            }
        }
        if (tablero[0][0] == player && tablero[1][1] == player && tablero[2][2] == player) {
            return true;
        }
        if (tablero[0][2] == player && tablero[1][1] == player && tablero[2][0] == player) {
            return true;
        }
        return false;
    }

    // Verifica si el tablero está lleno
    public static boolean tableroLleno(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
