
package dateapp;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author anahi
 */
public class DateApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese el dia");    
    int dia = leer.nextInt();
        System.out.println("Ingrese el mes en numero del 0 al 11");
    int mes= leer.nextInt();
        System.out.println("Ingrese el año considerando que ya comienza por \n 1900 tendria que agregar los años proximos");
    int año = leer.nextInt();
    Date fecha = new Date(año,mes,dia);
        
        System.out.println("La fecha ingresada por el usuario es de: "+fecha); 
    Date fechaActual = new Date();  
        System.out.println("La fecha actual es de: "+fechaActual);
        
        if (fechaActual.after(fecha)){
            System.out.println("La diferencia que hay entre  la fecha actual y la ingresada es de(En años):");
            System.out.println((fechaActual.getYear()+1900)-(fecha.getYear()+1900));
        }else{
            System.out.println("La fecha actual esta antes de la fecha ingresada");
        }
    }
    
}
