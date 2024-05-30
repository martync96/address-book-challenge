import org.example.classes.AddressBook;
import org.example.classes.Contact;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddressBookTest {

    private AddressBook addressBook;

    @BeforeEach
    public void setUp() {
        addressBook = new AddressBook(1, "johnsmith");
    }

    @Test
    public void addContact() throws Exception {

        Contact contact = new Contact("John Smith", 12345678910L, "jsmith@gmail.com");

        int contactListLength = addressBook.getContactList().size();
        addressBook.addContact(contact);
        int contactListLengthPost = addressBook.getContactList().size();

        assertTrue(contactListLengthPost > contactListLength);
    }

    @Test
    public void searchForContactReturnsContacts() throws Exception {


        Contact contact1 = new Contact("John Smith", 12345678910L, "jsmith@gmail.com");
        Contact contact2 = new Contact("John Smith", 12345678911L, "jasmith@gmail.com");

        addressBook.addContact(contact1);
        addressBook.addContact(contact2);
        int expectedOutput = 2;
        int actualOutput = addressBook.searchForContact("John Smith").size();

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void searchForContactThrowsException() throws Exception {


        Exception exception = assertThrows(Exception.class, () -> {
            addressBook.searchForContact("John Smith");
        });

        assertEquals("Contact not found", exception.getMessage());
    }

    @Test
    public void removeContactReturnsTrue() throws Exception {

        Contact contact1 = new Contact("John Smith", 12345678910L, "jsmith@gmail.com");

        addressBook.addContact(contact1);
        boolean expectedOutput = true;
        boolean actualOutput = addressBook.removeContact(contact1);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void removeContactReturnsFalse() throws Exception {

        Contact contact1 = new Contact("John Smith", 12345678910L, "jsmith@gmail.com");

        addressBook.addContact(contact1);
        boolean expectedOutput = false;
        boolean actualOutput = addressBook.removeContact(contact1);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void removeContactThrowsException() throws Exception {

        Contact contact1 = new Contact("John Smith", 12345678910L, "jsmith@gmail.com");

        addressBook.addContact(contact1);

        Exception exception = assertThrows(Exception.class, () -> {
            addressBook.searchForContact("jon smith");
        });

        assertEquals("Contact not found", exception.getMessage());
    }

    @Test
    public void checkForDuplicatePhoneNumberReturnsTrue() throws Exception {

        Contact contact1 = new Contact("John Smith", 12345678910L, "jsmith@gmail.com");

        addressBook.addContact(contact1);
        boolean expectedOutput = true;
        boolean actualOutput = addressBook.checkForDuplicatePhoneNumber(12345678910L);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void checkForDuplicatePhoneNumberReturnsFalse() throws Exception {

        Contact contact1 = new Contact("John Smith", 12345678910L, "jsmith@gmail.com");

        addressBook.addContact(contact1);
        boolean expectedOutput = false;
        boolean actualOutput = addressBook.checkForDuplicatePhoneNumber(12345678911L);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void checkForDuplicateEmailReturnsTrue() throws Exception {

        Contact contact1 = new Contact("John Smith", 12345678910L, "jsmith@gmail.com");
        addressBook.addContact(contact1);

        boolean expectedOutput = true;
        boolean actualOutput = addressBook.checkForDuplicateEmailAddress("jsmith@gmail.com");

        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void checkForDuplicateEmailAddress() throws Exception {

        Contact contact1 = new Contact("John Smith", 12345678910L, "jsmith@gmail.com");
        addressBook.addContact(contact1);

        boolean expectedOutput = false;
        boolean actualOutput = addressBook.checkForDuplicateEmailAddress("jsamith@gmail.com");

        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void printContactsReturnsAllContacts() throws Exception {

        Contact contact1 = new Contact("John Smith", 12345678910L, "jsmith@gmail.com");
        Contact contact2 = new Contact("Jane Smith", 12345678911L, "jasmith@gmail.com");
        Contact contact3 = new Contact("Jone Smith", 12345678912L, "jaasmith@gmail.com");

        addressBook.addContact(contact1);
        addressBook.addContact(contact2);
        addressBook.addContact(contact3);

        int expectedOut = 3;
        int actualOutput = addressBook.printContacts().size();

        assertEquals(expectedOut, actualOutput);
    }
}
