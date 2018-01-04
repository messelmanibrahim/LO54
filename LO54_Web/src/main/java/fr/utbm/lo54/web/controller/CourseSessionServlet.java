package fr.utbm.lo54.web.controller;

import fr.utbm.core.service.CourseSessionService;
import fr.utbm.core.service.LocationService;
import fr.utbm.core.utils.Filter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CourseSessionServlet extends HttpServlet {


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

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String title = request.getParameter("search_title");
        String location = request.getParameter("search_location");
        String date = request.getParameter("search_date");
        Filter filter = new Filter();
        if (title != null && !title.isEmpty()) {
            filter.setCode(title);
        }
        if (location != null && !location.isEmpty()) {
            filter.setCity(location);
        }
        if (date != null && !date.isEmpty()) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
                filter.setDate(simpleDateFormat.parse(date));
            } catch (ParseException ex) {
                Logger.getLogger(CourseSessionServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
        CourseSessionService courseSessionServices= new CourseSessionService();
        LocationService locationService = new LocationService();
        request.setAttribute("Locations", locationService.getList());
        request.setAttribute("Courses", courseSessionServices.getList(filter));
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
