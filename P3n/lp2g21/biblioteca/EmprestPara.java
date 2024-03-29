package lp2g21.biblioteca;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class EmprestPara implements Serializable {

  GregorianCalendar dataemprestimo, datadevolucao;
  int codigoUsuario;

  public EmprestPara(GregorianCalendar dataemprestimo, GregorianCalendar datadevolucao, int codigoUsuario) {
    this.dataemprestimo = dataemprestimo;
    this.datadevolucao = datadevolucao;
    this.codigoUsuario = codigoUsuario;
  }

  public GregorianCalendar getDataemprestimo() {
    return dataemprestimo;
  }

  public void setDataemprestimo(GregorianCalendar dataemprestimo) {
    this.dataemprestimo = dataemprestimo;
  }

  public GregorianCalendar getDatadevolucao() {
    return datadevolucao;
  }

  public void setDatadevolucao(GregorianCalendar datadevolucao) {
    this.datadevolucao = datadevolucao;
  }

  public int getCodigoUsuario() {
    return codigoUsuario;
  }

  public void setCodigoUsuario(int codigoUsuario) {
    this.codigoUsuario = codigoUsuario;
  }

  public String toString() {
    String imp;

    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    imp = "Data de empréstimo: " + formato.format(getDataemprestimo().getTime()) +
      "\nData de devolução: " + formato.format(getDatadevolucao().getTime()) +
      "\nCódigo do usuário: " + getCodigoUsuario();

    return imp;
  }
}