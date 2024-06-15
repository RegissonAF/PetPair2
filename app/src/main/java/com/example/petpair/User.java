package com.example.petpair;

public class User {
   private String nome;
   private String email;
   private int cpf;
   private int idade;

   public User() {
   }

   public User(String nome, String email, int cpf, int idade) {
      this.nome = nome;
      this.email = email;
      this.cpf = cpf;
      this.idade = idade;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public int getCpf() {
      return cpf;
   }

   public void setCpf(int cpf) {
      this.cpf = cpf;
   }

   public int getIdade() {
      return idade;
   }

   public void setIdade(int idade) {
      this.idade = idade;
   }
}
