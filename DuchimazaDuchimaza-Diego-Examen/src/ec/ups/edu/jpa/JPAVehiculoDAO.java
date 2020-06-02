package ec.ups.edu.jpa;

import java.util.List;

import ec.ups.edu.dao.VehiculoDAO;
import ec.ups.edu.modelo.Vehiculo;

public class JPAVehiculoDAO extends JPAGenericDAO<Vehiculo, Integer> implements VehiculoDAO {

	public JPAVehiculoDAO() {
		super(Vehiculo.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Vehiculo> findByPersonaId(String cedula) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Vehiculo> findByVehiculo(String cedula, String numero) {
		// TODO Auto-generated method stub
		return null;
	}

}
