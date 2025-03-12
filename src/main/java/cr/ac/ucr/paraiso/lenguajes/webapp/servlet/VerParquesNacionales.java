/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package cr.ac.ucr.paraiso.lenguajes.webapp.servlet;

import cr.ac.ucr.paraiso.lenguajes.webapp.domain.ParqueNacional;
import jakarta.servlet.ServletConfig;
import java.io.IOException;
import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.LinkedList;

/**
 *
 * @author Alvaro Mena
 */
public class VerParquesNacionales extends HttpServlet {
   
   private String tituloPagina;
    private ParqueNacional parqueNacional;
    private LinkedList<ParqueNacional> parquesNacionales;
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config); 
        this.tituloPagina = "Parques Nacionales de Costa Rica";
        this.parqueNacional = new ParqueNacional(100, "Tapantí");
        this.parquesNacionales =  new LinkedList<>();
        this.parquesNacionales.add(parqueNacional);
        this.parquesNacionales.add(new ParqueNacional(200, "Corcovado"));
        
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        request.setAttribute("titulo", this.tituloPagina);
        request.setAttribute("parqueNacional", this.parqueNacional);
        request.setAttribute("parquesNacionales", this.parquesNacionales);
        request.getRequestDispatcher("/ver_parques.jsp").forward(request, response);
    }

}
