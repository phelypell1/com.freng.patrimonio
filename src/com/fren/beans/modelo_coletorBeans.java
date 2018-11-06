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
public class modelo_coletorBeans {
    
    private int mdc_codigo;
    private String mdc_modelo;
    private cadstatusBeans sts_codigo;

    /**
     * @return the mdc_codigo
     */
    public int getMdc_codigo() {
        return mdc_codigo;
    }

    /**
     * @param mdc_codigo the mdc_codigo to set
     */
    public void setMdc_codigo(int mdc_codigo) {
        this.mdc_codigo = mdc_codigo;
    }

    /**
     * @return the mdc_modelo
     */
    public String getMdc_modelo() {
        return mdc_modelo;
    }

    /**
     * @param mdc_modelo the mdc_modelo to set
     */
    public void setMdc_modelo(String mdc_modelo) {
        this.mdc_modelo = mdc_modelo;
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