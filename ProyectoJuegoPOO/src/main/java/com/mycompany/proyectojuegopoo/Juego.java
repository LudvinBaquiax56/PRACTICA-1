/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectojuegopoo;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public final class Juego {

    public final int tamañoTablero = 6;

    Terreno[][] tablero;

    public Juego() {

        tablero = new Terreno[tamañoTablero][tamañoTablero];
        iniciarTablero();

    }

    public void moverVehiculo() {
        int x, y, d;
        Scanner n = new Scanner(System.in);
        System.out.println("Posición y:");
        x = n.nextInt();
        System.out.println("Posición x:");
        y = n.nextInt();
        System.out.println("0 izquierda, 1 derecha:");
        d = n.nextInt();

        if (movimientoValido(x, y, 1) && movimientoValido(x, y, 0)) {
            if (movimientoValido(tablero[x][y], tablero[(x + 1)][(y + 1)])) {
                moverDama(tablero[x][y], tablero[(x + 1)][(y + 1)]);
            } else {
                System.out.println("Movimiento invalido");
            }
        } else {
            System.out.println("Movimiento fuera de rango");
        }

    }

    public void moverDama(Terreno co, Terreno cd) {
        cd.setDama(co.getDama());
        co.setDama(null);

    }

    public boolean movimientoValido(Terreno co, Terreno cd) {
        if (cd.isEmpty() && !co.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean movimientoValido(int x, int y, int m) {
        x += m;
        y += m;
        if ((x >= 0) && (x <= 7) && (y >= 0) && (y <= 7)) {
            return true;
        }
        return false;
    }

    public void jugar(){
        pintaTablero();
        moverVehiculo();
        pintaTablero();
        moverVehiculo();
        pintaTablero();



    }
    public void iniciarTablero() {
        boolean blanco = true;

        for (int i = 0; i < tamañoTablero; i++) {
            for (int j = 0; j < tamañoTablero; j++) {

                blanco = !blanco;

                if (blanco) {
                    tablero[i][j] = new campo();
                } else {
                    tablero[i][j] = new Metal();
                }
            }
            blanco = !blanco;
        }
    }

    public void pintaTablero() {
        String linea1 = "";
        String linea2 = "";
        String linea3 = "";
        String linea4 = "";

        for (int i = 0; i < tamañoTablero; i++) {
            for (int j = 0; j < tamañoTablero; j++) {
                linea1 = linea1 + tablero[i][j].getLine1();
                linea2 += tablero[i][j].getLine2();
                linea3 += tablero[i][j].getLine3();
                if (j == tamañoTablero - 1) {
                    linea2 += "  " + i;
                }
                if (i == tamañoTablero - 1) {
                    linea4 += "   " + j + "  ";
                }
            }
            System.out.println(linea1);
            System.out.println(linea2);
            System.out.println(linea3);
            linea1 = "";
            linea2 = "";
            linea3 = "";
        }
        System.out.println(linea4);

    }

}
