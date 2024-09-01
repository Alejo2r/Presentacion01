/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion01;

/**
 *
 * @author Admin
 */
public class Guerreromono {
    private int vida;
    private int fuerza;
    private String nombre;
    private String especie;
    private int defensa;
    
    public Guerreromono(){
        
    }
    public Guerreromono(int vida, int fuerza, String especie, int defensa, String nombre){
        this.vida = vida;
        this.fuerza = fuerza;
        this.especie = especie;
        this.defensa = defensa;
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
