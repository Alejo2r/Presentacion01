/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion01;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Jugador {
    Scanner lea = new Scanner(System.in);
   Random xd = new Random();
    private int vida;
    private String nombre;
    private int poder;
    private String especie;
    private int defensa;
    
    public Jugador(){
        
    }
    public Jugador(int vida, String nombre, int poder, String especie, int defensa){
        this.vida = vida;
        this.nombre = nombre;
        this.poder = poder;
        this.especie = especie;
        this.defensa = defensa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
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
    public void mejorar(){
        char [] array = new char[5];
        int ref;
        do{
            System.out.print("Ingrese posicion de entrenamiento (0-4): ");
            ref = lea.nextInt();
            
        }while(ref > 4);
      for(int i = 0; i<2;i++){
          int rar = xd.nextInt(5);
          while(array[rar] == 'x'){
            rar =   xd.nextInt(5); 
          }
         
           array[rar] = 'x';
          
      }
        System.out.println("");
         if(array[ref] == 'x'){
        for (int i = 0; array.length>i; i++){
        System.out.print("["+array [i]+"]");
         }
        System.out.println("");
            System.out.println("Fallaste la posicion. No lograste progresar tus habilidades");
        }
         else{
             array[ref] = 'R';
        for (int i = 0; array.length>i; i++){
        System.out.print("["+array [i]+"]");
         }
        System.out.println("");
        int subir = xd.nextInt(2);
        int sumatoria;
        int suma2;
        int suma3;
        if (subir == 0){
            sumatoria = 100;
            suma2 = 75;
            suma3 = 75;
        }
        else{
            sumatoria = 200;
            suma2 = 100;
            suma3 = 110;
        }
        int t1 = getVida()+sumatoria;
        int t2 = getPoder() + suma2;
        int t3 = getDefensa() + suma3;
        setVida(t1);
        setPoder(t2);
        setDefensa(t3);
             System.out.println("Felicidades! Has mejorado tus habilidades!" );
         }
    }
}
