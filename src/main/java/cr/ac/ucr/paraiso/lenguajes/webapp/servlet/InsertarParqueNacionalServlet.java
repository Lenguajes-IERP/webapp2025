
package cr.ac.ucr.paraiso.lenguajes.webapp.servlet;

//import cr.ac.ucr.paraiso.lenguajes.webapp.domain.ParqueNacional;
import cr.ac.ucr.paraiso.lenguajes.webapp.domain.ParqueNacional;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * Servlet configurado con anotaciones y el método POST
 */
@WebServlet(name="InsertarParqueNacionalServlet", urlPatterns={"/insertarParqueNacional"})
public class InsertarParqueNacionalServlet extends HttpServlet {
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        ParqueNacional parqueNacional = new ParqueNacional();
        parqueNacional.setIdParque(Integer.parseInt (request.getParameter("idParque")));
        parqueNacional.setNombre(request.getParameter("nombreParque"));
        
         // deberiamos enviar el empleado para insertar a la b.d.
        //req.setAttribute("empleadoInsertado", empleado);
        request.getRequestDispatcher("/ver_parque.jsp?idParque="+parqueNacional.getIdParque()+
                "&nombre="+parqueNacional.getNombre()).forward(request, response);
    }
}
