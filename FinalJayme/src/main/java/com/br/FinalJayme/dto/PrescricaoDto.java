package com.br.FinalJayme.dto;

import java.util.Date;
import java.util.List;

import com.br.FinalJayme.entities.Prescricao;

public class PrescricaoDto {

    private List<PacienteDto> paciente;
    private List<MedicoDto> medicos;
    private Date data;
    private List<MedicamentoDto> medicamentos;
    private String receita;

    public PrescricaoDto(Prescricao prescricao) {
        this.data = prescricao.getData();
        this.medicos = prescricao.getMedicos().stream().map(x -> new MedicoDto(x)).toList();
        this.paciente = prescricao.getPacientes().stream().map(x -> new PacienteDto(x)).toList();
        this.medicamentos = prescricao.getMedicamentos().stream().map(x -> new MedicamentoDto(x)).toList();
        this.receita = prescricao.getReceita();
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<MedicoDto> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<MedicoDto> medicos) {
        this.medicos = medicos;
    }

    public List<PacienteDto> getPaciente() {
        return paciente;
    }

    public void setPaciente(List<PacienteDto> paciente) {
        this.paciente = paciente;
    }

    public String getReceita() {
        return receita;
    }

    public void setReceita(String receita) {
        this.receita = receita;
    }

    public List<MedicamentoDto> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<MedicamentoDto> medicamentos) {
        this.medicamentos = medicamentos;
    }

}
