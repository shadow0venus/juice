package co.edu.umanizales.juice.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class JugoEnLeche extends Jugo {
    private int cantidadLeche; // Cantidad de leche en ml

    public JugoEnLeche(String nombre, boolean conAzucar, int cantidadLeche) {
        super(nombre, conAzucar);
        this.cantidadLeche = cantidadLeche;
    }
}

