/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fren.beans;

/**
 *
 * @author phelype
 */
public class modelo_impressora {
        
    private int mdi_codigo;
    private String mdi_modelo;
    private cadstatusBeans sts_codigo;

    /**
     * @return the mdi_codigo
     */
    public int getMdi_codigo() {
        return mdi_codigo;
    }

    /**
     * @param mdi_codigo the mdi_codigo to set
     */
    public void setMdi_codigo(int mdi_codigo) {
        this.mdi_codigo = mdi_codigo;
    }

    /**
     * @return the mdi_modelo
     */
    public String getMdi_modelo() {
        return mdi_modelo;
    }

    /**
     * @param mdi_modelo the mdi_modelo to set
     */
    public void setMdi_modelo(String mdi_modelo) {
        this.mdi_modelo = mdi_modelo;
    }

    /**
     * @return the sts_codigo
     */
    public cadstatusBeans getSts_codigo() {
        return sts_codigo;
    }

    /**
     * @param sts_codigo the sts_codigo to set
     */
    public void setSts_codigo(cadstatusBeans sts_codigo) {
        this.sts_codigo = sts_codigo;
    }
    
    

    
}
