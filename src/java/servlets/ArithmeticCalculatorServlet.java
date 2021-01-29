
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author klydm
 */
public class ArithmeticCalculatorServlet extends HttpServlet 
{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        request.setAttribute("message", "Result:---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String add = request.getParameter("+");
        String subtract = request.getParameter("-");
        String multiply = request.getParameter("*");
        String divide = request.getParameter("%");
        
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        request.setAttribute("+", add);
        request.setAttribute("-", subtract);
        request.setAttribute("*", multiply);
        request.setAttribute("%", divide);
        
        if(first == null || first.equals("") || 
           second == null || second.equals("") || 
           !first.matches("[0-9]+") || 
           !second.matches("[0-9]+"))
        {
            request.setAttribute("message", "Invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
            return;
        }
        if(request.getAttribute("+") != null)
        {
             request.setAttribute("message",(Integer.parseInt(first) + Integer.parseInt(second)));
        }
        
        if(request.getAttribute("-") != null)
        {
             request.setAttribute("message",(Integer.parseInt(first) - Integer.parseInt(second)));
        }
        
        if(request.getAttribute("*") != null)
        {
             request.setAttribute("message",(Integer.parseInt(first) * Integer.parseInt(second)));
        }
        
        if(request.getAttribute("%") != null)
        {
            if(Integer.parseInt(first) == 0 && Integer.parseInt(second) == 0)
            {
                request.setAttribute("message", "Invalid");
            }
            else
            {
                request.setAttribute("message",(Integer.parseInt(first) / Integer.parseInt(second)));
            }
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }
}
