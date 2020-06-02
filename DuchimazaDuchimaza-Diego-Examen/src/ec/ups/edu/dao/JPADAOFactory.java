package ec.ups.edu.dao;

import ec.ups.edu.jpa.JPAPersonaDAO;
import ec.ups.edu.jpa.JPAVehiculoDAO;


public class JPADAOFactory extends DAOFactory {

	
	@Override
	public PersonaDAO getPersonaDAO() {
		return new JPAPersonaDAO();
	}

	@Override
	public VehiculoDAO getVehiculoDAO() {
		return new JPAVehiculoDAO();
	}

	
}
