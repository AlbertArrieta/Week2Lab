/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 785264
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

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
        
        request.setAttribute("result", "---");
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        
        
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
        
        String str1 = request.getParameter("num1");
        String str2 = request.getParameter("num2");
        
        try{
            //parse input into integers
            int int1 = Integer.parseInt(str1);
            int int2 = Integer.parseInt(str2);
            
             //identify the selected button
            String function = request.getParameter("calc");
            
            //add
            if(function.equals("+"))
                request.setAttribute("result", int1 + int2);
            
            //subtract
            if(function.equals("-"))
                request.setAttribute("result", int1 - int2);
            
            //multiply
            if(function.equals("*"))
                request.setAttribute("result", int1 * int2);
            
            //divide
            if(function.equals("%"))
                request.setAttribute("result", int1 % int2);
            
            //keep values in the input
            request.setAttribute("num1", str1);
            request.setAttribute("num2", str2);
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            
        }
        
        catch(NumberFormatException e){
         request.setAttribute("result", "invalid");
         request.setAttribute("num1", str1);
         request.setAttribute("num2", str2);
               getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                       .forward(request, response);
               return;
          
         }
           
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
