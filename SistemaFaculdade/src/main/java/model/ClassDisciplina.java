package model;

public class ClassDisciplina {
    private String nome;
    private int periodo;
    private String dataPeriodo;
    private char status;

    public ClassDisciplina(String nome, int periodo, String dataPeriodo, char status) {
        this.nome = nome;
        this.periodo = periodo;
        this.dataPeriodo = dataPeriodo;
        this.status = status;
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

    public String getDataPeriodo() {
        return dataPeriodo;
    }

    public void setDataPeriodo(String dataPeriodo) {
        this.dataPeriodo = dataPeriodo;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Integer verificaDisciplina(char status) {
        if (status == 'A') {
            return 1;
        }
        else {
            return 0;
        }
    }
}
