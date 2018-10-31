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
public class usuarios_beans {
    
    private int id_usuarios;
    private int login_id;
    private int perfil_id;
    private String nome_user;
    private boolean ativo;
    private String data_cadastro;
    private String email;
    private String cargo;
    private String regio;
    private String imagem;

    public usuarios_beans() {
    }

    public usuarios_beans(int id_usuarios, int login_id, int perfil_id, String nome_user, boolean ativo, String data_cadastro, String email, String cargo, String regio, String imagem) {
        this.id_usuarios = id_usuarios;
        this.login_id = login_id;
        this.perfil_id = perfil_id;
        this.nome_user = nome_user;
        this.ativo = ativo;
        this.data_cadastro = data_cadastro;
        this.email = email;
        this.cargo = cargo;
        this.regio = regio;
        this.imagem = imagem;
    }

    /**
     * @return the id_usuarios
     */
    public int getId_usuarios() {
        return id_usuarios;
    }

    /**
     * @param id_usuarios the id_usuarios to set
     */
    public void setId_usuarios(int id_usuarios) {
        this.id_usuarios = id_usuarios;
    }

    /**
     * @return the login_id
     */
    public int getLogin_id() {
        return login_id;
    }

    /**
     * @param login_id the login_id to set
     */
    public void setLogin_id(int login_id) {
        this.login_id = login_id;
    }

    /**
     * @return the perfil_id
     */
    public int getPerfil_id() {
        return perfil_id;
    }

    /**
     * @param perfil_id the perfil_id to set
     */
    public void setPerfil_id(int perfil_id) {
        this.perfil_id = perfil_id;
    }

    /**
     * @return the nome_user
     */
    public String getNome_user() {
        return nome_user;
    }

    /**
     * @param nome_user the nome_user to set
     */
    public void setNome_user(String nome_user) {
        this.nome_user = nome_user;
    }

    /**
     * @return the ativo
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    /**
     * @return the data_cadastro
     */
    public String getData_cadastro() {
        return data_cadastro;
    }

    /**
     * @param data_cadastro the data_cadastro to set
     */
    public void setData_cadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the regio
     */
    public String getRegio() {
        return regio;
    }

    /**
     * @param regio the regio to set
     */
    public void setRegio(String regio) {
        this.regio = regio;
    }

    /**
     * @return the imagem
     */
    public String getImagem() {
        return imagem;
    }

    /**
     * @param imagem the imagem to set
     */
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}

