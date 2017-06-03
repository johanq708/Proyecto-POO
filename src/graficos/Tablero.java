/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import Niveles.Nivel1;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Johan Quiñonez
 */
public class Tablero extends JPanel implements ActionListener{
    protected boolean cambio;
    protected Puntuacion puntuacion;
    protected Blanco blanco;
    protected Bala bala;
    protected Timer timer;

    public Tablero() {
        iniciar();
    }
    public void iniciar(){
        this.cambio=false;
        addKeyListener(new Teclas());
        setFocusable(true);
        timer = new Timer(90, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        
    }
    
    public void dibujar(Graphics g,int x1,int y1){
        g.drawRect(x1, 0+y1, 70, 280);
        g.setColor(Color.RED);
        g.fillRect(x1+1, (70-bala.getV0())*4+y1, 69, bala.getV0()*4);
        g.drawLine(1, 350, (int) (100*Math.cos(Math.toRadians(bala.getAlpha()))+1), (int) -(100*Math.sin(Math.toRadians(bala.getAlpha())))+350);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        bala.disparar();
        blanco.punteria();
        puntuacion.darpuntos();
        System.out.println("puntos: "+puntuacion.getPuntos());
        cambiar();
        repaint();
    }
    
    public void cambiar(){
        if(blanco.isDiob()==true||blanco.isDiom()==true||blanco.isNodio()==true){
            this.cambio=true;
        }
    }

    public Image loadImage(String nombre) {
        ImageIcon ii = new ImageIcon(nombre);
        Image image = ii.getImage();
        return image;
    }

    public boolean isCambio() {
        return cambio;
    }

    public class Teclas extends KeyAdapter {

    public void keyTyped(KeyEvent e) {
        
    }

    public void keyPressed(KeyEvent e) {
        bala.keyPressed(e);
    }

    public void keyReleased(KeyEvent e) {

    }
}
}
