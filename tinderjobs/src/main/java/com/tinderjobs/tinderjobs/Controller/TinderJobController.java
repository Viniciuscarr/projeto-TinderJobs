package com.tinderjobs.tinderjobs.Controller;

import java.util.List;

import com.tinderjobs.tinderjobs.InterfaceService.TinderJobInterfServ;
import com.tinderjobs.tinderjobs.Model.DadosPessoais;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class TinderJobController {

    @Autowired
    private TinderJobInterfServ service;

    @GetMapping("/listar")
    public String listar(Model model){
        List<DadosPessoais> profissionais = service.listar();
        model.addAttribute("profissionais", profissionais);
        return "index";
    }

}
