import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentSignUpApplication
 */
@WebServlet("/StudentSignUpApplication")
public class StudentSignUpApplication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentSignUpApplication() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter p = response.getWriter();
		String uId = request.getParameter("id");
		String uFirstName = request.getParameter("a");
		String uLastName = request.getParameter("b");
		String uEmail =request.getParameter("c");
		int pass = Integer.parseInt(request.getParameter("d"));
		String date =request.getParameter("e");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/project_development", "root", "Akash@1234");
		
			  PreparedStatement p1=connection.prepareStatement
					  ("insert into sign_up values(?,?,?,?,?,?);");
			  p1.setString(1, uFirstName);
			  p1.setString(2, uLastName);
			  p1.setString(3, uEmail);
			  p1.setInt(4, pass);
			  p1.setString(5, date);
			  p1.setString(6, uId);
			  p1.execute();
			  p.println("value inserted");
		}
		catch(Exception e) {
			p.println(e);
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