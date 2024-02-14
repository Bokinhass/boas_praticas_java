package br.com.alura.domain;

public class Abrigo {

  private String nome;
  private String telefone;
  private String email;
  private long id;
  private Pet[] pets;

  public Abrigo() {
  }

  public Abrigo(String nome, String telefone, String email) {
    this.nome = nome;
    this.telefone = telefone;
    this.email = email;
  }

  public long getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public String getTelefone() {
    return telefone;
  }

  public String getEmail() {
    return email;
  }
}