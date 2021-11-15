package pack.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import pack.addressbook.model.ContactData;


public class ContactHelper extends HelperBase {

    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }


    public void submitContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillContactForm(ContactData contactData) {
type(By.name("firstname"),contactData.firstname());
type(By.name("lastname"),contactData.lastname());
type(By.name("address"),contactData.address());
type(By.name("home"),contactData.homeNumber());
type(By.name("email"),contactData.email());

    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void selectContact() { click(By.name("selected[]"));}

    public void deleteSelectedContact() {click(By.xpath("//input[@value='Delete']"));

    }

    public void initContactModification() { click(By.xpath("//img[@alt='Edit']"));
    }

    public void submitContactModification() {click(By.name("update"));
    }
}
