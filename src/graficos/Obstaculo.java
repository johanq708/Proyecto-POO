/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.Rectangle;

/**
 *
 * @author Johan Daniel Quiñonez Ruiz
 */
public class Obstaculo extends Apuntables{

    public Obstaculo(int x, int y, int ancho, int alto, Bala bal) {
        super(x,y,ancho,alto,bal);
    }
    
    public void punteria(){
        Rectangle bala=bal.getBounds();
        Rectangle obs=new Rectangle(x,y,ancho,alto);
        if(bala.intersects(obs)){
            nodio=true;
        }
        parar();
    }
    
}
