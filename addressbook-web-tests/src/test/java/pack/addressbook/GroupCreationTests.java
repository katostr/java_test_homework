package pack.addressbook;

import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("Name3", "test", "test"));
    submitGroupCreation();
    returnToGroupPage();

  }

}
