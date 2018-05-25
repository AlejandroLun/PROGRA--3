/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas;

import formularios.menu;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell PC
 */
public class Cola {
        
         public static Modelo_cola Cola;
     
    public void cola()
    {    
        int MAX;
 
        MAX = Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE EL TAMAÑO DE LA COLA"));   
        Cola = new Modelo_cola(MAX);
         
        MenuCola();
    }
     
    public static void MenuCola()
    {
        int Opcion;
         
        do
        {
            Opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. INGRESAR DATOS\n"+
                    "2. ELIMINAR DATOS\n"+
                    "3. OBSERVAR DATOS\n"+
                    "4. VACIAR COLA\n"+
                    "5. SALIR\n"+
                    "--------------------------------------------------------\n"+
                    "INGRESE LA OPCION [1 - 5]","MENU COLA",JOptionPane.QUESTION_MESSAGE));
             
            switch(Opcion)
            {
                case 1:
                    Cola.InsertarCola();
                    break;
                case 2: 
                    Cola.EliminarCola();
                    break;
                case 3: 
                    Cola.MostrarCola();
                    break;
                case 4: 
                    Cola.VaciarCola();break;
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
    

