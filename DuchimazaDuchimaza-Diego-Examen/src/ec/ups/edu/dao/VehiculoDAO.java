package ec.ups.edu.dao;

 

 

import java.util.List;

 

import ec.ups.edu.modelo.Vehiculo;

 

public interface VehiculoDAO extends GenericDAO<Vehiculo, Integer> {

 

    public abstract List<Vehiculo> findByPersonaId(String cedula);
    public abstract List<Vehiculo> findByVehiculo(String cedula,String numero);

 

}