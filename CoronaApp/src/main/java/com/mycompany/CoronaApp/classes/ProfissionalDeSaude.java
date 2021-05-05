package com.mycompany.CoronaApp.classes;
import com.mycompany.CoronaApp.classes.Usuario;

/**
 *
 */
public class ProfissionalDeSaude extends Usuario{
    private String CRM;
    
    public ProfissionalDeSaude() {
        super();
    }
    
    public ProfissionalDeSaude(String nome, Long telefone, Long CPF,
            String senha, String CRM) {
        super( nome, telefone, CPF, senha);
        this.CRM = CRM;
    }
    

    public ProfissionalDeSaude(String nome, Long telefone, Long CPF, String cidade, 
            String estado, String senha, String CRM) {
        super(nome,  telefone, CPF, cidade, estado, senha);
        this.CRM = CRM;
    }
    
    
    public int cadastrarProfissionalDeSauda(String nome, Long telefone, Long CPF, String cidade, 
            String estado, String senha, String CRM) {
        return 0;
    }
    /**
     * Get the value of CRM
     *
     * @return the value of CRM
     */
    public String getCRM() {
        return CRM;
    }

    /**
     * Set the value of CRM
     *
     * @param CRM new value of CRM
     */
    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    
}
