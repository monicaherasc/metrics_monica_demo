package com.example.demo.controller;

import com.example.demo.SaludoInterface;
import com.example.demo.sevice.GeneradorDeSaludosService;
import lombok.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@Data
public class SaludadorController implements SaludoInterface {
    @Autowired
    GeneradorDeSaludosService generadorDeSaludosService;

    @Override
    @RequestMapping("/mex")
    @ResponseBody
    public String formal() {
        return generadorDeSaludosService.enEspanol();

    }
}
