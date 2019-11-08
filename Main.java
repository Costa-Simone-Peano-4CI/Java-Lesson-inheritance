/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author costa.simone
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        JOptionPane.showMessageDialog(null, "Benvenuto nel tuo contocorrente");
        String Sbilancio = JOptionPane.showInputDialog("Quanti soldi hai?");
        int bilancio = Integer.parseInt(Sbilancio);
        JOptionPane.showMessageDialog(null, "Attualmente hai " + bilancio + "€");
        Object[] possibleValues = {"Preleva", "Versa", "Controlla "};
        Object sel_input = JOptionPane.showInputDialog(null, "Scegli", "Lettura", JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);
        if (sel_input != null) {
            input = sel_input.toString();
        }
        if (sel_input == null) {
            input = "\nHai annullato";
        }
        return input;
    }
}
