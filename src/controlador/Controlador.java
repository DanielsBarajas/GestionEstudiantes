/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Estudiante;
import vista.Vista;

/**
 *
 * @author Usuario
 */
public class Controlador {
    private Vista view;
    
    private int opcionSalir = 0;

    
    public Controlador(Vista view) {
        this.view = view;
    }
    
    public void Iniciar(){
        System.out.println("************************************************");
        System.out.println("      Bienvenido al sistema estudiantil         ");
        System.out.println("************************************************");

        while (opcionSalir == 0) {
            
            int menuOp = view.mostraMenu();
            
            switch (menuOp) {
                case 1:                
                    view.crearEstudiante();
                    
                    break;
                case 2:
                    view.modificarEstudiante();
                    break;
                case 3:
                    view.eliminarEstudiante();
                    break;
                case 4:
                    view.mostrarEstudiantes();
                    break;
                case 5:
                    System.out.println("------Gracias por usar el programa--------");
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }
            
            opcionSalir = view.PreguntarMenu();
            
        }
        System.out.println("------Gracias por usar el programa--------");
    }
}
