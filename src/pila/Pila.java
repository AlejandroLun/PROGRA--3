/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

import formularios.menu;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell PC
 */
public class Pila {
 public static Modelo_pila Pila;
   
    public void pPila() {
       
        int MAX;
 
        MAX = Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE EL TAMAÑO DE LA PILA"));   
        Pila = new Modelo_pila(MAX);
         
        MenuPila();
    }
     
    public static void MenuPila()
    {
        int Opcion;
         
        do
        {
            Opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. INGRESAR DATOS\n"+
                    "2. ELIMINAR DATOS\n"+
                    "3. OBSERVAR DATOS\n"+
                    "4. VACIAR PILA\n"+
                    "5. SALIR\n"+
                    "--------------------------------------------------------\n"+
                    "INGRESE LA OPCION [1 - 5]","MENU PILA",JOptionPane.QUESTION_MESSAGE));
             
            switch(Opcion)
            {
                case 1: 
                    Pila.InsertarPila();
                    break;
                case 2: 
                    Pila.EliminarPila();
                    break;
                case 3: 
                    Pila.MostrarPila();
                    break;
                case 4: 
                    Pila.VaciarPila();
                    break;
                case 5: 
                   menu m = new menu();
                   m.setVisible(true);
                    break;
                default: JOptionPane.showMessageDialog(null,"INGRESE UNA OPCION VALIDA \n","ERROR OPCION",JOptionPane.WARNING_MESSAGE);break;
            }
        }
        while(Opcion!=5); //-- SEGUIRA HASTA QUE OPCION SEA IGUAL A 5
    }
    }
    

