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
public abstract class Vehiculos {
    protected static final char CUADRO = (char)219;
    protected static final String ANSI_RED = "\u001B[31m";
    protected static final String ANSI_WHITE = "\u001B[37m";
    protected static final String ANSI_YELLOW = "\u001B[33m";
    protected static final String ANSI_BLUE = "\u001B[34m";
    protected static final String ANSI_PURPLE = "\u001B[35m";
    /*
    Atributos
    */
    private String name;
    private int ataque;
    private int defensa;
    private int punteria;
    private int nivel;
    private int hp;
    private int pp;
    private int exp;

    abstract String getVehiculos();

    public void setVehiculosNull(){
        System.out.println("hola");
    }
      
       /*
    Contructor
    */
   
    public Vehiculos(int ataque, int defensa, int punteria) {
 
        this.ataque = ataque;
        this.defensa = defensa;
        this.punteria = punteria;
    }
    
    
    /*
    Metodos
    */

    public Vehiculos() {
    }
    // get = conseguir ^ set = establecer

    public String getName() {
        return name;
    }
    /**
    * Conseguir name
    * @param name 
    */
    public void setName(String name) {
        this.name = name;
    }
    /**
    * establecer ataque
    * @return 
    */
    public int getAtaque() {
        return ataque;
    }
    /**
    * Conseguir ataque
    * @param ataque 
    */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    /**
    * establecer Defensa
    * @return 
    */
    public int getDefensa() {
        return defensa;
    }
    /**
    * Conseguir defensa
    * @param defensa 
    */
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
    /**
    * establecer Punteria
    * @return 
    */
    public int getPunteria() {
        return punteria;
    }
    /**
     * Conseguir punteria
     * @param punteria 
     */

    public void setPunteria(int punteria) {
        this.punteria = punteria;
    }
    /**
    * establecer Nivel
    * @return 
     */
    public int getNivel() {
        return nivel;
    }
    /**
    * Conseguir Nivel
    * @param nivel 
    */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    /**
     * establecer Hp
     * @return 
     */

    public int getHp() {
        return hp;
    }
    /**
     * Conseguir Hp
     * @param hp 
     */

    public void setHp(int hp) {
        this.hp = hp;
    }
    /**
     * establecer pp
     * @return 
     */

    public int getPp() {
        return pp;
    }
    /**
     * Conseguir Puntos de 
     * @param pp 
     */

    public void setPp(int pp) {
        this.pp = pp;
    }
    
    /**
     * establecer Experiencia
     * @return 
     */

    public int getExp() {
        return exp;
    }
    /**
     * Consegur Experiencia
     * @param exp 
     */

    public void setExp(int exp) {
        this.exp = exp;
    }
    
    
    /**
     * Digitalizacion de nombre y impresion de valores
     */
    public void Agregar(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digitar nombre del nuevo Vehiculo");
        name = entrada.nextLine();
        nivel = 1;
        hp = 50;
        pp = 5;
        exp = 0;
        
        System.out.println("");
        System.out.println("");
        System.out.println("Nivel: "+nivel);
        System.out.println("Hp: "+hp);
        System.out.println("PP: "+pp);
        System.out.println("Experiencia: "+exp);
        
              
    }

    void nuevo_Vehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
