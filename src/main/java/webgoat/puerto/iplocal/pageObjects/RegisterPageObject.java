package webgoat.puerto.iplocal.pageObjects;

import org.openqa.selenium.By;

public class RegisterPageObject {
    By txtUser = By.xpath("//input[@id='username']");
    By txtPassword = By.xpath("//input[@id='password']");
    By txtMatchingPassword = By.xpath("//input[@id='matchingPassword']");
    By cbAgreeTerms = By.xpath("//input[@name='agree']");
    By btnSubmit = By.xpath("//button[@type='submit']");

    public By getTxtUser() {
        return txtUser;
    }
    public By getTxtPassword() {
        return txtPassword;
    }
    public By getTxtMatchingPassword() {
        return txtMatchingPassword;
    }
    public By getCbAgreeTerms() {
        return cbAgreeTerms;
    }
    public By getBtnSubmit() {
        return btnSubmit;
    }

}
