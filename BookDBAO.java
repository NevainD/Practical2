package demo;

import java.util.ArrayList;

/**
 * Created by 154408J on 10/24/2016.
 */
public class BookDBAO {
    public BookDetails getBookDetails(String bookId) {
        // return dummy book for testing now
        return createDummyBook(bookId);
    }

    // convenient method to create a dummy book detail
    // this method is meant for testing
    private BookDetails createDummyBook(String bookId) {
        BookDetails details = new BookDetails();
        details.setBookId(bookId);
        details.setDescription("Web components for developers talks about how web components can transfor the way you develop application for the web");
        details.setFirstName("Java");
        details.setSurname("Expert");
        details.setInventory(5);
        details.setOnSale(false);
        details.setPrice(5.9f);
        details.setTitle("Web components for developers");
        details.setYear(2015);
        return details;
    }
    public List<BookDetails>GetAllBooks(){
        ArrayList<BookDetails> list = new ArrayList<BookDetails>();
        for(int i =0 ; i<5; i++) (
                BookDetails book= new BookDetails();
        book.setBookId(bookId);
        book.setDescription("Web components for developers talks about how web components can transfor the way you develop application for the web");
        book.setFirstName("Java");
        book.setSurname("Expert");
        book.setInventory(5);
        book.setOnSale(false);
        book.setPrice(5.9f);
        book.setTitle("Web components for developers");
        book.setYear(2015);

                )
    }

}
