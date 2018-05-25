/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_doblementeenlazada;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell PC
 */
public class lista_doble {
    private nodo_doble inicio, fin;
    
    public lista_doble(){
    inicio = fin = null;
    }
    
    public boolean lista_vacia()
    {
        return inicio == null;
    }
    
    public void agregarfinal(int dato)
    {
        if(!lista_vacia())
        {
            fin = new nodo_doble(dato, null,fin);
            fin.anterior.siguiente=fin;
        }
        else
        {
            inicio = fin = new nodo_doble(dato);
        }
    }
    
     public void agregarinicio(int dato)
    {
        if(!lista_vacia())
        {
            inicio = new nodo_doble(dato, inicio,null);
            inicio.siguiente.anterior=inicio;
        }
        else
        {
            inicio = fin = new nodo_doble(dato);
        }
    }
     
     public void mostrar_inicio_fin()
     {
         if(!lista_vacia())
        {
            String datos="<=>";
            nodo_doble auxiliar = inicio;
            
            while(auxiliar!=null)
            {
                datos = datos + "{ "+auxiliar.dato+" "+" ]<=>";
                auxiliar = auxiliar.siguiente;
            }
             JOptionPane.showMessageDialog(null,datos,"Lista \n ",
                                JOptionPane.INFORMATION_MESSAGE);
        }
         
     }
     
     public void mostrar_fin_inicio()
     {
         if(!lista_vacia())
        {
            String datos="<=>";
            nodo_doble auxiliar = fin;
            
            while(auxiliar!=null)
            {
                datos = datos + "{ "+auxiliar.dato+" ]<=>";
                auxiliar = auxiliar.anterior;
                
            }
            JOptionPane.showMessageDialog(null,datos,"Lista \n ",
                                JOptionPane.INFORMATION_MESSAGE);
        }
         
     }
     
     public int eliminarInicio(){
         int elemento = inicio.dato;
         if(inicio == fin)
         {
             inicio=fin=null;
             
         }
         else{
             inicio = inicio.siguiente;
             inicio.anterior=null;
         }
         return elemento;
     }
     
     public int eliminarfinal()
     {
         int elemento = fin.dato;
         if (inicio == fin)
         {
             inicio=fin=null;
         }
         else{
             fin = fin.anterior;
             fin.siguiente = null;
         }
         return elemento;
     }
}
