package br.hirehub.hh.service;

import br.hirehub.hh.dto.RelatorioDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RelatorioService {

    public RelatorioDTO relatorioDeBarra() {
        var dto = new RelatorioDTO();
        dto.setTitulo("Visualizações do Site por Mês");
        dto.setLegenda("Total por mês");
        dto.setXLabel("Mês");
        var valores = new ArrayList<String>();
        var labels = new ArrayList<String>();
        labels.add("Jan");
        labels.add("Feb");
        labels.add("Mar");
        labels.add("Apr");
        labels.add("May");
        labels.add("Jun");
        labels.add("Jul");
        labels.add("Aug");
        labels.add("Sep");
        labels.add("Oct");
        labels.add("Nov");
        labels.add("Dec");

        valores.add("50");
        valores.add("180");
        valores.add("74");
        valores.add("93");
        valores.add("129");
        valores.add("136");
        valores.add("91");
        valores.add("262");
        valores.add("146");
        valores.add("193");
        valores.add("67");
        valores.add("85");

        dto.setLabels(labels);
        dto.setValores(valores);
        return dto;
    }

    public RelatorioDTO relatorioDePizza() {
        var dto = new RelatorioDTO();
        dto.setTitulo("Serviços mais Requeridos");
        dto.setLegenda("Total por mês");
        dto.setXLabel("Serviço");
        var valores = new ArrayList<String>();
        var labels = new ArrayList<String>();
        labels.add("Diarista");
        labels.add("Eletrecista");
        labels.add("Jardineiro");
        labels.add("Fotógrafo");
        labels.add("Serviço de TI");
        labels.add("Marketing Digital");

        valores.add("40");
        valores.add("23");
        valores.add("19");
        valores.add("38");
        valores.add("27");
        valores.add("8");

        dto.setLabels(labels);
        dto.setValores(valores);
        return dto;
    }

}
