/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.ejb.bl.SurveyFacadeLocal;

/**
 *
 * @author user
 */
public class ResultServlet extends HttpServlet {

    @EJB SurveyFacadeLocal sfl;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Integer countRows = sfl.count();
        
        Integer lowAge = sfl.lowAge();
        Integer hiAge = sfl.highAge();
        
        Double avgAge = sfl.averageAge();
        
        Integer avgPizza = sfl.countPizza();
        
        Integer avgPasta = sfl.countPasta();
        
        Integer avgPapWrod = sfl.countPapWors();
        
        //percentage for pizza
        
        double percPizza = 0.0;
        
        if (countRows > 0) {
            percPizza = ((double) avgPizza / countRows) * 100;
            percPizza = Math.round(percPizza * 10.0) / 10.0; // round to 1 decimal
        }
        
        
        //percentage for pasta
        
        double percPasta = 0.0;
        
        if (countRows > 0) {
            percPasta = ((double) avgPasta / countRows) * 100;
            percPasta = Math.round(percPasta * 10.0) / 10.0; // round to 1 decimal
        }
        
        //percentage for papWoers
        
        double percPapW = 0.0;
        
        if (countRows > 0) {
            percPapW = ((double) avgPapWrod / countRows) * 100;
            percPapW = Math.round(percPapW * 10.0) / 10.0; // round to 1 decimal
        }
        
        Double avgWatchMovie = sfl.avgWatchMovie();
        Double avgListenRadion = sfl.avgListenRadio();
        Double avgEatOut = sfl.avgEatOut();
        Double avgWatchTv = sfl.avgWatchTv();
        
        request.setAttribute("countRows", countRows);
        request.setAttribute("avgAge", avgAge);
        request.setAttribute("lowAge", lowAge);
        request.setAttribute("hiAge", hiAge);
  
        
        request.setAttribute("percPizza", percPizza);
        request.setAttribute("percPasta", percPasta);
        request.setAttribute("percPapW", percPapW);
        
        request.setAttribute("avgWatchMovie", avgWatchMovie);
        request.setAttribute("avgListenRadion", avgListenRadion);
        request.setAttribute("avgEatOut", avgEatOut);
        request.setAttribute("avgWatchTv", avgWatchTv);
        
        RequestDispatcher disp = request.getRequestDispatcher("view_survey_outcome.jsp");
        disp.forward(request, response);
    }

    
}
