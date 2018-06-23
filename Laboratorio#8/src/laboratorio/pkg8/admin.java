/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg8;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Inspiron
 */
public class admin {
    private ArrayList<String> listaempleado = new ArrayList();
    private File Archvio = null;

    public admin(String path) {
        this.Archvio = new File(path);
    }

    public ArrayList<String> getListaPersona() {
        return listaempleado;
    }

    public void setListaPersona(ArrayList<String> listaPersona) {
        this.listaempleado = listaPersona;
    }

    public File getArchvio() {
        return Archvio;
    }

    public void setArchvio(File Archvio) {
        this.Archvio = Archvio;
    }

    public void setPersona(String p) {
        this.listaempleado.add(p);

    }

    @Override
    public String toString() {
        return "adminPersona{" + "listaPersona=" + listaempleado + '}';
    }

    public void cargarArchivo() {
        try {
            listaempleado = new ArrayList<>();
            String temp;
            if (Archvio.exists()) {
                FileInputStream entrada = new FileInputStream(Archvio);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (String) objeto.readObject()) != null) {
                        listaempleado.add(temp);

                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;

        try {
            fw = new FileOutputStream(Archvio);
            bw = new ObjectOutputStream(fw);
            for (String persona : listaempleado) {
                bw.writeObject(persona);
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }

        }
    }
}
