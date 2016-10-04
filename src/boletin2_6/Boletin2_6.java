/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_6;

import javax.swing.JOptionPane;

/**
 *
 * @author rgonzalezrasero
 */
public class Boletin2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float  pagado,tarifa,descuento ;
        
             
        pagado=Float.parseFloat(JOptionPane.showInputDialog("Precio pagado"));
        tarifa=Float.parseFloat(JOptionPane.showInputDialog("Precio tarifa"));
        
        descuento=100*(tarifa-pagado)/tarifa;
        
        JOptionPane.showMessageDialog(null, "descuento = "+descuento);
                
    }
    
}
