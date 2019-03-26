/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectojuegopoo;

/**
 *
 * @author pc
 */
abstract public class Terreno {
    protected final char CUADRO = (char)182;
    protected static final String ANSI_RED = "\u001B[31m";
    protected static final String ANSI_WHITE = "\u001B[37m";
    protected static final String ANSI_YELLOW = "\u001B[33m";
    protected static final String ANSI_BLUE = "\u001B[34m";

    protected Vehiculos dama;

    Terreno(){
        dama = null;
    }

    /**
     *
     * @return
     */
    public boolean isEmpty(){
        return dama == null;
    }

    public void setDama(Vehiculos dama){
        this.dama = dama;

    }

    public Vehiculos getDama(){
        return dama;
    }

    public void inicializarPrimervehiculo(){
        dama = new primervehiculo();
    }

    public void inicializarSegundoVehiculo(){
        dama = new segundoVehiculo();
    }





    String getLine1(){
        if (dama!= null)
            return dama.getVehiculos()+getCuadroColor()+getCuadroColor()+dama.getVehiculos()+getCuadroColor()+getCuadroColor();
        return getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor();
    }

    String getLine2(){
        if (dama!= null)
            return getCuadroColor()+dama.getVehiculos()+dama.getVehiculos()+dama.getVehiculos()+dama.getVehiculos()+getCuadroColor();
        return getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor();
    }

    String getLine3(){
        if (dama!= null)
            return getCuadroColor()+getCuadroColor()+dama.getVehiculos()+dama.getVehiculos()+getCuadroColor()+getCuadroColor();
        return getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor();
    }

    abstract String getCuadroColor();

    //boolean isEmpty() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
  
}
