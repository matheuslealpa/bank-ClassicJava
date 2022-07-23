package domain;

import java.time.LocalDate;

public class Titular {

    private Long id;
    private String nome;
    private LocalDate dataNascimento;
    private Endereco enderecoResidencial;
    private Endereco enderecoProfissional;
    private Documentacao documentacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEnderecoResidencial() {
        return enderecoResidencial;
    }

    public void setEnderecoResidencial(Endereco enderecoResidencial) {
        this.enderecoResidencial = enderecoResidencial;
    }

    public Endereco getEnderecoProfissional() {
        return enderecoProfissional;
    }

    public void setEnderecoProfissional(Endereco enderecoProfissional) {
        this.enderecoProfissional = enderecoProfissional;
    }

    public Documentacao getDocumentacao() {
        return documentacao;
    }

    public void setDocumentacao(Documentacao documentacao) {
        this.documentacao = documentacao;
    }
}
