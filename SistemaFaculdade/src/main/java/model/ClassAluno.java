package model;

import java.util.ArrayList;
import java.util.List;

public class ClassAluno {
    private String matricula;
    private String nome;
    private int periodo;
    private List<ClassDisciplina> disc = new ArrayList<>();

    public ClassAluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public ClassAluno(String matricula, String nome, int periodo, List<ClassDisciplina> disc) {
        this.matricula = matricula;
        this.nome = nome;
        this.periodo = periodo;
        this.setDisc(disc);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public List<ClassDisciplina> getDisc() {
        return disc;
    }

    public void setDisc(List<ClassDisciplina> disc) {
        this.disc = disc;
    }




}
