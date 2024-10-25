package co.edu.umanizales.juice.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class JugoEnAgua extends Jugo {
    private int cantidadAgua; // Cantidad de agua en ml

    public JugoEnAgua(String nombre, boolean conAzucar, int cantidadAgua) {
        super(nombre, conAzucar);
        this.cantidadAgua = cantidadAgua;
    }
}


