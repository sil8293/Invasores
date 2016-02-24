
package codigo;

import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Administrator
 */
public class Explosion extends Sprite{
   private int tiempoDeVida=20;
   
     public Explosion() {
        try {
            imagen = ImageIO.read(getClass().getResource("/imagenes/e1.png"));
            imagen2 = ImageIO.read(getClass().getResource("/imagenes/e2.png"));
        } catch (IOException e) {

        }
    }


    @Override
    public void mueve() {
      
    }

    public int getTiempoDeVida() {
        return tiempoDeVida;
    }

    public void setTiempoDeVida(int tiempoDeVida) {
        this.tiempoDeVida = tiempoDeVida;
    }
    
    
}
