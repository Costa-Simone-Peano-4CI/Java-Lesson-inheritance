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
   //protected int soldi = 0;

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
   
   
}
