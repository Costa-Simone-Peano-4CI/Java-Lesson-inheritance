/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcontobancario;

/**
 *
 * @author quattrone.sebastiano
 */
public class ContoEsteso extends ContoBancario {

    private int fido;

    public ContoEsteso(int fido, String conto) {
        super(conto);
        this.fido = 1000;
    }

    public ContoEsteso(String conto, int bilancio) {
        super(conto, bilancio);
        this.fido = 1000;
    }

    public ContoEsteso(String conto, int bilancio, int fido) {
        super(conto, bilancio);
        this.fido = fido;

    }

    public int getFido() {
        return fido;
    }

    public void setFido(int fido) {
        this.fido = fido;
    }

    @Override
    protected void preleva(int bilancio) {
        double pr=0;
         if (bilancio == 0) {
            System.out.println("il valore del conto e' " + bilancio + "\n quindi non puo' essere prelevato alcuna somma");
        } else {
            System.out.println("digitare valore da prelevare");
            if(bilancio+fido>pr){
                int c= bilancio+fido;
                c=(int) (c-pr);
             bilancio=c;   
            }else{
                System.out.println("il valore del conto e' " + bilancio + "\n richiedere prelevo piu' basso");
            }
        } //To change body of generated methods, choose Tools | Templates.
    }

}
