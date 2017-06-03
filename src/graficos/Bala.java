/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;

/**
 *
 * @author johit
 */
public class Bala {
    private int x;
    private int y;
    private int alpha;
    private int v0;
    private double dx;
    private double dy;
    private int alto;
    private int ancho;
    private boolean disparo;

    public Bala(int x, int y, int ancho, int alto) {
        this.x = x;
        this.y = y;
        this.alto = alto;
        this.ancho = ancho;
        this.alpha = 45;
        this.v0 = 25;
        this.disparo = false;
    }
    
    public void disparar(){
        if(disparo==true){
           dx+=5;
           x+=dx;
           dy=dx*Math.tan(Math.toRadians(alpha))-((10*Math.pow(dx,2)))/(2*Math.pow(v0,2)*Math.pow(Math.cos(Math.toRadians(alpha)),2));
           y-=dy; 
        }
        else{
            dx=0;
            dy=0;
        }
    }
    
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            disparo=true; 
        }
        
        if (key == KeyEvent.VK_LEFT) {
            if(alpha<89){
                alpha += 1;
            }
        }

        if (key == KeyEvent.VK_RIGHT) {
            if(alpha>1){
                alpha -= 1;
            }
        }

        if (key == KeyEvent.VK_UP) {
            if(v0<70){
            v0 +=1;
            }
        }

        if (key == KeyEvent.VK_DOWN) {
            if(v0>1){
                v0 -= 1;
            }
        }
        System.out.println(v0+" "+alpha);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getAlto() {
        return alto;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlpha() {
        return alpha;
    }

    public int getV0() {
        return v0;
    }

    public boolean isDisparo() {
        return disparo;
    }

    public void setDisparo(boolean disparo) {
        this.disparo = disparo;
    }
    
    public Rectangle getBounds(){
        return new Rectangle (x,y,ancho,alto);
    }
}
