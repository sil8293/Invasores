/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author xp
 */
public class Nave extends Sprite{
  
   private boolean pulsadoIzquierda = false;
   private boolean pulsadoDerecha = false;
   private int anchoMundo;
   
   public Nave (int _anchoMundo){
       try{
           imagen = ImageIO.read(getClass().getResource("/imagenes/nave.png"));
           this.anchoMundo = _anchoMundo;
       }
       catch(IOException e){
       
       }
   }


    public boolean isPulsadoIzquierda() {
        return pulsadoIzquierda;
    }

    public void setPulsadoIzquierda(boolean pulsadoIzquierda) {
        this.pulsadoIzquierda = pulsadoIzquierda;
        
    }

    public boolean isPulsadoDerecha() {
        return pulsadoDerecha;
    }

    public void setPulsadoDerecha(boolean pulsadoDerecha) {
        this.pulsadoDerecha = pulsadoDerecha;
        
    }
    public void mueve(){
        if (this.pulsadoIzquierda && this.getX() >0){
            this.setX(this.getX() - 1);
        }
        if (this.pulsadoDerecha && this.getX() < anchoMundo-imagen.getWidth(null)){
            this.setX(this.getX() + 1);
        }
    }

  
}
