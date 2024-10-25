package co.edu.umanizales.juice.controller;

import co.edu.umanizales.juice.model.Jugo;
import co.edu.umanizales.juice.model.JugoEnLeche;
import co.edu.umanizales.juice.model.JugoEnAgua;
import co.edu.umanizales.juice.service.JugoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jugos")
public class JugoController {

    @Autowired
    private JugoService jugoService;

    @GetMapping
    public List<Jugo> getAllJugos() {
        return jugoService.getAllJugos();
    }

    @GetMapping("/leche")
    public List<JugoEnLeche> getJugosEnLeche() {
        return jugoService.getJugosEnLeche();
    }

    @GetMapping("/agua")
    public List<JugoEnAgua> getJugosEnAgua() {
        return jugoService.getJugosEnAgua();
    }
}
