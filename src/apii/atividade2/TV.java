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
public class TV {
    
    private int canal;
    private int volume;
    private boolean ligada;
    
    //Construtores
    public TV(){
        this.canal = 2;
        this.volume = 10;
        this.ligada = false;
    }
    
    public void aumentarVolume(){
        if(volume < 20){
            volume++;
        }
        visualizarVolume();
    }
    
    public void diminuirVolume(){
        if(volume > 0){
            volume--;
        }
        visualizarVolume();
    }
    
    public void visualizarVolume(){
        System.out.println("Volume:"+volume);
    }
    
    public void visualizarCanal(){
        System.out.println("CH-"+canal);
    }
    
    public void atribuirCanal(int novoCanal){
        if(novoCanal >= 0 && novoCanal <= 99){
            canal = novoCanal;
        }
        visualizarCanal();
    }
    
    public void ligarTV(){
        this.ligada = true;
    }
    
    public void desligarTV(){
        this.ligada = false;
    }
    
    public void statusTV(){
        if(this.ligada){
            System.out.println("A TV está ligada.");
        }else{
            System.out.println("A TV está desligada.");
        }
    }
}
