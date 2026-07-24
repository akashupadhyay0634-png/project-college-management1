import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FacultyLogin
 */
@WebServlet("/FacultyLogin")
public class FacultyLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter Sandeep = response.getWriter();
		String uid = request.getParameter("a");
		int pass = Integer.parseInt(request.getParameter("b"));
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/project_development", "root", "Akash@1234");
		
			  PreparedStatement p=connection.prepareStatement
					  ("select * from faculty where id  = ? and password = ?;");
			  p.setString(1, uid);
			  p.setInt(2, pass);
			  ResultSet rs=p.executeQuery();
			  if(rs.next()) {
				  response.sendRedirect("thankyou.jsp");
			  }
			  else {
				  response.sendRedirect("error.jsp");
			  }
		}  
		catch(Exception e) {
			Sandeep.println(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}