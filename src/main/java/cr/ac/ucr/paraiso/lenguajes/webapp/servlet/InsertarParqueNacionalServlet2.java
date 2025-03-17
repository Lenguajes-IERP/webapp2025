/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package cr.ac.ucr.paraiso.lenguajes.webapp.servlet;

import cr.ac.ucr.paraiso.lenguajes.webapp.domain.ParqueNacional;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Alvaro Mena
 */
public class InsertarParqueNacionalServlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       int idParque = Integer.parseInt(req.getParameter("idParque"));
       String nombre = req.getParameter("nombre");
        ParqueNacional parquePorInsertar = new ParqueNacional(idParque, nombre);
        // TODO escribir el código para almacenar en la b.d
        req.getRequestDispatcher("/ver_parque.jsp?idParque="+parquePorInsertar.getIdParque()+"&nombre="+
                parquePorInsertar.getNombre()).forward(req, resp);
    }
   
    
}
