package com.example.petpair;

public class Pet {
    private String nome;
    private String raca;
    private String idDono;
    private int idade;
    private int sexo;

    public Pet() {
    }

    public Pet(String nome, String raca, String idDono, int idade, int sexo) {
        this.nome = nome;
        this.raca = raca;
        this.idDono = idDono;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getIdDono() {
        return idDono;
    }

    public void setIdDono(String idDono) {
        this.idDono = idDono;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
}
