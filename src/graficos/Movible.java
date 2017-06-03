/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.Rectangle;

/**
 *
 * @author Johan Quiñonez
 */
public class Movible extends Apuntables{
    private int dx;
    private int s;
    private int ds;

    public Movible(int x,int y,int ancho,int alto, Bala bal) {
        super(x,y,ancho,alto,bal);
        this.ancho=x+ancho;
        this.alto=y+alto;
        this.dx = 12;
        this.ds = 0;
        this.s = s;
    }
    
    public void punteria() {
        Rectangle bala=bal.getBounds();
        Rectangle obs=new Rectangle(x,y,ancho,alto);
        if(bala.intersects(obs)){
            nodio=true;
        }
        parar();
    }

    public void mover(){
            if(x<1160){
                x+=12;
                ancho+=12;
            }else{
                x=70;
                ancho=152;
            }
            if(ds==5){
                ds=0;
            }else{
                ds++;
            }
            s=182*ds;
    }

    public int getS() {
        return s;
    }
}
