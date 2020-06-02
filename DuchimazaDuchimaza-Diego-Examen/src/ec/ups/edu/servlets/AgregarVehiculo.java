package ec.ups.edu.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.ups.edu.dao.DAOFactory;
import ec.ups.edu.dao.PersonaDAO;
import ec.ups.edu.dao.VehiculoDAO;
import ec.ups.edu.modelo.Persona;
import ec.ups.edu.modelo.Vehiculo;

/**
 * Servlet implementation class AgregarTelefono
 */
@WebServlet("/AgregarTelefono")
public class AgregarVehiculo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarVehiculo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String placa = request.getParameter("placa");
		String marca = request.getParameter("marca");
		String modelo = request.getParameter("modelo");
		
		PersonaDAO personaDao = DAOFactory.getFactory().getPersonaDAO();
    	Persona persona = personaDao.findById(String.valueOf(request.getSession().getAttribute("personaID")));
    	
		
		VehiculoDAO vehiculoDao = DAOFactory.getFactory().getVehiculoDAO();
		Vehiculo vehiculo= new Vehiculo(placa, marca, modelo);
		
	//	telefono.setPersona(persona);
		//telefonoDao.create(telefono);
		persona.agregarVehiculo(vehiculo);
		personaDao.update(persona);
		
		response.sendRedirect("/DuchimazaDuchimaza-Diego-Examen/MiAgenda");
	}

}
