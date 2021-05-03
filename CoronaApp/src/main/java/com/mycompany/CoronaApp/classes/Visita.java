package com.mycompany.CoronaApp.classes;

import java.util.Date;

/**
 */
public class Visita {
    
    private int codigo;

    private Paciente paciente;
    
    private String profissional;
    
    private Date data;
    
    private boolean pacienteInfectado = false;
    
    private String diagnostico;
    
    private StatusVisita status = StatusVisita.AGENDADA;

    public Visita() {
        
    }

    public Visita(int codigo, Paciente paciente, String profissional, 
            Date data, boolean pacienteInfectado, String diagnostico) {
        this.codigo = codigo;
        this.paciente = paciente;
        this.profissional = profissional;
        this.data = data;
        this.pacienteInfectado = pacienteInfectado;
        this.diagnostico = diagnostico;
    }
    
    public int agendarVisita() {
        return 0;
    }

    public StatusVisita getStatus() {
        return status;
    }

    public void setStatus(StatusVisita status) {
        this.status = status;
    }
    
    public  void atualizarVisita(boolean pacienteInfectado) {
        this.pacienteInfectado = pacienteInfectado;
        setStatus(StatusVisita.FINALIZADA);
    }
    
    public Visita consultarVisita() {
        return new Visita();
    }

    /**
     * Get the value of diagnostico
     *
     * @return the value of diagnostico
     */
    public String getDiagnostico() {
        return diagnostico;
    }

    /**
     * Set the value of diagnostico
     *
     * @param diagnostico new value of diagnostico
     */
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }


    /**
     * Get the value of pacienteInfectado
     *
     * @return the value of pacienteInfectado
     */
    public boolean isPacienteInfectado() {
        return pacienteInfectado;
    }

    /**
     * Set the value of pacienteInfectado
     *
     * @param pacienteInfectado new value of pacienteInfectado
     */
    public void setPacienteInfectado(boolean pacienteInfectado) {
        this.pacienteInfectado = pacienteInfectado;
    }

    /**
     * Get the value of data
     *
     * @return the value of data
     */
    public Date getData() {
        return data;
    }

    /**
     * Set the value of data
     *
     * @param data new value of data
     */
    public void setData(Date data) {
        this.data = data;
    }


    /**
     * Get the value of profissional
     *
     * @return the value of profissional
     */
    public String getProfissional() {
        return profissional;
    }

    /**
     * Set the value of profissional
     *
     * @param profissional new value of profissional
     */
    public void setProfissional(String profissional) {
        this.profissional = profissional;
    }


    /**
     * Get the value of paciente
     *
     * @return the value of paciente
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * Set the value of paciente
     *
     * @param paciente new value of paciente
     */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    /**
     * Get the value of codigo
     *
     * @return the value of codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Set the value of codigo
     *
     * @param codigo new value of codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
