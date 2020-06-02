package ec.ups.edu.modelo;

import java.io.Serializable;
import javax.persistence.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    
	private String nombre;
	
	@Id
	private String cedula;
	
	private String direccion;
	
	private String telefono;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "persona", orphanRemoval = true)
	private List<Vehiculo> vehiculos;
	
	public Persona() {
		
	}
	
	

	public Persona(String nombre, String cedula, String direccion, String telefono) {
	
		this.nombre = nombre;
		this.cedula = cedula;
		this.direccion = direccion;
		this.telefono = telefono;
	
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cedula == null) ? 0 : cedula.hashCode());
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
		result = prime * result + ((vehiculos == null) ? 0 : vehiculos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (cedula == null) {
			if (other.cedula != null)
				return false;
		} else if (!cedula.equals(other.cedula))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		if (vehiculos == null) {
			if (other.vehiculos != null)
				return false;
		} else if (!vehiculos.equals(other.vehiculos))
			return false;
		return true;
	}

	public void eliminarVehiculo(Vehiculo vehiculo) {
	//	System.out.println("vamos a eliminar"+ telefono);
	//	System.out.println(telefonos);
	
		if(vehiculos.contains(vehiculo)) {
			this.vehiculos.remove(vehiculo);
			vehiculo.setPersona(null);
		}
		
	}
	
	public void agregarVehiculo(Vehiculo vehiculo) {
	
		if(!vehiculos.contains(vehiculo)) {
			this.vehiculos.add(vehiculo);
			vehiculo.setPersona(this);
		}
	}



	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", cedula=" + cedula + ", direccion=" + direccion + ", telefono="
				+ telefono + "]";
	}
	
	



}
