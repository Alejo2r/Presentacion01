/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package presentacion01;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Presentacion01 {
static Scanner lea = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador j = null; 
        Guerreromono m = null;
        play(j, m);
        
    }
   public static void play(Jugador j, Guerreromono m){
       int op;
       System.out.println("Ingrese su nombre j1");
       String n = lea.next();
       j = new Jugador(100, n, 50, "Humano", 50 );
       m = new Guerreromono(2000, 1500, "Mono", 2000, "Wukong");
       do{
           System.out.println("--------------MENU PRINCIPAL--------------");
           System.out.println("1) Ver estadisticas del jugador");
           System.out.println("2) Ver estadisticas de enemigos");
           System.out.println("3) Entrenamiento");
           op = lea.nextInt();
           switch(op){
               case 1:
                   estadisticas(j);
                   break;
               case 2:
                   enemigos(m);
                   break;
               case 3: 
                  j.mejorar(); 
                   break;
           }
       }while(j.getVida() >= 0);
   }
   public static void estadisticas(Jugador j){
       System.out.println("***** Estadisticas del Jugador *****");
       System.out.println("Vida: "+ j.getVida());
       System.out.println("Nombre: "+ j.getNombre());
       System.out.println("Poder: "+ j.getPoder());
       System.out.println("Especie: "+ j.getEspecie());
       System.out.println("Defensa: "+ j.getDefensa());
   }
   public static void enemigos(Guerreromono m){
       System.out.println("***** Estadisticas de los Enemigos *****");
       System.out.println("Nombre: "+ m.getNombre());
       System.out.println("Vida: "+ m.getVida());
       System.out.println("Poder: "+ m.getFuerza());
       System.out.println("Especie: "+ m.getEspecie());
       System.out.println("Defensa: "+ m.getDefensa()); 
   }
}
