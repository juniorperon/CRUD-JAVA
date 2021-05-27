/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.jdbc;

/**
 *
 * @author Moreno
 */
public class Usuario {
    private int codigo;
    private String login;
    private String senha;

    public Usuario() {
    }

    public Usuario(int codigo, String login, String senha) {
        this.codigo = codigo;
        this.login = login;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return login;
    }    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
