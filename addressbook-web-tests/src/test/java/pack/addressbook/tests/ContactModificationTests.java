package pack.addressbook.tests;

import org.testng.annotations.Test;
import pack.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification () {
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Test name2", "Test name 3", "My City1", "1234500", "test111@test.ru"));
        app.getContactHelper().submitContactModification();
    }
}
