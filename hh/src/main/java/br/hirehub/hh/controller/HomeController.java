package br.hirehub.hh.controller;


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
    @RequestMapping("/login")
    public ModelAndView fazerLogin(){
        return new ModelAndView("paginas/login");
    }

    @GetMapping
    @RequestMapping("/servicos/diarista")
    public ModelAndView exibirServico(){
        return new ModelAndView("paginas/diarista");
    }

}
