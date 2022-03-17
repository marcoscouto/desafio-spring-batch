package com.marcoscouto.desafiobatch.data;

import javax.persistence.*;

@Entity
@Table(name = "lancamento")
public class LancamentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "codigo_natureza_despesa")
    private Integer codigoNaturezaDespesa;

    @Column(name = "descricao_natureza_despesa")
    private String descricaoNaturezaDespesa;

    @Column(name = "descricao_lancamento")
    private String descricaoLancamento;

    @Column(name = "data_lancamento")
    private String dataLancamento;

    @Column(name = "valor_lancamento")
    private Double valorLancamento;

    public LancamentoEntity() {
    }

    public LancamentoEntity(Integer codigoNaturezaDespesa, String descricaoNaturezaDespesa, String descricaoLancamento, String dataLancamento, Double valorLancamento) {
        this.codigoNaturezaDespesa = codigoNaturezaDespesa;
        this.descricaoNaturezaDespesa = descricaoNaturezaDespesa;
        this.descricaoLancamento = descricaoLancamento;
        this.dataLancamento = dataLancamento;
        this.valorLancamento = valorLancamento;
    }

    public Integer getCodigoNaturezaDespesa() {
        return codigoNaturezaDespesa;
    }

    public void setCodigoNaturezaDespesa(Integer codigoNaturezaDespesa) {
        this.codigoNaturezaDespesa = codigoNaturezaDespesa;
    }

    public String getDescricaoNaturezaDespesa() {
        return descricaoNaturezaDespesa;
    }

    public void setDescricaoNaturezaDespesa(String descricaoNaturezaDespesa) {
        this.descricaoNaturezaDespesa = descricaoNaturezaDespesa;
    }

    public String getDescricaoLancamento() {
        return descricaoLancamento;
    }

    public void setDescricaoLancamento(String descricaoLancamento) {
        this.descricaoLancamento = descricaoLancamento;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Double getValorLancamento() {
        return valorLancamento;
    }

    public void setValorLancamento(Double valorLancamento) {
        this.valorLancamento = valorLancamento;
    }

    @Override
    public String toString() {
        return "LancamentoEntity{" +
                "codigoNaturezaDespesa=" + codigoNaturezaDespesa +
                ", descricaoNaturezaDespesa='" + descricaoNaturezaDespesa + '\'' +
                ", descricaoLancamento='" + descricaoLancamento + '\'' +
                ", dataLancamento='" + dataLancamento + '\'' +
                ", valorLancamento=" + valorLancamento +
                '}';
    }
}
