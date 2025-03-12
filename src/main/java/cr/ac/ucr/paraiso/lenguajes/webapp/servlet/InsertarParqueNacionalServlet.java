/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package cr.ac.ucr.paraiso.lenguajes.webapp.servlet;

import cr.ac.ucr.paraiso.lenguajes.webapp.domain.ParqueNacional;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Alvaro Mena
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
