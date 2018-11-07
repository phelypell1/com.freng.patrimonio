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
public class n_chip_beans {
    private cadCidadeBeans cidade;
    private cadCidadeBeans regiao;
    private coletorBeans serial;
    private coletorBeans numero_coletor;
    private String numero;
    private String iccid;
    private int dados;
    private int dados_voz;

    /**
     * @return the cidade
     */
    public cadCidadeBeans getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(cadCidadeBeans cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the regiao
     */
    public cadCidadeBeans getRegiao() {
        return regiao;
    }

    /**
     * @param regiao the regiao to set
     */
    public void setRegiao(cadCidadeBeans regiao) {
        this.regiao = regiao;
    }

    /**
     * @return the serial
     */
    public coletorBeans getSerial() {
        return serial;
    }

    /**
     * @param serial the serial to set
     */
    public void setSerial(coletorBeans serial) {
        this.serial = serial;
    }

    /**
     * @return the numero_coletor
     */
    public coletorBeans getNumero_coletor() {
        return numero_coletor;
    }

    /**
     * @param numero_coletor the numero_coletor to set
     */
    public void setNumero_coletor(coletorBeans numero_coletor) {
        this.numero_coletor = numero_coletor;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the iccid
     */
    public String getIccid() {
        return iccid;
    }

    /**
     * @param iccid the iccid to set
     */
    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    /**
     * @return the dados
     */
    public int getDados() {
        return dados;
    }

    /**
     * @param dados the dados to set
     */
    public void setDados(int dados) {
        this.dados = dados;
    }

    /**
     * @return the dados_voz
     */
    public int getDados_voz() {
        return dados_voz;
    }

    /**
     * @param dados_voz the dados_voz to set
     */
    public void setDados_voz(int dados_voz) {
        this.dados_voz = dados_voz;
    }
    
    
}
