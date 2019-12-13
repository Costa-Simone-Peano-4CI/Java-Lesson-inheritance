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
public class ContoBancario {

    private String NContoCorrente;
    protected int bilancio = 0;
    int ammontare_prelievo = 0;
    private int ammontare_versamento = 0;

    public ContoBancario(String nContoCorrente, int bilancio) {
        this.NContoCorrente = nContoCorrente;
        this.bilancio = bilancio;
    }

    public String getnContoCorrente() {
        return NContoCorrente;
    }

    public int getBilancio() {
        return bilancio;
    }

    public void setNContoCorrente(String NContoCorrente) {
        this.NContoCorrente = NContoCorrente;
    }

    public void setBilancio(int bilancio) {
        this.bilancio = bilancio;
    }

   

    

    public int Preleva() {
        ammontare_prelievo = Integer.parseInt(JOptionPane.showInputDialog("Quanto vuoi prelevare?"));
        if (ammontare_prelievo > bilancio) {
            JOptionPane.showMessageDialog(null, "Non puoi prelevare");
        } else {

            JOptionPane.showMessageDialog(null, "Hai prelevato" + ammontare_prelievo + "€");
            bilancio -= ammontare_prelievo;
        }

        return bilancio;
    }

    public int Versa() {
        ammontare_versamento = Integer.parseInt(JOptionPane.showInputDialog("Quanto vuoi versare?"));

        JOptionPane.showMessageDialog(null, "Hai versato " + ammontare_versamento + " €");
        bilancio += ammontare_versamento;
    
 JOptionPane.showMessageDialog(null,"Bilancio: \n" );
    return bilancio;
}

}
