package Filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

/**
 * Servlet Filter implementation class filterValidation
 */
public class filterValidation extends HttpServlet implements Filter {
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public filterValidation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		String pan = request.getParameter("pan");
		if(pan==null || !pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			PrintWriter out = response.getWriter();
			request.getRequestDispatcher("index.html").include(request, response);
			out.println("invalid pan no., please try again....");
			
		}
		else {
			request.setAttribute("pan", pan);
		chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
