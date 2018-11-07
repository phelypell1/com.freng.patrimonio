/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fren.beans;

/**
 *
 * @author Phelype
 */
public class trocabateria {
    private int bat_codigo; 
    private int tip_codigo; 
    private String bat_estadodabateria; 
    private cadCidadeBeans cid_codigo; 
    private String bat_datatroca; 
    private String bat_serialbateria; 
    private String bat_lacrebateria; 
    private cadtipoequipamentoBeans bat_codequipamento; 
    private int bat_bateriavelhadevolvida; 
    private String bat_observacoes; 
    private int bat_cyclecount; 
    private int for_codigo;

    /**
     * @return the bat_codigo
     */
    public int getBat_codigo() {
        return bat_codigo;
    }

    /**
     * @param bat_codigo the bat_codigo to set
     */
    public void setBat_codigo(int bat_codigo) {
        this.bat_codigo = bat_codigo;
    }

    /**
     * @return the tip_codigo
     */
    public int getTip_codigo() {
        return tip_codigo;
    }

    /**
     * @param tip_codigo the tip_codigo to set
     */
    public void setTip_codigo(int tip_codigo) {
        this.tip_codigo = tip_codigo;
    }

    /**
     * @return the bat_estadodabateria
     */
    public String getBat_estadodabateria() {
        return bat_estadodabateria;
    }

    /**
     * @param bat_estadodabateria the bat_estadodabateria to set
     */
    public void setBat_estadodabateria(String bat_estadodabateria) {
        this.bat_estadodabateria = bat_estadodabateria;
    }

    /**
     * @return the cid_codigo
     */
    public cadCidadeBeans getCid_codigo() {
        return cid_codigo;
    }

    /**
     * @param cid_codigo the cid_codigo to set
     */
    public void setCid_codigo(cadCidadeBeans cid_codigo) {
        this.cid_codigo = cid_codigo;
    }

    /**
     * @return the bat_datatroca
     */
    public String getBat_datatroca() {
        return bat_datatroca;
    }

    /**
     * @param bat_datatroca the bat_datatroca to set
     */
    public void setBat_datatroca(String bat_datatroca) {
        this.bat_datatroca = bat_datatroca;
    }

    /**
     * @return the bat_serialbateria
     */
    public String getBat_serialbateria() {
        return bat_serialbateria;
    }

    /**
     * @param bat_serialbateria the bat_serialbateria to set
     */
    public void setBat_serialbateria(String bat_serialbateria) {
        this.bat_serialbateria = bat_serialbateria;
    }

    /**
     * @return the bat_lacrebateria
     */
    public String getBat_lacrebateria() {
        return bat_lacrebateria;
    }

    /**
     * @param bat_lacrebateria the bat_lacrebateria to set
     */
    public void setBat_lacrebateria(String bat_lacrebateria) {
        this.bat_lacrebateria = bat_lacrebateria;
    }

    /**
     * @return the bat_codequipamento
     */
    public cadtipoequipamentoBeans getBat_codequipamento() {
        return bat_codequipamento;
    }

    /**
     * @param bat_codequipamento the bat_codequipamento to set
     */
    public void setBat_codequipamento(cadtipoequipamentoBeans bat_codequipamento) {
        this.bat_codequipamento = bat_codequipamento;
    }

    /**
     * @return the bat_bateriavelhadevolvida
     */
    public int getBat_bateriavelhadevolvida() {
        return bat_bateriavelhadevolvida;
    }

    /**
     * @param bat_bateriavelhadevolvida the bat_bateriavelhadevolvida to set
     */
    public void setBat_bateriavelhadevolvida(int bat_bateriavelhadevolvida) {
        this.bat_bateriavelhadevolvida = bat_bateriavelhadevolvida;
    }

    /**
     * @return the bat_observacoes
     */
    public String getBat_observacoes() {
        return bat_observacoes;
    }

    /**
     * @param bat_observacoes the bat_observacoes to set
     */
    public void setBat_observacoes(String bat_observacoes) {
        this.bat_observacoes = bat_observacoes;
    }

    /**
     * @return the bat_cyclecount
     */
    public int getBat_cyclecount() {
        return bat_cyclecount;
    }

    /**
     * @param bat_cyclecount the bat_cyclecount to set
     */
    public void setBat_cyclecount(int bat_cyclecount) {
        this.bat_cyclecount = bat_cyclecount;
    }

    /**
     * @return the for_codigo
     */
    public int getFor_codigo() {
        return for_codigo;
    }

    /**
     * @param for_codigo the for_codigo to set
     */
    public void setFor_codigo(int for_codigo) {
        this.for_codigo = for_codigo;
    }
}