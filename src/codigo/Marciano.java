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
public class Marciano extends Sprite{
   
   public Image imagen2 = null;
   
  
    public Marciano() {
        try {
            imagen = ImageIO.read(getClass().getResource("/imagenes/marcianito1.png"));
            imagen2 = ImageIO.read(getClass().getResource("/imagenes/marcianito2.png"));
        } catch (IOException e) {

        }
    }

 
    
    public void mueve (boolean _direccionMarcianos){
        if(_direccionMarcianos ){
            this.setX(this.getX()-1);
          
        }
        else if (!_direccionMarcianos ){
            this.setX(this.getX()+1);
        }
    }

    @Override
    public void mueve() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
   
}
