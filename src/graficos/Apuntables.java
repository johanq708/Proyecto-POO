/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

/**
 *
 * @author Johan Quiñonez
 */
public abstract class Apuntables {
    protected Bala bal;
    protected int x;
    protected int y;
    protected int ancho;
    protected int alto;
    protected boolean diob;
    protected boolean diom;
    protected boolean nodio;

    public Apuntables(int x,int y,int ancho,int alto,Bala bal) {
        this.x=x;
        this.y=y;
        this.ancho=ancho;
        this.alto=alto;
        this.diob = false;
        this.diom = false;
        this.nodio = false;
        this.bal = bal;
    }
    
    public abstract void punteria();
    public void parar(){
        if(nodio==true){
            bal.setDisparo(false);
        }
    }

    public boolean isDiob() {
        return diob;
    }

    public boolean isDiom() {
        return diom;
    }

    public boolean isNodio() {
        return nodio;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }
}
