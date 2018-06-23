/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg8;

import java.io.Serializable;
import javax.swing.JTable;
import javax.swing.JTree;

/**
 *
 * @author Inspiron
 */
public class Mensaje implements Serializable {

    String Sender;
    String Receiver;
    String Mensaje;
    JTable Tabla;
    boolean coficado;

    public Mensaje(String Sender, String Receiver, String Mensaje) {
        this.Sender = Sender;
        this.Receiver = Receiver;
        this.Mensaje = Mensaje;
        this.coficado = false;
    }

    public Mensaje(String Sender, String Receiver, String Mensaje, JTable Tabla) {
        this.Sender = Sender;
        this.Receiver = Receiver;
        this.Mensaje = Mensaje;
        this.Tabla = Tabla;
        this.coficado = false;
    }

    public String getSender() {
        return Sender;
    }

    public void setSender(String Sender) {
        this.Sender = Sender;
    }

    public String getReceiver() {
        return Receiver;
    }

    public void setReceiver(String Receiver) {
        this.Receiver = Receiver;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    public JTable getTabla() {
        return Tabla;
    }

    public void setTabla(JTable Tabla) {
        this.Tabla = Tabla;
    }

    public boolean isCoficado() {
        return coficado;
    }

    public void setCoficado(boolean coficado) {
        this.coficado = coficado;
    }

    @Override
    public String toString() {
        return Mensaje;
    }

}
