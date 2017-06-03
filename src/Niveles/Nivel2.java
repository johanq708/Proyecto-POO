/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Niveles;

import graficos.Bala;
import graficos.Blanco;
import graficos.Puntuacion;
import graficos.Tablero;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;

/**
 *
 * @author Johan Quiñonez
 */
public class Nivel2 extends Tablero{
    
    public Nivel2 (){
        bala=new Bala(5,235,50,50);
        blanco=new Blanco(1100,200,64,44,bala);
        puntuacion=new Puntuacion(blanco);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image fondo = loadImage("blue_background.png");
        g.drawImage(fondo, 0, 0, 1200, 550, null);

        Image bosque1 = loadImage("forest-1.png");
        Image bosque2 = loadImage("forest-2.png");
        Image bosque3 = loadImage("forest-3.png");
        Image bosque4 = loadImage("forest-4.png");
        Image ibala=loadImage("bala.png");
        Image cerdo=loadImage("cerdo.png");
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
        for (int i = 300; i < 1199; i += 150) {
            g.drawImage(bosque2, 0 + i, 420, 150 + i, 645, 515, 390, 770, 750, this);
        }
        g.drawImage(bosque2, 0, 270, 150, 512,0,0,256,396, this);
        g.drawImage(bosque2, 150, 345, 300, 512, 257, 0, 513, 275, this);
        
        //piso
        for (int i = 0; i < 1199; i += 300) {
            g.drawImage(bosque3, 200 + i, 370, 250 + i, 440, 860, 780, 957, 920, this);
        }
        g.drawImage(ibala,bala.getX(), bala.getY(), bala.getAncho(), bala.getAlto(),this);
        g.drawImage(cerdo, blanco.getX(), blanco.getY(),  blanco.getAncho(),  blanco.getAlto(), this);
        dibujar(g,200,220);
    }

}
