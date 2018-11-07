/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fren.beans;

import com.sun.javafx.iio.ImageMetadata;

/**
 *
 * @author phelype
 */
public class pecas_beans {
    private int pca_codigo;
    private int tip_codigo;
    private marca_coletorBeans mdc_codigo;
    private marca_impressora_beans mdi_codigo;
    private String pca_descricao;
    private int pca_quantidadeestoque;
    private double pca_valorunitário;
    private ImageMetadata pca_imagem;
    private cadstatusBeans sts_codigo;

    /**
     * @return the pca_codigo
     */
    public int getPca_codigo() {
        return pca_codigo;
    }

    /**
     * @param pca_codigo the pca_codigo to set
     */
    public void setPca_codigo(int pca_codigo) {
        this.pca_codigo = pca_codigo;
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
     * @return the mdc_codigo
     */
    public marca_coletorBeans getMdc_codigo() {
        return mdc_codigo;
    }

    /**
     * @param mdc_codigo the mdc_codigo to set
     */
    public void setMdc_codigo(marca_coletorBeans mdc_codigo) {
        this.mdc_codigo = mdc_codigo;
    }

    /**
     * @return the mdi_codigo
     */
    public marca_impressora_beans getMdi_codigo() {
        return mdi_codigo;
    }

    /**
     * @param mdi_codigo the mdi_codigo to set
     */
    public void setMdi_codigo(marca_impressora_beans mdi_codigo) {
        this.mdi_codigo = mdi_codigo;
    }

    /**
     * @return the pca_descricao
     */
    public String getPca_descricao() {
        return pca_descricao;
    }

    /**
     * @param pca_descricao the pca_descricao to set
     */
    public void setPca_descricao(String pca_descricao) {
        this.pca_descricao = pca_descricao;
    }

    /**
     * @return the pca_quantidadeestoque
     */
    public int getPca_quantidadeestoque() {
        return pca_quantidadeestoque;
    }

    /**
     * @param pca_quantidadeestoque the pca_quantidadeestoque to set
     */
    public void setPca_quantidadeestoque(int pca_quantidadeestoque) {
        this.pca_quantidadeestoque = pca_quantidadeestoque;
    }

    /**
     * @return the pca_valorunitário
     */
    public double getPca_valorunitário() {
        return pca_valorunitário;
    }

    /**
     * @param pca_valorunitário the pca_valorunitário to set
     */
    public void setPca_valorunitário(double pca_valorunitário) {
        this.pca_valorunitário = pca_valorunitário;
    }

    /**
     * @return the pca_imagem
     */
    public ImageMetadata getPca_imagem() {
        return pca_imagem;
    }

    /**
     * @param pca_imagem the pca_imagem to set
     */
    public void setPca_imagem(ImageMetadata pca_imagem) {
        this.pca_imagem = pca_imagem;
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
