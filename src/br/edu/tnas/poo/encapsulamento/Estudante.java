package br.edu.tnas.poo.encapsulamento;

import java.util.Calendar;
import java.util.Date;

public class Estudante {
    private String nome;
    private Date dataNascimento;
    private String matricula;

    public int obterIdade() {
        Calendar nascimento = Calendar.getInstance();
        nascimento.setTime(dataNascimento);
        Calendar hoje = Calendar.getInstance();
        hoje.setTime(new Date());
        int idade = hoje.get(Calendar.YEAR) - nascimento.get(Calendar.YEAR);
        if (nascimento.get(Calendar.DAY_OF_YEAR) > hoje.get(Calendar.DAY_OF_YEAR)) {
            --idade;
        }
        return idade;
    }
    
    public void setDataNascimento(int dia, int mes, int ano) {
        Calendar calendarNascimento = Calendar.getInstance();
        calendarNascimento.set(Calendar.DAY_OF_MONTH, dia);
        calendarNascimento.set(Calendar.MONTH, mes-1);
        calendarNascimento.set(Calendar.YEAR, ano);
        this.dataNascimento = calendarNascimento.getTime();
    }
    
    public void setDataNascimento(Date nascimento) {
        this.dataNascimento = nascimento;
    }
    
    public Estudante() {
        
    }
    
    public Estudante(String nome, Date nascimento, String matricula) {
        this.nome = nome;
        this.dataNascimento = nascimento;
        this.matricula = matricula;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    

}
