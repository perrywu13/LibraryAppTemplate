import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LibraryTest {

    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library();
    }

    @Test
    public void libraryShouldHaveName() {
        library.name = "name";
        assertEquals("name", library.name, "Library class should have 'name' field");
    }

    @Test
    public void libraryShouldHaveLocation() {
        Address location = new Address();
        library.location = location;
        assertEquals(location, library.location, "Library class should have 'location' field");
    }

    @Test
    public void libraryShouldHaveBooks() {
        Book[] books = new Book[3];
        library.books = books;
        assertEquals(books, library.books, "Library class should have 'books' array field");
    }

    @Test
    public void libraryShouldHaveMembers() {
        Member[] members = new Member[3];
        library.members = members;
        assertEquals(members, library.members, "Library class should have 'members' array field");
    }

    @Test
    public void addBookShouldAddNewBookToBookArray_8Marks() {
        Book book = new Book();
        library.books = new Book[1];
        int prevLength = library.books.length;
        library.addBook(book);
        assertTrue(library.books.length == prevLength + 1, "Array size should increase by 1 when adding a new book.");
        assertEquals(book, library.books[library.books.length-1], "Last book in array should be newly added book.");
    }

    @Test
    public void addMemberShouldAddMemberToMemberArray_8Marks() {
        Member member = new Member();
        library.members = new Member[1];
        int prevLength = library.members.length;
        library.addMember(member);
        assertTrue(library.members.length == prevLength + 1, "Array size should increase by 1 when adding a new member.");
        assertEquals(member, library.members[library.members.length-1], "Last member in array should be newly added member.");
    }

}
