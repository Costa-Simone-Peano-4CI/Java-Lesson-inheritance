/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcontobancario;

import javax.swing.JOptionPane;

/**
 *
 * @author costa.simone
 */
public class TestContoBancario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        ContoEsteso c1 = new ContoEsteso("ff", 3000,1000);

        JOptionPane.showMessageDialog(null, "Benvenuto nel tuo contocorrente");
        Object sel_input = "";
      do{
         Object[] possibleValues = {"Preleva", "Versa", "Controlla","Esci"};
         sel_input = JOptionPane.showInputDialog(null, "Scegli", "Lettura", JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);
       
     if(sel_input == "Preleva"){
              JOptionPane.showMessageDialog(null," " + c1.Preleva());
              
     }
   if(sel_input == "Versa"){
   JOptionPane.showMessageDialog(null,c1.Versa()+"\n");
   }
   if(sel_input == "Controlla"){
   JOptionPane.showMessageDialog(null,"Nome conto: " + c1.getnContoCorrente() +"\n "+ c1.getBilancio());
   }
       
    }while( sel_input != "Esci");
        }    
    
}  
