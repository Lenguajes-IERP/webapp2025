/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package cr.ac.ucr.paraiso.lenguajes.webapp.servlet;

import cr.ac.ucr.paraiso.lenguajes.webapp.domain.ParqueNacional;
import jakarta.servlet.ServletConfig;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.LinkedList;
/**
 *
 * Servlet configurado en el web.xml
 */
public class VerParquesNacionalesServlet1 extends HttpServlet {
    private String tituloPagina;
    private ParqueNacional parqueNacional;
    private LinkedList<ParqueNacional> parques;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config); 
        this.tituloPagina = "Parques Nacionales de Costa Rica";
        this.parqueNacional = new ParqueNacional();
        this.parqueNacional.setIdParque(100);
        this.parqueNacional.setNombre("Tapantí");
        
        // Crear la lista
        parques = new LinkedList<>();
        parques.add(new ParqueNacional(200, "Corcovado"));
        parques.add(new ParqueNacional(300, "Chirripó"));
        parques.add(parqueNacional);
        
    }
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("tituloPagina", this.tituloPagina);
        req.setAttribute("parqueNacional", this.parqueNacional);
        req.setAttribute("parques", this.parques);
        
        // encarga al jsp de construir la respuesta al usuario
        req.getRequestDispatcher("/ver_parques_nacionales2.jsp").forward(req, resp);
    }

    
   
   

    
}
