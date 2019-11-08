/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author costa.simone
 */
public class ContoBancario {
     public String  NContoCorrente;
    public int bilancio = 0;
    public String input;

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
     
     
}
