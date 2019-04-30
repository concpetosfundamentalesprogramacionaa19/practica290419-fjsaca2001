/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricula;
import java.util.Scanner;
import variables.*;
/**
 *
 * @author DELL
 */
public class Matricula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        // Declaracion de variables principales
        int edad, cargas_f;
        String ciudad, estado_c;
        double costo_f = 0, costofinal = 1330;
        
        // Requerimiento de datos
        System.out.println("Ingrese su ciudad de origen: ");
        ciudad = entrada.nextLine();
        
        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();
        
        // Limpieza de buffer
        entrada.nextLine();
        
        System.out.println("Ingrese su estado civil");
        estado_c = entrada.nextLine();
        
        System.out.println("Nro de cargas familiares");
        cargas_f = entrada.nextInt();
        
        // calculo de matricula
        if(ciudad.equals("Loja") || ciudad.equals("Zamora")){
            double d_ciuda = costofinal * V_matricula.d_ciudad;
            costo_f = costofinal - d_ciuda;
        }
        
        if(edad >= 17 && edad < 20){
            double edad_d = costofinal * V_matricula.d_edad;
            costo_f -= edad_d;
        }
        
        if(estado_c.equals("casado")){
            double estado_d = costofinal * V_matricula.d_estadocivil;
            costo_f -= estado_d;
        }
        
        if(cargas_f > 0){
            double cargas_d = costofinal * V_matricula.d_cargasfamiliares;
            costo_f -= cargas_d;
        }
        double d_final = costo_f * V_matricula.d_costofinal;
        costo_f += d_final;
        
        // Presentacion de datos
        System.out.printf("Su matricula total es de : %.2f",costo_f);
    }
    
}
