package ec.ups.edu.dao;

import java.util.List;

import ec.ups.edu.modelo.Persona;
import ec.ups.edu.modelo.Vehiculo;


public interface GenericDAO<T, ID> {



    public boolean create(T entity);

    public T findById(ID id);

    public boolean update(T entity);

    public boolean delete(T entity);
    
    public boolean deleteById(ID id);

    public List<T> find();


	

}
