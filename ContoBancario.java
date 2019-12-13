/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcontobancario;

import javax.swing.JOptionPane;

/**
 *
 * @author quattrone.sebastiano
 */
public class ContoBancario {

    private String conto;
    private int bilancio;

    public ContoBancario(String conto, int bilancio) {//constructor con 2 parametri 
        this.conto = conto;
        this.bilancio = bilancio;
    }

    public ContoBancario(String conto) {//constructor con 1 parametro
        this.conto = conto;
        this.bilancio = 0;
    }

    public String getConto() {
        return conto;
    }

    public void setConto(String conto) {
        this.conto = conto;
    }

    public int getBilancio() {
        return bilancio;
    }

    public void setBilancio(int bilancio) {
        this.bilancio = bilancio;
    }

    protected void preleva(int bilancio) {
        if (bilancio == 0) {
            System.out.println("il valore del conto e' " + bilancio + "\n quindi non puo' essere prelevato alcuna somma");
        } else {
            System.out.println("digitare valore da prelevare");
        }
    }

    @Override
    public String toString() {
        return "il conto e' " + conto + " il suo bilancio e' " + bilancio;
    }

}
