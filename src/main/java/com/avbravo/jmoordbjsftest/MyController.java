/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jmoordbjsftest;

import com.avbravo.avbravoutils.JsfUtil;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author avbravo
 */
@Named
@RequestScoped
public class MyController implements Serializable{
private String seleccion;

    public String getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(String seleccion) {
        this.seleccion = seleccion;
    }




    /**
     * Creates a new instance of MyContoller
     */
    public MyController() {
    }
    
    public String mostrar(){
        JsfUtil.errorDialog("Seleccion:", seleccion); 
        return "";
    }
}
