package cl.duoc.MicroServicioPersona.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {

    @NotNull(message = "El campo es obligatorio")
    private int rut;

    //@Positive(message = "El valor debe ser mayor a cero")
    private char dv;

    @NotBlank(message = "El campo es obligatorio")
    private String nombre;
}
