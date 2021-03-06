package ec.ups.edu.dao;



import java.util.List;

import ec.ups.edu.modelo.Persona;

public interface PersonaDAO extends GenericDAO<Persona, String> {

	public abstract Persona findPersona(String cedula);

	public abstract List<Persona> findByIdOrMail(String context);

}
