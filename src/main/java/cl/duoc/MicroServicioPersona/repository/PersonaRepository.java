package cl.duoc.MicroServicioPersona.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import cl.duoc.MicroServicioPersona.model.Persona;

@Repository
public class PersonaRepository {

    private final List<Persona> listaPersonas = new ArrayList<>();

    public List<Persona> obtenerPersonas() {
        return new ArrayList<Persona>(listaPersonas);
    }

    public Optional<Persona> buscarPorRut(int rut) {
        for (Persona persona : listaPersonas) {
            if (persona.getRut() == rut) {
                return Optional.of(persona);
            }
        }
        return Optional.empty();
    }

    public Persona guardarPersona(Persona persona) {
        listaPersonas.add(persona);
        return persona;
    }

    public Optional<Persona> actualizarPersona(Persona persona) {
        for (Persona user : listaPersonas) {
            if (persona.getRut() == user.getRut()) {
                user.setNombre(persona.getNombre());
                user.setDv(persona.getDv());
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

    public void eliminarPersona(Persona persona) {
        listaPersonas.remove(persona);
    }
}
