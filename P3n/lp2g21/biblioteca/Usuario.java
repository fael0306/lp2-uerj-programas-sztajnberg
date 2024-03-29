package lp2g21.biblioteca;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Usuario extends Pessoa {

  String endereco;
  int codigoUsuario;
  ArrayList < Emprest > hist;

  public Usuario() {}

  public Usuario(String nome, String sobreNome, int dia, int mes, int ano, long numCPF, float peso, float altura,
    String endereco, int codigoUsuario, ArrayList < Emprest > hist) {
    super(nome, sobreNome, dia, mes, ano, numCPF, peso, altura);
    this.endereco = endereco;
    this.codigoUsuario = codigoUsuario;
    this.hist = hist;
  }

  public void addLivroHist(GregorianCalendar datadelocacao, GregorianCalendar datadevolucao, String codLivro) {
    Emprest emprestimo = new Emprest(datadelocacao,datadevolucao,codLivro);
    hist.add(emprestimo);
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public int getCodigoUsuario() {
    return codigoUsuario;
  }

  public void setCodigoUsuario(int codigoUsuario) {
    this.codigoUsuario = codigoUsuario;
  }

  public ArrayList < Emprest > getHist() {
    return hist;
  }

  public void setHist(ArrayList < Emprest > hist) {
    this.hist = hist;
  }

  public String toString() {
    String imp;

    imp = super.toString() +
      "\nEndereço: " + getEndereco() +
      "\nCódigo do usuário: " + getCodigoUsuario() +
      "\nHistórico: " + getHist();

    return imp;
  }
}