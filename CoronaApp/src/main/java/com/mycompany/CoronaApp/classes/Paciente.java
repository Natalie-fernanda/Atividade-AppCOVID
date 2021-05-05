package com.mycompany.CoronaApp.classes;
import com.mycompany.CoronaApp.classes.Usuario;
import java.util.List;

/**
 *
 */
public class Paciente extends Usuario{
    
    List<String> sintomas;

    public Paciente() {
       super();
    }
    
    public Paciente(String nome, Long telefone, Long CPF, String senha, 
            List<String> sintomas) {
        super( nome, telefone, CPF, senha);
        this.sintomas = sintomas;
    }

    public Paciente(String nome, Long telefone, Long CPF, String cidade, 
            String estado, String senha, List<String> sintomas) {
        super(nome,  telefone, CPF, cidade, estado, senha);
            this.sintomas = sintomas;
    }

    public List<String> getSintomas() {
        return sintomas;
    }

    public void setSintomas(List<String> sintomas) {
        this.sintomas = sintomas;
    }
    
    public int cadastrarPaciente(String nome, Integer telefone, Long CPF,
            String senha, List<String> sintomas) {
        return 0;
    }
    
    public Paciente consultarPaciente(String nome) {
            return new Paciente();
    }
    
    public Paciente consultarPaciente(String estado, String cidade) {
            return new Paciente();
    }
    
    public Paciente consultarPaciente(List<String> sintomas) {
            return new Paciente();
    }
    
}
