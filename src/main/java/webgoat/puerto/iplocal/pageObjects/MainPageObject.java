package webgoat.puerto.iplocal.pageObjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("http://192.168.84.142:8080/WebGoat/start.mvc#lesson/WebGoatIntroduction.lesson")

public class MainPageObject extends PageObject {
    By lblWebGoat = By.id("_what_is_webgoat");
    By ddlInjection = By.xpath("//a[@category='A1Injection']");
    By lbtnSQLInjectionAdvanced = By.xpath("//a[@id='A1Injection-SQLInjectionadvanced']");

    public By getLblWebGoat(){
        return lblWebGoat;
    }
    public By getDdlInjection() {return ddlInjection;}
    public By getLbtnSQLInjectionAdvanced() {return lbtnSQLInjectionAdvanced;}

}
