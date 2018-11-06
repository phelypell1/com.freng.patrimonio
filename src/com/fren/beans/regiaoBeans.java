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
public class regiaoBeans {
    
    private int reg_cod;
    private String reg_regiao;
    private cadestadoBeans est_cod;

    /**
     * @return the reg_cod
     */
    public int getReg_cod() {
        return reg_cod;
    }

    /**
     * @param reg_cod the reg_cod to set
     */
    public void setReg_cod(int reg_cod) {
        this.reg_cod = reg_cod;
    }

    /**
     * @return the reg_regiao
     */
    public String getReg_regiao() {
        return reg_regiao;
    }

    /**
     * @param reg_regiao the reg_regiao to set
     */
    public void setReg_regiao(String reg_regiao) {
        this.reg_regiao = reg_regiao;
    }

    /**
     * @return the est_cod
     */
    public cadestadoBeans getEst_cod() {
        return est_cod;
    }

    /**
     * @param est_cod the est_cod to set
     */
    public void setEst_cod(cadestadoBeans est_cod) {
        this.est_cod = est_cod;
    }
    
    
    
}
