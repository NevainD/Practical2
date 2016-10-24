package demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 154408J on 10/24/2016.
 */
public class BookCatalogServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       try {
           BookDBAO db = new BookDBAO();
           List<BookDetails> list.db.GetAllBooks();
           PrintWriter out= response.getWriter();
           out.println("<html>");
           out.println("<body>");
           out.println("<table>");
           for(int i=0; i<list.size();i++) {
               out.println("<tr>");
               out.println("<td>" + list.get(i).getTitle()+ "</td>");
               out.println("<td>" + list.get(i).getDescription()+ "</td>");
               out.println("<td>" + list.get(i).getYear()+ "</td>");
               out.println("</tr>");
           }
           out.println("</table>");
           out.println("</body>");
           out.println("</html>");
           out.close();
       }catch (Exception e) {
           e.printStackTrace();
           throw new ServletException();
       }

       }

}
