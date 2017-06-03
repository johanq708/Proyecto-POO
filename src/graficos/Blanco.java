/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.Rectangle;
import java.util.ArrayList;

/**
 *
 * @author johit
 */
public class Blanco extends Apuntables{

    public Blanco(int x, int y, int ancho, int alto, Bala bal) {
        super(x,y,ancho,alto,bal);
    }
    
    public void punteria(){
        Rectangle blanc = new Rectangle (x,y,ancho,alto);
        Rectangle casiar = new Rectangle (x,y-alto,ancho,alto);
        Rectangle casiab = new Rectangle (x,y+alto,ancho,alto);
        Rectangle caside = new Rectangle (x+ancho,y,ancho,alto);
        Rectangle casiiz = new Rectangle (x-ancho,y,ancho,alto);
        Rectangle piso = new Rectangle (0,440,2000,10);
        Rectangle pared = new Rectangle (1194,-2000,10,2500);
        Rectangle bala= bal.getBounds();
        if(bala.intersects(blanc)){
            diob=true;
        }else
        if(bala.intersects(casiar)||bala.intersects(casiab)||bala.intersects(caside)||bala.intersects(casiiz)){
            diom=true;
        }else
        if(bala.intersects(piso)||bala.intersects(pared)){
            nodio=true;
        }
        parar();
    }

    public void parar(){
        if(diob==true||diom==true||nodio==true){
            bal.setDisparo(false);
        }
    }

    public void setDiob(boolean diob) {
        this.diob = diob;
    }

    public void setDiom(boolean diom) {
        this.diom = diom;
    }

    public void setNodio(boolean nodio) {
        this.nodio = nodio;
    }
    
}
