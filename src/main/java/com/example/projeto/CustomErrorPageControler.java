package com.example.projeto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = {"/error"}, method = RequestMethod.GET)
public class CustomErrorPageControler {
    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public @ResponseBody
    Map<String, ? extends Object> error404() {
        Map<String, Object> modelMap = new HashMap<String, Object>(2);

        modelMap.put("message", "Erro 404");
        modelMap.put("detail", "Página Não Encontrada");
        modelMap.put("success", false);

        return modelMap;
    }
}
