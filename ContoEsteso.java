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
public class ContoEsteso extends ContoBancario {

    private int fido;
    private int bilf = bilancio + fido;

    public ContoEsteso(String nContoCorrente, int bilancio,int fido) {
        super(nContoCorrente, bilancio);
       
    }

    public ContoEsteso(int fido, String nContoCorrente, int bilancio) {
        super(nContoCorrente, bilancio);
        this.fido = fido;
    }

    public int getFido() {
        return fido;
    }

    public void setFido(int fido) {
        this.fido = fido;
    }

    @Override
    public int Preleva() {
        ammontare_prelievo = Integer.parseInt(JOptionPane.showInputDialog("Quanto vuoi prelevare?"));
        if (ammontare_prelievo > bilancio) {
            JOptionPane.showConfirmDialog(null, "Non puoi prelevare questa somma perchè non hai abbastanza soldi,dobbiamo prelevare anche dal fido");
            if (fido == 0) {
                JOptionPane.showMessageDialog(null, "Il tuo fido si è esaurito");
            } else {
                bilf -= ammontare_prelievo;
                fido -= ammontare_prelievo;
            }
            JOptionPane.showMessageDialog(null, "Hai prelevato" + ammontare_prelievo + "€");
        } else {

            JOptionPane.showMessageDialog(null, "Hai prelevato" + ammontare_prelievo + "€");
            bilancio -= ammontare_prelievo;
        }

        return bilancio;
    }

   

}
