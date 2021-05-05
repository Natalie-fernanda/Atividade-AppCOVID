package com.mycompany.CoronaApp;

import com.mycompany.CoronaApp.classes.Paciente;
import com.mycompany.CoronaApp.classes.ProfissionalDeSaude;
import com.mycompany.CoronaApp.classes.Usuario;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 */
public class MainClass {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe com seu nome:");
            String nome = scanner.nextLine();
            System.out.println("Informe com seu telefone:");
            long telefone = scanner.nextLong();
            scanner.nextLine();
            System.out.println("Informe com seu CPF:");
            long CPF = scanner.nextLong();
            scanner.nextLine();
            System.out.println("Informe com seu cidade:");
            String cidade = scanner.nextLine();
            System.out.println("Informe com seu estado:");
            String estado = scanner.nextLine();
            System.out.println("Informe com seu senha:");
            String senha = scanner.nextLine();            
        
            System.out.println("Identifique seu tipo de Registro:"
                    + "\n1-) Paciente\n2-) Profissional de Saúde");
            long tipoUsuario = scanner.nextLong();
            scanner.nextLine();

            if (tipoUsuario > 1) {
                System.out.println("Informe com seu CRM:");
                String CRM = scanner.nextLine();
                ProfissionalDeSaude novoProfissional = new ProfissionalDeSaude(
                nome, telefone, CPF,cidade,estado,senha, CRM);
                
                System.out.println("Profissional cadastrado com Sucesso!\n"
                        + "Informações cadastrais:\n"
                        +"nome: "+ novoProfissional.getNome() + "\n"
                        +"telefone: "+ novoProfissional.getTelefone() + "\n"
                        +"CPF: "+ novoProfissional.getCPF() + "\n"
                        +"cidade: "+ novoProfissional.getCidade() + "\n"
                        +"estado: "+ novoProfissional.getEstado() + "\n"
                        +"CRM: "+ novoProfissional.getCRM() + "\n:)");
                
            }
            else {
                System.out.println("Informe seus sintomas, para"
                        + " finalizar digite uma 'fim' e pressione enter");
                String sintoma = "";
                ArrayList<String> sintomas = new ArrayList<>();
                while (sintoma.isEmpty() 
                        || (!sintoma.isEmpty() 
                            && !sintoma.equals("fim"))) {
                    sintoma = scanner.nextLine();
                    if (!sintoma.equals("fim"))
                        sintomas.add(sintoma);
                }
                
                Paciente novoPaciente = new Paciente(nome, telefone, CPF, 
                        cidade, estado, senha, sintomas);
                
                System.out.println("Paciente cadastrado com Sucesso!\n"
                    +"Informações cadastrais:\n"
                    +"Nome: " + novoPaciente.getNome() + "\n"
                    +"Telefone: " + novoPaciente.getTelefone() + "\n"
                    +"CPF: " + novoPaciente.getCPF() + "\n"
                    +"Cidade: " + novoPaciente.getCidade() + "\n"
                    +"Estado: " + novoPaciente.getEstado() + "\n"
                    +"Sintomas:" + novoPaciente.getSintomas() + "\n :)");
            }
        
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Você digitou valores errados!\n+"
                    + "Os campos: "
                    + "- Nome;\n" 
                    + "- Cidade;\n" 
                    + "- Estado;\n" 
                    + "- Sintomas;\n" 
                    + "- CRM;\n" 
                    + "- Senha.\nAceitam valores de texto.\n"
                    + "Os campos:"
                    + "- Telefone;"
                    + "- CPF.\nAceitam valores numéricos");
        }
        
    }
    
}
