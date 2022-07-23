package domain;

import java.time.LocalDate;

public class Documentacao {

    private Long id;
    private Long rg;
    private String orgaoEmissor;
    private String estadoEmissor;
    private LocalDate dataEmissao;
    private Long cpf;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRg() {
        return rg;
    }

    public void setRg(Long rg) {
        this.rg = rg;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    public String getEstadoEmissor() {
        return estadoEmissor;
    }

    public void setEstadoEmissor(String estadoEmissor) {
        this.estadoEmissor = estadoEmissor;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
}
