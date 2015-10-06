/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apii.atividade2;

/**
 *
 * @author Fabricio
 */
public class APIIAtividade2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TV samsung = new TV();
        samsung.statusTV();
        samsung.visualizarCanal();
        samsung.visualizarVolume();
        
        // Seta canal
        samsung.atribuirCanal(100);
        
        samsung.atribuirCanal(13);
        
        samsung.aumentarVolume();
        samsung.aumentarVolume();
        samsung.aumentarVolume();
        samsung.aumentarVolume();
        samsung.aumentarVolume();
        samsung.aumentarVolume();
        samsung.aumentarVolume();
        samsung.aumentarVolume();
        samsung.aumentarVolume();
        samsung.aumentarVolume();
        
        samsung.aumentarVolume();
        samsung.aumentarVolume();
        samsung.aumentarVolume();
        samsung.aumentarVolume();
        
    }
    
}
