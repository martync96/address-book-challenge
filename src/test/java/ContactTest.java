import org.example.classes.Contact;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ContactTest {

    @Test
    public void incrementID() throws Exception {
        //arrange
        Contact contact1 = new Contact("John Smith", 12345678910L, "johnsmith@gmail.com");
        Contact contact2 = new Contact("John Smith", 12345678910L, "johnsmith@gmail.com");
        Contact contact3 = new Contact("John Smith", 12345678910L, "johnsmith@gmail.com");

        //act
        int id1 = contact1.getID();
        int id2 = contact2.getID();
        int id3 = contact3.getID();

        //assert
        assertEquals(id1, 1);
        assertEquals(id2, 2);
        assertEquals(id3, 3);
    }

    @Test
    public void enterName() throws Exception {
        //arrange


        //act
        Exception exception = assertThrows(Exception.class, () -> {
            Contact contact1 = new Contact("", 12345678910L, "johnsmith@gmail.com");
        });

        //assert
        assertEquals("Property cannot be null", exception.getMessage());
    }

    @Test
    public void enterPhoneNumber() throws Exception {

        //act
        Exception exception = assertThrows(Exception.class, () -> {
            Contact contact1 = new Contact("John Smith", 123456789100L, "johnsmith@gmail.com");
        });

        //assert
        assertEquals("The phone number must be 11 digits long", exception.getMessage());
    }

    @Test
    public void enterEmail() throws Exception {

        Exception exception = assertThrows(Exception.class, () -> {
            Contact contact1 = new Contact("John Smith", 12345678910L, "");
        });

        //assert
        assertEquals("Property cannot be null", exception.getMessage());
    }

    @Test
    public void validateString_throwsExceptionForEmptyOrWhitespace() {
        // Act & Assert
        Exception exception = assertThrows(Exception.class, () -> {
            Contact.validateString("");
        });
        assertEquals("Property cannot be null", exception.getMessage());

        exception = assertThrows(Exception.class, () -> {
            Contact.validateString("   ");
        });
        assertEquals("Property cannot be null", exception.getMessage());
    }

    @Test
    public void validateNumber_throwsExceptionForInvalidLength() {
        // Act & Assert
        Exception exception = assertThrows(Exception.class, () -> {
            Contact.validateNumber(123456789100L);
        });
        assertEquals("The phone number must be 11 digits long", exception.getMessage());

        exception = assertThrows(Exception.class, () -> {
            Contact.validateNumber(123456789L);
        });
        assertEquals("The phone number must be 11 digits long", exception.getMessage());
    }
}
