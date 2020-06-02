package ec.ups.edu.jpa;

import java.util.ArrayList;
import java.util.List;

import ec.ups.edu.dao.PersonaDAO;
import ec.ups.edu.modelo.Persona;

public class JPAPersonaDAO extends JPAGenericDAO<Persona, String> implements PersonaDAO{

	public JPAPersonaDAO() {
		super(Persona.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Persona findPersona(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("hola");
		String sql = "FROM Persona p WHERE p.cedula = '" + cedula +"'";
		Persona persona = (Persona) em.createQuery(sql).getSingleResult();
		persona.getVehiculos().size();
		System.out.println("Persona"+ persona.toString());
		return persona;
	}

	@Override
	public List<Persona> findByIdOrMail(String context) {
		// TODO Auto-generated method stub
		List<Persona> personas = new ArrayList<Persona>();
		if(context.equals("all")) {
			personas = (List<Persona>) em.createQuery("FROM Persona p").getResultList();
		}else {
			String spql = "FROM Persona p WHERE p.cedula = '"+context+"'";
			personas = (List<Persona>) em.createQuery(spql).getResultList();
		}
		return personas;
	}

}
