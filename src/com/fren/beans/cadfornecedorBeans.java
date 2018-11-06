/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fren.beans;

import java.awt.Image;

/**
 *
 * @author phelype
 */
public class cadfornecedorBeans {
  
    private int codigo;
    private String for_razaosocial;
    private String for_abreviado;
    private Image for_logo;

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the for_razaosocial
     */
    public String getFor_razaosocial() {
        return for_razaosocial;
    }

    /**
     * @param for_razaosocial the for_razaosocial to set
     */
    public void setFor_razaosocial(String for_razaosocial) {
        this.for_razaosocial = for_razaosocial;
    }

    /**
     * @return the for_abreviado
     */
    public String getFor_abreviado() {
        return for_abreviado;
    }

    /**
     * @param for_abreviado the for_abreviado to set
     */
    public void setFor_abreviado(String for_abreviado) {
        this.for_abreviado = for_abreviado;
    }

    /**
     * @return the for_logo
     */
    public Image getFor_logo() {
        return for_logo;
    }

    /**
     * @param for_logo the for_logo to set
     */
    public void setFor_logo(Image for_logo) {
        this.for_logo = for_logo;
    }
}
