import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class 
 */
@WebServlet("/eproduct")
public class RetriveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RetriveServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int ID = Integer.parseInt(req.getParameter("ID"));
		PrintWriter out= resp.getWriter();
		resp.setContentType("text/html");
		Properties  props= new Properties();
		
		InputStream in=getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		props.load(in);
		
		
		Connection conn= DBConfig.getConnection(props);
		String query="select * from eproduct where ID=?";
		
		
		if(ID <=6) {
		if(conn!=null) {
			
			
			try {
				PreparedStatement st=  conn.prepareStatement(query);
			      
			     st.setInt(1, ID);
			      
			    ResultSet rs =st.executeQuery();
				
				out.print("<table border=1 cellpadding=10 cellspacing=0> <thead><tr>");
				out.print("<th>ID</th><th>NAME</th><th>PRICE</th><th>DATE</th>");
				out.print("<tr></thead>");
				out.print("<tbody>");
				
				while(rs.next()) {
					
					out.print("<tr>");
					//out.print(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getBigDecimal(3)+" "+rs.getTimestamp(4)+"<br>");
					out.print("<td>'"+rs.getInt(1)+"'</td><td>'"+rs.getString(2)+"'</td><td>'"+rs.getBigDecimal(3)+"'</td><td>'"+rs.getTimestamp(4)+"'</td>");
					
					out.print("</tr>");
				}
				
				out.print("</tbody></table>");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		else {
			
			out.print("Error While Connecting Connections");
		}
		}
		else {
			out.print("ID invalid/out of range");
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	

}