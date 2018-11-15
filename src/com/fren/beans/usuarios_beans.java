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
    private LoginsBeans login_id;
    private perfil_usuariobeans perfil_id;
    private String nome_user;
    private int ativo;
    private String data_cadastro;
    private String email;
    private String cargo;
    private String regiao;
    private int imagem;

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
    public LoginsBeans getLogin_id() {
        return login_id;
    }

    /**
     * @param login_id the login_id to set
     */
    public void setLogin_id(LoginsBeans login_id) {
        this.login_id = login_id;
    }

    /**
     * @return the perfil_id
     */
    public perfil_usuariobeans getPerfil_id() {
        return perfil_id;
    }

    /**
     * @param perfil_id the perfil_id to set
     */
    public void setPerfil_id(perfil_usuariobeans perfil_id) {
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
    public int getAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(int ativo) {
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
     * @return the regiao
     */
    public String getRegiao() {
        return regiao;
    }

    /**
     * @param regiao the regiao to set
     */
    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    /**
     * @return the imagem
     */
    public int getImagem() {
        return imagem;
    }

    /**
     * @param imagem the imagem to set
     */
    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
    
    
}
