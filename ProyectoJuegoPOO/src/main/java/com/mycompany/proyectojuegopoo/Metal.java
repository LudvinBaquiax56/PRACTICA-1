/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectojuegopoo;

import static com.mycompany.proyectojuegopoo.Vehiculos.ANSI_WHITE;
import static com.mycompany.proyectojuegopoo.Vehiculos.CUADRO;

/**
 *
 * @author pc
 */
public class Metal extends Terreno {

    
    @Override
    String getCuadroColor() {
        return ANSI_WHITE + CUADRO;
    }

}
