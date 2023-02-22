package webgoat.puerto.iplocal.pageObjects;

import org.openqa.selenium.By;

public class LoginPageObject {

    By hlkRegistration = By.xpath("//a[@href='/WebGoat/registration']");

    public By getHlkRegistration() {
        return hlkRegistration;
    }
}
