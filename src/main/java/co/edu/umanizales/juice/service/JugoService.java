package co.edu.umanizales.juice.service;

import co.edu.umanizales.juice.model.Jugo;
import co.edu.umanizales.juice.model.JugoEnLeche;
import co.edu.umanizales.juice.model.JugoEnAgua;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JugoService {
    private List<Jugo> jugos = new ArrayList<>();

    public JugoService() {
        // Inicializa algunos jugos con ejemplos
        jugos.add(new JugoEnLeche("Jugo de Fresa en Leche", true, 250));
        jugos.add(new JugoEnLeche("Jugo de Mango en Leche", false, 300));
        jugos.add(new JugoEnAgua("Jugo de Limón en Agua", true, 200));
        jugos.add(new JugoEnAgua("Jugo de Piña en Agua", false, 350));
    }

    public List<Jugo> getAllJugos() {
        return jugos;
    }

    public List<JugoEnLeche> getJugosEnLeche() {
        // Filtra los jugos que son en leche
        List<JugoEnLeche> jugosEnLeche = new ArrayList<>();
        for (Jugo jugo : jugos) {
            if (jugo instanceof JugoEnLeche) {
                jugosEnLeche.add((JugoEnLeche) jugo);
            }
        }
        return jugosEnLeche;
    }

    public List<JugoEnAgua> getJugosEnAgua() {
        // Filtra los jugos que son en agua
        List<JugoEnAgua> jugosEnAgua = new ArrayList<>();
        for (Jugo jugo : jugos) {
            if (jugo instanceof JugoEnAgua) {
                jugosEnAgua.add((JugoEnAgua) jugo);
            }
        }
        return jugosEnAgua;
    }
}
