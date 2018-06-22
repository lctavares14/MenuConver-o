/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author lucas
 */
public class modeloHistorico {
    String [][] vHistorico;

    public String[][] getvHistorico() {
        return vHistorico;
    }

    public void setvHistorico(String[][] vHistorico) {
        this.vHistorico = vHistorico;
    }

    @Override
    public String toString() {
        return "Valor Digitado: "+vHistorico[0][0].toString() + "     Valor Convertido: "+vHistorico[0][1].toString();
    }
    
}
