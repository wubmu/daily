package wyb.servlet;

import wyb.dao.BookDao;
import wyb.vo.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 吴亚斌 on 2017/9/4.
 */
@WebServlet(name = "AddServlet",urlPatterns = "/AddServelet")
public class AddServlet extends HttpServlet {
    private BookDao bookDao = new BookDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Book book = new Book();
        book.setBookAuthor(request.getParameter("bookAuthor"));
        book.setBookName(request.getParameter("bookName"));
        book.setBookPrice(Float.parseFloat(request.getParameter("bookPrice")));
        bookDao.addBook(book);
        request.setAttribute("bookList", bookDao.getBooks());
        request.getRequestDispatcher("show.jsp").forward(request, response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
