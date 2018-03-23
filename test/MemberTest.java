import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MemberTest {

    private Member member;

    @BeforeEach
    public void setUp() {
        member = new Member();
    }

    @Test
    public void shouldHaveNameField() {
        member.name = "name";
        assertEquals("name", member.name, "Member class should have 'name' field");
    }

    @Test
    public void shouldHaveBirthYearField() {
        member.birthYear = 1900;
        assertEquals(1900, member.birthYear, "Member class should have 'birthYear' field");
    }

    @Test
    public void shouldHaveAddressField() {
        Address address = new Address();
        member.address = address;
        assertEquals(address, member.address, "Member class should have 'address' field");
    }

    @Test
    public void getAgeShouldShouldBe1WhenBirthYear2017_3Marks() {
        member.birthYear = 2017;
        assertEquals(1, member.getAge());
    }

    @Test
    public void readShouldOutputMessageWithBookTitle_4Marks() {
        Book book = new Book();
        book.title = "title";
        Member member = new Member();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        member.read(book);
        assertTrue(out.toString().contains("title"), "read() method should have a message including the book's title.");
        System.setOut(System.out);
    }


}
