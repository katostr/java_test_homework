package pack.addressbook.tests;

import org.testng.annotations.*;
import pack.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation() {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Test name", "Test name 2", "My City", "12345", "test@test.ru"));
    app.getContactHelper().submitContactCreation();
    app.returnToHomePage();
  }



}
