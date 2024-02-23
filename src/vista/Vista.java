/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelo.Estudiante;

import java.util.Arrays;


/**
 *
 * @author Usuario
 */
public class Vista {
    Scanner leer = new Scanner(System.in);
    private Estudiante estudiantes[] = new Estudiante[10];
    private int i = 0;
    public int mostraMenu(){
        int op = 0;
        
        System.out.println("------------------------------------------------");
        System.out.println("Elija la accion que desea realizar:");
        System.out.println("1. Agrear Estudiante");
        System.out.println("2. Actualizar estudiante");
        System.out.println("3. Eliminar Estudiante");
        System.out.println("4. Ver Estudiantes");
        System.out.println("5. Salir");
        
        op = leer.nextInt();
        leer.nextLine();

        return op;
    }
    public Estudiante crearEstudiante(){
        String nombre = "";
        int id = 0;
        
        System.out.println("------------------------------------------------");
        System.out.println("Ingrese el nombre del estudiante:");
        nombre = leer.next();
        
        System.out.println("Ingrese el numero de cedula o tarjeta de identidad: ");
        id = leer.nextInt();
        
        this.estudiantes[i] = new Estudiante(nombre, id);
        i++;
        
        System.out.println("*****El Estudiante fue creado Exitosamente******");
        
        
        
        return this.estudiantes[i];
    }
    
    public void mostrarEstudiantes(){
        
        
        if(estudiantes[0] == null){
            
            System.out.println("------------------------------------------------");
            System.out.println("No hay estudiantes Creados");
        }else{
            for (int i = 0; i < this.estudiantes.length; i++) {
                if(estudiantes[i] == null ){
                    i = this.estudiantes.length;
                }else{
                System.out.println((i+1)+". "+estudiantes[i]);
                }
            }
        }        
    }
    public void modificarEstudiante(){
        int nEstudiante = 0, id = 0;
        String nombreEstu = "";
        
        if(estudiantes[0] == null){
            
            System.out.println("------------------------------------------------");
            System.out.println("No hay estudiantes para modificar ");
            
        }else{
            
            System.out.println("------------------------------------------------");
            System.out.println("Elija el estudiante que desea modificar");
            this.mostrarEstudiantes();
            nEstudiante = leer.nextInt();
            leer.nextLine();
            
            
            System.out.println("Ingrese el nuevo nombre del estudiante");
            nombreEstu = leer.nextLine();
            estudiantes[nEstudiante-1].setNombre(nombreEstu);
            
            System.out.println("Ingrese el nuevo Id del estudiante");
            id = leer.nextInt();
            estudiantes[nEstudiante-1].setId(id);
            
            System.out.println("*******El estudiante fue modificado exitosamente*****");
            
            
    }
    }
    public void eliminarEstudiante(){
        int nEstudiante = 0;
        if(estudiantes[0] == null){
            
            System.out.println("------------------------------------------------");
            System.out.println("No hay estudiantes Para Eliminar");
        }else{
            
            System.out.println("------------------------------------------------");
            System.out.println("Elija el estudiante que desea eliminar");
            this.mostrarEstudiantes();
            nEstudiante = leer.nextInt() - 1;
            reOrgaEstudiante(nEstudiante);
            this.mostrarEstudiantes();
            
            }

            
    }
    public void reOrgaEstudiante(int nEstudiante){
        
        
        for (int j = nEstudiante; j < estudiantes.length -1 ; j++) {
            estudiantes[j] = estudiantes[j+1];
            
        }
        
        
    }
    public int PreguntarMenu(){
        int op = 0;
        
        System.out.println("------------------------------------------------");
        System.out.println("Elija una opcion");
        System.out.println("0. Menu principal");
        System.out.println("1. Salir del programa");
        op = leer.nextInt();
        
        return op;
    }
        
        
        
    }
    

