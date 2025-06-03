/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.ejb.bl.SurveyFacadeLocal;
import za.ac.tut.model.entities.Survey;

/**
 *
 * @author user
 */
public class SubmiSurveyServlet extends HttpServlet {

    @EJB SurveyFacadeLocal sfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            String fullname = request.getParameter("fullname");
            
            String email = request.getParameter("email");
            
            String dobstr = request.getParameter("dob");
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            Date dob = sd.parse(dobstr);
            
            String contc = request.getParameter("contact");

            //getting food
            String foodt = "";
           
            String[] selectedFoods = request.getParameterValues("food"); 
            
            Integer countPizza =0;
            Integer countPasta =0;
            Integer countPapW = 0;
            Integer countOther =0;
            
            if (selectedFoods != null) {      
                for (String food : selectedFoods) {
                    switch (food) {
                        case "Pizza":
                            countPizza++;
                            break;
                        case "Pasta":
                            countPasta++;
                            break;
                        case "Pap and Wors":
                            countPapW++;
                            break;
                        case "Other":
                            countOther++;
                            break;
                    }
                }
            }
            
            if (selectedFoods != null) {
                foodt = String.join(", ", selectedFoods);
            }
            
            Integer watchMovie = Integer.parseInt(request.getParameter("q1"));
            
            Integer listenRadion = Integer.parseInt(request.getParameter("q2"));
            
            Integer eatOut = Integer.parseInt(request.getParameter("q3"));
            
            Integer watchTv = Integer.parseInt(request.getParameter("q4"));
            
            LocalDate birthDate = dob.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            
            LocalDate today = LocalDate.now();

            Integer age = Period.between(birthDate, today).getYears();
            
            Survey suv = new Survey( fullname,  email,  dob,  contc,  foodt,
                     countPizza,  countPasta,  countPapW,  countOther,  age,
                     watchMovie,  listenRadion,  eatOut,  watchTv);
            
            sfl.create(suv);
            
            RequestDispatcher disp = request.getRequestDispatcher("submit_survey_outcome.jsp");
            disp.forward(request, response);
            
        } catch (ParseException ex) {
            Logger.getLogger(SubmiSurveyServlet.class.getName()).log(Level.SEVERE, null, ex);
            
             RequestDispatcher disp = request.getRequestDispatcher("exception.jsp");
            disp.forward(request, response);
        }
    }

    
}
