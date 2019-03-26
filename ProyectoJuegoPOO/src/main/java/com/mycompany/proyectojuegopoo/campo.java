/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectojuegopoo;

import static com.mycompany.proyectojuegopoo.Vehiculos.ANSI_YELLOW;
import static com.mycompany.proyectojuegopoo.Vehiculos.CUADRO;

/**
 *
 * @author pc
 */
public class campo extends Terreno {

    @Override
    String getCuadroColor() {
        return ANSI_YELLOW + CUADRO;
    }

}
