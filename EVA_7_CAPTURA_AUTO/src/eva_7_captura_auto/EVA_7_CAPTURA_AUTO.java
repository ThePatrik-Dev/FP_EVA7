/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_7_captura_auto;

import java.util.Scanner;

/**
 *
 * @author elmas
 */
public class EVA_7_CAPTURA_AUTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Alderete Aguirre Diego Joel
        
        // Marca
        // Modelo
        // Año
        // Kilometraje
        // No.Cilindros
        
        String Marca;
        String Modelo;
        int Año;
        double Kilometraje;
        float No_Cilindros;
        float Precio;
        Scanner Cap;
        
        // Asignacion
        
        Cap = new Scanner(System.in);
        System.out.println("Marca");
        Marca = Cap.nextLine();
        System.out.println("Modelo");
        Modelo = Cap.nextLine();
        System.out.println("Año");
        Año = Cap.nextInt();
        System.out.println("Kilometraje");
        Kilometraje = Cap.nextFloat();
        System.out.println("Numero de Cilindros");
        No_Cilindros = Cap.nextFloat();
        System.out.println("Precio");
        Precio = Cap.nextFloat();

        System.out.println("----------------------------------");
        System.out.println(Marca);
        System.out.println(Modelo);
        System.out.println(Año);
        System.out.println(Kilometraje);
        System.out.println(No_Cilindros);
        System.out.println(Precio);

        
    }
    
}
