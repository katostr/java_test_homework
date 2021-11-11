package pack.addressbook.tests;

import org.testng.annotations.*;
import pack.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.gotoGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("Name3", "test", "test"));
    app.submitGroupCreation();
    app.returnToGroupPage();

  }

}
