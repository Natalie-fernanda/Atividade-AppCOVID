package com.mycompany.CoronaApp.classes;
import com.mycompany.mavenproject1.classes.Usuario;

/**
 *
 */
public class ProfissionalDeSaude extends Usuario{
    private int CRM;
    
    public ProfissionalDeSaude() {
        super();
    }
    
    public ProfissionalDeSaude(String nome, Integer telefone, int CPF,
            String senha, int CRM) {
        super( nome, telefone, CPF, senha);
        this.CRM = CRM;
    }
    

    public ProfissionalDeSaude(String nome, Integer telefone, int CPF, String cidade, 
            String estado, String senha, int CRM) {
        super(nome,  telefone, CPF, cidade, estado, senha);
        this.CRM = CRM;
    }
    
    
    public int cadastrarProfissionalDeSauda(String nome, Integer telefone, int CPF, String cidade, 
            String estado, String senha, int CRM) {
        return 0;
    }
    /**
     * Get the value of CRM
     *
     * @return the value of CRM
     */
    public int getCRM() {
        return CRM;
    }

    /**
     * Set the value of CRM
     *
     * @param CRM new value of CRM
     */
    public void setCRM(int CRM) {
        this.CRM = CRM;
    }

    
}
