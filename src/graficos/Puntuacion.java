/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import javax.swing.JOptionPane;

/**
 *
 * @author johit
 */
public class Puntuacion {
    private int puntos;
    private Blanco cerdo;

    public Puntuacion(Blanco cerdo) {
        this.puntos = puntos;
        this.cerdo = cerdo;
    }
    
    public void darpuntos(){
        if(cerdo.isDiob()==true){
            puntos=3;
        }
        if(cerdo.isDiom()==true){
            puntos=1;
        }
        if(cerdo.isNodio()==true){
            puntos=0;
        }
    }
    public void imprimir(){
        if(cerdo.isDiob()==true){
            JOptionPane.showMessageDialog(null, "¡¡EN EL BLANCO!!. Merecidos 3 puntos");
        }
        if(cerdo.isDiom()==true){
            JOptionPane.showMessageDialog(null, "¡Casi!. Debes mejorar un poco mas. Un punto");
        }
        if(cerdo.isNodio()==true){
            JOptionPane.showMessageDialog(null, "NO NO NO. A seguir practicando. Sin puntos");
        }
    }
    
    public int total(){
        int tot=0;
        darpuntos();
        tot+=puntos;
        return tot;
    }

    public int getPuntos() {
        return puntos;
    }
    
}
