package wyb.dao;


import wyb.db.BookDB;
import wyb.vo.Book;
import wyb.vo.User;

import java.util.List;

/**
 * Created by 吴亚斌 on 2017/9/6.
 */
public class BookDao {
    /**
     * 添加书籍
     * @param book
     */
    public void addBook(Book book){
        BookDB.bookList.add(book);
    }
    public List<Book> getBooks(){
        return BookDB.bookList;
    }

    public void addUser(User user){
        BookDB.users.put(user.getUsername(),user.getPassword());
    }
    public boolean login(User user){
        String password= (String) BookDB.users.get(user.getUsername());
        if (user.getPassword().equals(password))
            return true;
        return false;
    }

}
