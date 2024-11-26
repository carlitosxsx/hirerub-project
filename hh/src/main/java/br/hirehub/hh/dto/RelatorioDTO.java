package br.hirehub.hh.dto;

import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@ToString
@NoArgsConstructor
public class RelatorioDTO {
    private String titulo;
    private String legenda;
    private String xLabel;
    private String yLabel;
    private List<String> labels;
    private List<String> valores;
    private List<String> cores;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getLegenda() {
        return legenda;
    }
    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }
    public String getXLabel() {
        return xLabel;
    }
    public void setXLabel(String xLabel) {
        this.xLabel = xLabel;
    }
    public String getyLabel() {
        return yLabel;
    }
    public void setyLabel(String yLabel) {
        this.yLabel = yLabel;
    }
    public List<String> getLabels() {
        return labels;
    }
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }
    public List<String> getValores() {
        return valores;
    }
    public void setValores(List<String> valores) {
        this.valores = valores;
    }
    public List<String> getCores() {
        return cores;
    }
    public void setCores(List<String> cores) {
        this.cores = cores;
    }
}
