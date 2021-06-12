package com.example.projeto;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/v1")
public class PrincipalController {


    @RequestMapping(value = {"","/"})
    String post () {
        return "Bem vindo :D";
    }
    @RequestMapping("/api")
    String index(){
        return "API";
    }
    @RequestMapping(value={"/page", "page*","/view","view*","/msg"})
    String indexMultipleMapping(){
        return "multi path, /page, /page**, /view, /view**, /msg ";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/feriados")
    public ModelAndView envioDados() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("data.json");
        return modelAndView;
    }
}
