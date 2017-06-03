/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Niveles;

import graficos.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;

/**
 *
 * @author Johan Daniel Quiñonez Ruiz
 */
public class Nivel5 extends Tablero{
    private Movible obstaculo5;

    public Nivel5() {
        bala=new Bala(20,390,50,50);
        blanco=new Blanco(1100,200,64,44,bala);
        puntuacion=new Puntuacion(blanco);
        this.obstaculo5 = new Movible(400,250,82,100,bala);
    }
    
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image fondo = loadImage("blue_background.png");
        g.drawImage(fondo, 0, 0, 1200, 550, null);
        Image ibala=loadImage("bala.png");
        Image bosque1 = loadImage("forest-1.png");
        Image bosque2 = loadImage("forest-2.png");
        Image bosque3 = loadImage("forest-3.png");
        Image bosque4 = loadImage("forest-4.png");
        Image cerdo = loadImage("cerdo.png");
        Image obstaculo = loadImage("ave.png");
        for (int i = 0; i < 1099; i += 400) {
            g.drawImage(bosque1, 100 + i, 250, 400 + i, 442, 0, 550, 485, 758, this);
            g.drawImage(bosque1, 187 + i, 58, 300 + i, 250, 436, 0, 618, 256, this);
            g.drawImage(bosque1, 110 + i, 0, 360 + i, 58, 300, 850, 700, 898, this);
        }
        for (int i = 0; i < 1099; i += 400) {
            g.drawImage(bosque1, 265 + i, 180, 395 + i, 350, 755, 750, 950, 970, this);
        }
        for (int i = 0; i < 1099; i += 400) {
            g.drawImage(bosque1, 300 + i, 170, 420 + i, 240, 0, 920, 195, 1017, this);
        }
        for (int i = 0; i < 1099; i += 400) {
            g.drawImage(bosque1, 230 + i, 130, 270 + i, 240, 950, 750, 1015, 910, this);
        }
        for (int i = 0; i < 1099; i += 400) {
            g.drawImage(bosque1, 180 + i, 100, 320 + i, 170, 196, 920, 405, 1017, this);
        }
        //todo arbol1
        for (int i = 0; i < 1099; i += 350) {
            g.drawImage(bosque1, 9 + i, 0, 259 + i, 58, 300, 850, 700, 898, this);
            g.drawImage(bosque1, 0 + i, 250, 300 + i, 442, 0, 550, 485, 760, this);
            g.drawImage(bosque1, 88 + i, 58, 200 + i, 250, 619, 0, 800, 256, this);
        }
        for (int i = 0; i < 1099; i += 350) {
            g.drawImage(bosque1, i - 30, 80, 140 + i, 160, 802, 102, 1015, 200, this);
        }
        for (int i = 0; i < 1099; i += 350) {
            g.drawImage(bosque1, i - 70, 30, 90 + i, 130, 0, 297, 364, 540, this);
        }
        for (int i = 0; i < 1099; i += 350) {
            g.drawImage(bosque3, 100 + i, 200, 180 + i, 300, 760, 400, 960, 640, this);
        }
        //todo arbol 2
        for (int i = 0; i < 1099; i += 500) {
            g.drawImage(bosque1, 20 + i, 350, 70 + i, 440, 790, 550, 895, 750, this);
        }
        for (int i = 0; i < 1099; i += 400) {
            g.drawImage(bosque1, 150 + i, 350, 200 + i, 440, 896, 550, 1015, 725, this);
        }
        for (int i = 0; i < 1099; i += 400) {
            g.drawImage(bosque2, 280 + i, 340, 350 + i, 440, 0, 785, 140, 992, this);
        }
        for (int i = 0; i < 1099; i += 350) {
            g.drawImage(bosque3, 60 + i, 395, 120 + i, 430, 958, 871, 1023, 901, this);
        }
        //flores y hongos
        for (int i = 0; i < 1199; i += 150) {
            g.drawImage(bosque2, 0 + i, 420, 150 + i, 645, 515, 390, 770, 750, this);
        }
        //piso
        for (int i = 0; i < 1199; i += 300) {
            g.drawImage(bosque3, 200 + i, 370, 250 + i, 440, 860, 780, 957, 920, this);
        }
        //arbusto
        g.drawImage(ibala, bala.getX(), bala.getY(), bala.getAncho(), bala.getAlto(), this);
        g.drawImage(cerdo, blanco.getX(), blanco.getY(), blanco.getAncho(), blanco.getAncho(),this);
        g.drawImage(obstaculo, obstaculo5.getX(), obstaculo5.getY(),obstaculo5.getAncho(),obstaculo5.getAlto(),obstaculo5.getS(),0,obstaculo5.getS()+182,150, this);
        dibujar(g,0,0);
    }    
    
    public void actionPerformed(ActionEvent e) {
        bala.disparar();
        obstaculo5.mover();
        blanco.punteria();
        obstaculo5.punteria();
        puntuacion.darpuntos();
        cambiar();
        repaint();
    }    
    public void cambiar(){
        if(blanco.isDiob()==true||blanco.isDiom()==true||blanco.isNodio()==true||obstaculo5.isNodio()==true){
            this.cambio=true;
        }
    }
}
