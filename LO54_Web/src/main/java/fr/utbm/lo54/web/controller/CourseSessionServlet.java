/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.lo54.web.controller;

import fr.utbm.core.entity.Course;
import fr.utbm.core.entity.CourseSession;
import fr.utbm.core.entity.Location;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yassine
 */
public class CourseSessionServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CourseSessionServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CourseSessionServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Course c = new Course("BD51", "bati5");
        CourseSession cs1 = new CourseSession();
        CourseSession cs2 = new CourseSession();
        CourseSession cs3 = new CourseSession();
        
        cs1.setCourse(c);
        cs2.setCourse(c);
        cs3.setCourse(c);
        
        List<CourseSession> list = new ArrayList<CourseSession>();
        list.add(cs1);
        list.add(cs2);
        list.add(cs3);
        
        List<Location> locationList = new ArrayList<Location>();
        Location l1 = new Location();
        Location l2 = new Location();
        Location l3 = new Location();
        
        l1.setCity("Belfort");
        l2.setCity("Paris");
        l3.setCity("Strasbourg");
        
        l1.setId(1);
        l2.setId(2);
        l3.setId(3);
        
        locationList.add(l1);
        locationList.add(l2);
        locationList.add(l3);
        
        request.setAttribute("Locations", locationList);
        request.setAttribute("Courses", list);
        getServletContext().getRequestDispatcher("/WEB-INF/views/CourseSession.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}