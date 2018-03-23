import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookTest {
    @Test
    public void shouldHaveTitleField() {
        Book book = new Book();
        book.title = "title";
        assertEquals("title", book.title, "Book class should have 'title' field.");
    }

    @Test
    public void shouldHaveAuthorField() {
        Book book = new Book();
        book.author = "author";
        assertEquals("author", book.author, "Book class should have 'author' field.");
    }

    @Test
    public void shouldHavePagesField() {
        Book book = new Book();
        book.pages = new String[5];
        book.pages[0] = "1";
        assertEquals("1", book.pages[0]);
    }

    @Test
    public void toStringWorks_5Marks() {
        Book book = new Book();
        book.pages = new String[5];
        for (int i = 0; i < book.pages.length; i++)
            book.pages[i] = String.valueOf(i);

        String actual = book.toString();
        assertEquals("01234", actual);
    }

    @Test
    public void shouldReplacePageContentWithHyphen_3Marks() {
        Book book = new Book();
        book.pages = new String[5];
        for (int i = 0; i < book.pages.length; i++)
            book.pages[i] = String.valueOf(i);

        book.censorPage(0);
        assertFalse(book.toString().contains("0"), "Book should no longer contain previous contents.");
        assertTrue(book.toString().contains("-"), "Should have replaced the page contents with hyphen.");
    }
}
