package com.mycompany.CoronaApp.classes;

import java.util.Objects;

/**
 *
 * Classe que representa um usuário generico do CoronaApp.
 */
public class Usuario {
    
    public Usuario() {
        
    }
    
    public Usuario(String nome, Long telefone, Long CPF, String senha) {
        this.nome = nome;
        this.telefone = telefone;
        this.CPF = CPF;
        this.senha = senha;
    }
    

    public Usuario(String nome, Long telefone, Long CPF, String cidade, 
            String estado, String senha) {
        this.nome = nome;
        this.telefone = telefone;
        this.CPF = CPF;
        this.cidade = cidade;
        this.estado = estado;
        this.senha = senha;
    }
    
    
    private String nome;
    
    private Long telefone;
    
    private Long CPF;
    
    private String cidade;
        
    private String estado;
    
    private String senha;
    
    public int fazerLogin(Long CPF, String senha) {
        return this.CPF.equals(CPF)
                && Objects.equals(this.senha, senha) ? 1 : 0;
    }

    /**
     * Get the value of senha
     *
     * @return the value of senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Set the value of senha
     *
     * @param senha new value of senha
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }


    /**
     * Get the value of estado
     *
     * @return the value of estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Set the value of estado
     *
     * @param estado new value of estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }


    /**
     * Get the value of cidade
     *
     * @return the value of cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Set the value of cidade
     *
     * @param cidade new value of cidade
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


    /**
     * Get the value of CPF
     *
     * @return the value of CPF
     */
    public Long getCPF() {
        return CPF;
    }

    /**
     * Set the value of CPF
     *
     * @param CPF new value of CPF
     */
    public void setCPF(Long CPF) {
        this.CPF = CPF;
    }


    /**
     * Get the value of telefone
     *
     * @return the value of telefone
     */
    public Long getTelefone() {
        return telefone;
    }

    /**
     * Set the value of telefone
     *
     * @param telefone new value of telefone
     */
    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }


    /**
     * Get the value of nome
     *
     * @return the value of nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Set the value of nome
     *
     * @param nome new value of nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

}
