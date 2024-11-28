package br.hirehub.hh.controller;


import br.hirehub.hh.dto.RelatorioDTO;
import br.hirehub.hh.service.RelatorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public ModelAndView index(){
        return new ModelAndView("home/index");
    }

    @GetMapping
    @RequestMapping("/servicos")
    public ModelAndView exibirServicos(){
        return new ModelAndView("paginas/servicos");
    }

    @GetMapping
    @RequestMapping("/servicos/diarista")
    public ModelAndView exibirServicoDiarista(){
        return new ModelAndView("paginas/diarista");
    }

    @GetMapping
    @RequestMapping("/servicos/eletricista")
    public ModelAndView exibirServicoEletricista(){
        return new ModelAndView("paginas/eletricista");
    }

    @GetMapping
    @RequestMapping("/servicos/jardineiro")
    public ModelAndView exibirServicoJardineiro(){
        return new ModelAndView("paginas/jardineiro");
    }

    @GetMapping
    @RequestMapping("/login")
    public ModelAndView fazerLogin(){
        return new ModelAndView("paginas/login");
    }

    @GetMapping
    @RequestMapping("/relatorio")
    public ModelAndView exibirRelatorios(){
        return new ModelAndView("graficos/home/index");
    }

    @Autowired
    private RelatorioService relatorioService;

    @GetMapping
    @RequestMapping("/relatorio/barra")
    public ModelAndView exibirGraficoBarra(){

        ModelAndView mv = new ModelAndView("graficos/relatorio/barra");
        RelatorioDTO relatorioDTO = relatorioService.relatorioDeBarra();
        mv.addObject("relatorio", relatorioDTO);
        return mv;
    }

    @GetMapping
    @RequestMapping("/relatorio/pizza")
    public ModelAndView exibirGraficoPizza(){
        ModelAndView mv = new ModelAndView("graficos/relatorio/pizza");
        RelatorioDTO relatorioDTO = relatorioService.relatorioDePizza();
        mv.addObject("relatorio", relatorioDTO);
        return mv;
    }

}
