/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Image;

/**
 *
 * @author Administrator
 */
public abstract class Sprite {
    public Image imagen=null;
    public Image imagen2=null;
    private int x;
    private int y;
 abstract public void mueve();
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
     
    
}
