/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import Niveles.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Johan Quiñonez
 */
public class Graficos extends JFrame {
    private static JButton boton=new JButton("iniciar");
    private static Inicio inicio=new Inicio(boton);
    private static Nivel1 nivel1=new Nivel1();
    private static Nivel2 nivel2=new Nivel2();
    private static Nivel3 nivel3=new Nivel3();
    private static Nivel4 nivel4=new Nivel4();
    private static Nivel5 nivel5=new Nivel5();
    private static Nivel6 nivel6=new Nivel6();
    private static Nivel7 nivel7=new Nivel7();
    private static Nivel8 nivel8=new Nivel8();
    private static Nivel9 nivel9=new Nivel9();
    
    public Graficos(){
        setTitle("Tiro al blanco");
        setSize(1216, 550);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        int total=0;
        int a=0;
        boton.setSize(10, 10);
        boton.addActionListener(inicio);
        Graficos fr=new Graficos();
        fr.setLayout(new BorderLayout());
        fr.add(inicio, BorderLayout.CENTER);
        fr.add(boton, BorderLayout.SOUTH);
        while(1>a){
            if(inicio.isCambio()==true){
               Graficos frame = new Graficos();
               frame.add(nivel1); 
               a=1;
            }
        }
        a=0;
        while(1>a){
        if(nivel1.isCambio()==true){
            nivel1.puntuacion.imprimir();
            Graficos graficos=new Graficos();
            graficos.add(nivel2);
            a=1;
        }
        }
        total=nivel1.puntuacion.getPuntos();
        a=0;
        while(1>a){
            if(nivel2.cambio==true){
                nivel2.puntuacion.imprimir();
                Graficos grafico=new Graficos();
                grafico.add(nivel3);
                a=1;
            }
        }
        total+=nivel2.puntuacion.getPuntos();
        a=0;
        while(1>a){
            if(nivel3.cambio==true){
                nivel3.puntuacion.imprimir();
                Graficos grafic=new Graficos();
                grafic.add(nivel4);
                a=1;
            }
        }
        total+=nivel3.puntuacion.getPuntos();
        a=0;
        while(1>a){
            if(nivel4.cambio==true){
                nivel4.puntuacion.imprimir();
                Graficos grafi=new Graficos();
                grafi.add(nivel5);
                a=1;
            }
        }
        total+=nivel4.puntuacion.getPuntos();
        a=0;
        while(1>a){
            if(nivel5.cambio==true){
                nivel5.puntuacion.imprimir();
                Graficos graf=new Graficos();
                graf.add(nivel6);
                a=1;
            }
        }
        total+=nivel5.puntuacion.getPuntos();
        a=0;
        while(1>a){
            if(nivel6.cambio==true){
                nivel6.puntuacion.imprimir();
                Graficos gra=new Graficos();
                gra.add(nivel7);
                a=1;
            }
        }
        total+=nivel6.puntuacion.getPuntos();
        a=0;
        while(1>a){
            if(nivel7.cambio==true){
                nivel7.puntuacion.imprimir();
                Graficos gr=new Graficos();
                gr.add(nivel8);
                a=1;
            }
        }
        total+=nivel7.puntuacion.getPuntos();
        a=0;
        while(1>a){
            if(nivel8.cambio==true){
                nivel8.puntuacion.imprimir();
                Graficos fram=new Graficos();
                fram.add(nivel9);
                a=1;
            }
        }
        a=0;
        total+=nivel8.puntuacion.getPuntos();
        while(1>a){
            if(nivel9.cambio==true){
                nivel9.puntuacion.imprimir();
                Graficos fra=new Graficos();
                total+=nivel9.puntuacion.getPuntos();
                fra.add(new JLabel("su puntuacion total es de "+total+" puntos"));
                fra.setLocation(550, 350);
                fra.pack();
                a=1;
            }
        }
    }

}
