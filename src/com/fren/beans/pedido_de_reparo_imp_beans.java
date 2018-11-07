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
public class pedido_de_reparo_imp_beans {
        private marca_impressora_beans marca;
        private modelo_impressora modelo; 
        private String serial; 
        private String patrimonio; 
        private String garantia; 
        private String data_compra; 
        private impressorasBeans cod_equip; 
        private String data_ocorrido; 
        private String ocorrencias; 
        private int codigo;

    /**
     * @return the marca
     */
    public marca_impressora_beans getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(marca_impressora_beans marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public modelo_impressora getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(modelo_impressora modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the serial
     */
    public String getSerial() {
        return serial;
    }

    /**
     * @param serial the serial to set
     */
    public void setSerial(String serial) {
        this.serial = serial;
    }

    /**
     * @return the patrimonio
     */
    public String getPatrimonio() {
        return patrimonio;
    }

    /**
     * @param patrimonio the patrimonio to set
     */
    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }

    /**
     * @return the garantia
     */
    public String getGarantia() {
        return garantia;
    }

    /**
     * @param garantia the garantia to set
     */
    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    /**
     * @return the data_compra
     */
    public String getData_compra() {
        return data_compra;
    }

    /**
     * @param data_compra the data_compra to set
     */
    public void setData_compra(String data_compra) {
        this.data_compra = data_compra;
    }

    /**
     * @return the cod_equip
     */
    public impressorasBeans getCod_equip() {
        return cod_equip;
    }

    /**
     * @param cod_equip the cod_equip to set
     */
    public void setCod_equip(impressorasBeans cod_equip) {
        this.cod_equip = cod_equip;
    }

    /**
     * @return the data_ocorrido
     */
    public String getData_ocorrido() {
        return data_ocorrido;
    }

    /**
     * @param data_ocorrido the data_ocorrido to set
     */
    public void setData_ocorrido(String data_ocorrido) {
        this.data_ocorrido = data_ocorrido;
    }

    /**
     * @return the ocorrencias
     */
    public String getOcorrencias() {
        return ocorrencias;
    }

    /**
     * @param ocorrencias the ocorrencias to set
     */
    public void setOcorrencias(String ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

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
}
