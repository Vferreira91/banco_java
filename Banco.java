package banco;

import agencia.Agencia;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private String cnpj;
    private int codigoBanco;
    private List<Agencia> agencias;

    public Banco(String nome, String cnpj, int codigoBanco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.codigoBanco = codigoBanco;
        this.agencias = new ArrayList<>();
    }

    public void adicionarAgencia(Agencia agencia) {
        agencias.add(agencia);
    }

    public void removerAgencia(Agencia agencia) {
        agencias.remove(agencia);
    }

    public double calcularPatrimonioTotal() {
        return agencias.stream()
                .mapToDouble(Agencia::calcularPatrimonioAgencia)
                .sum();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(int codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public List<Agencia> getAgencias() {
        return agencias;
    }

    public void setAgencias(List<Agencia> agencias) {
        this.agencias = agencias;
    }
}