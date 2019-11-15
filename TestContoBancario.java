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

        
        ContoBancario cc = new ContoBancario("ff", 3000);

        JOptionPane.showMessageDialog(null, "Benvenuto nel tuo contocorrente");
      
         Object[] possibleValues = {"Preleva", "Versa", "Controlla "};
        Object sel_input = JOptionPane.showInputDialog(null, "Scegli", "Lettura", JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);
       
     if(sel_input == "Preleva"){
                int ammontare_prelievo =  Integer.parseInt(JOptionPane.showInputDialog("Quanto vuoi prelevare?"));
                cc.setBilancio(ammontare_prelievo);
    JOptionPane.showMessageDialog(null,"Hai prelevato"+ammontare_prelievo+"€");
     }
   
    }
        }      
