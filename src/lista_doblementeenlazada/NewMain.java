/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_doblementeenlazada;

import formularios.menu;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell PC
 */
public class NewMain {
        public NewMain(){}
        lista_doble j = new lista_doble();
        
        
        private int opc = 0 ;
       private int elemento;
       public void hola(){
        
        do{
            try{
                opc = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar nodo lista al inicio\n"
                        +"2. Agregar un nodo al final \n"
                                +"3. Mostrar la doble lista de inicio a fin\n"
                        +"4. Mostrar la lista de fin a inicio\n"
                                + "5. Eliminar el inicio\n"
                                + "6. Eliminar al final\n"
                                + "7. salir\n"
                                + "Que desea hacer?",
                        JOptionPane.INFORMATION_MESSAGE));
                switch(opc)
                {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un elemento al inicio: ",
                                JOptionPane.INFORMATION_MESSAGE));
                        j.agregarinicio(elemento);
                        break;
                        
                    case 2:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un elemento al final: ",
                                JOptionPane.INFORMATION_MESSAGE));
                        j.agregarfinal(elemento);
                        break;
                        
                   case 3:
                       if(!j.lista_vacia()){
                        j.mostrar_inicio_fin();}
                       else{
                            JOptionPane.showMessageDialog(null,"no hay nodos","No hay datos en la lista \n ",
                                JOptionPane.INFORMATION_MESSAGE);
                       
                       }
                        break;
                   case 4:
                       if(!j.lista_vacia()){
                           j.mostrar_fin_inicio();}
                       else{
                           JOptionPane.showMessageDialog(null,"no hay nodos","No hay datos en la lista \n ",
                                JOptionPane.INFORMATION_MESSAGE);
                       }
                        break;
                       
                   case 5:
                       if(!j.lista_vacia())
                       {
                           elemento = j.eliminarInicio();
                           JOptionPane.showMessageDialog(null,"Eliminando nodo: \n"+elemento+" \n ","lISTA",
                                JOptionPane.INFORMATION_MESSAGE);
                       }
                       else{
                           JOptionPane.showMessageDialog(null,"No hay nodos","Lista vacia",
                                JOptionPane.INFORMATION_MESSAGE);
                       }
                       break;
                       
                   case 6:
                       if(!j.lista_vacia())
                       {
                           elemento = j.eliminarfinal();
                           JOptionPane.showMessageDialog(null,"Eliminando nodo:\n"+elemento+" \n ","lISTA",
                                JOptionPane.INFORMATION_MESSAGE);
                       }
                       else{
                           JOptionPane.showMessageDialog(null,"No hay nodos","Lista vacia",
                                JOptionPane.INFORMATION_MESSAGE);
                       }
                       break;
                       
                   case 7:
                       JOptionPane.showMessageDialog(null,"finn","No hay datos en la lista \n ",
                                JOptionPane.INFORMATION_MESSAGE);
                       menu m = new menu();
                        m.setVisible(true);
                        //System.exit(0);
                       break;
                        
                   default:
                       JOptionPane.showMessageDialog(null,"fiin","Error ingrese una opcion correcta ",
                                JOptionPane.INFORMATION_MESSAGE);
                       break;
                }
                
            }catch(NumberFormatException n)
            {
                JOptionPane.showInputDialog(null,"error "+n.getMessage(),
                                JOptionPane.INFORMATION_MESSAGE);
            }
        }while(opc!=7);
    
       }
}
