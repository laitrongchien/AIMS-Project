package controller;

import entity.media.Book;
import entity.media.CD;
import entity.media.DVD;
import entity.media.Media;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class AdminHomeController extends  BaseController {
    public List getAllMedia() throws SQLException {
        return new Media().getAllMedia();
    }

    public int getCountMedia(String type) throws SQLException {
        return new Media().getCountMedia(type);
    }

    public List getAllBook() throws SQLException {
        return new Book().getAllMedia();
    }

    public void insertBook(int id, String title, String category, int price, int value, int quantity, String type, String author,
                           String coverType, String publisher, Date publishDate, int numOfPages, String language,
                           String bookCategory, String imageUrl) throws SQLException {
       new Book().insertBook(id, title, category, price, value, quantity, type, author, coverType, publisher, publishDate, numOfPages, language, bookCategory, imageUrl);
    }

    public void updateBook(int id, String title, String category, int price, int value, int quantity, String type, String author,
                           String coverType, String publisher, Date publishDate, int numOfPages, String language,
                           String bookCategory) throws SQLException {
        new Book().updateBook(id, title, category, price, value, quantity, type, author, coverType, publisher, publishDate, numOfPages, language, bookCategory);
    }

    public void deleteBook(int id) throws SQLException {
        new Book().deleteBook(id);
    }

    public List getAllCD() throws SQLException {
        return new CD().getAllMedia();
    }

    public List getAllDVD() throws SQLException {
        return new DVD().getAllMedia();
    }
}
