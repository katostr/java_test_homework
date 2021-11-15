package pack.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    FirefoxDriver wd;
    private  ContactHelper contactHelper;
    private SessionHelper sessionHelper;
    private  NavigationHelper navigationHelper;
    private GroupHelper groupHelper;

    public void init() {
       wd = new FirefoxDriver();
       wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       wd.get("http://localhost/addressbook/");
        groupHelper = new GroupHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        sessionHelper = new SessionHelper(wd);
        contactHelper = new ContactHelper(wd);
       sessionHelper.login("admin", "secret");
    }

    public void stop() {
        wd.findElement(By.linkText("Logout")).click();
        wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public void returnToHomePage() {
      wd.findElement(By.linkText("home page")).click();
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }

    public void acceptAlert() {wd.switchTo().alert().accept();}
}
