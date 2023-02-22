package webgoat.puerto.iplocal.pageObjects;

import org.openqa.selenium.By;

public class SQLAdvancedPageObject {
    By lbtnSectionFive = By.xpath("//div[@id='lesson-page-controls']//div[text()='5']");
    By lblGoal = By.xpath("//p[text()='Goal: Can you login as Tom?']");
    By lblLoginTest = By.xpath("//a[@id='login-form-link']");
    By txtUserNameLog = By.xpath("//input[@name='username_login']");
    By txtPasswordLog = By.xpath("//input[@name='password_login']");
    By lblRegisterTest = By.xpath("//a[@id='register-form-link']");
    By lblUserExists = By.xpath("//div[text()='User {0} already exists please try to register with a different username.']");
    By txtUsernameReg = By.xpath("//input[@name='username_reg']");
    By txtEmail = By.xpath("//input[@name='email_reg']");
    By txtPasswordReg = By.xpath("//input[@name='password_reg']");
    By txtPasswordConfirm = By.xpath("//input[@name='confirm_password_reg']");
    By btnRegister = By.xpath("//input[@name='register-submit']");
    By btnLogin = By.xpath("//input[@name='login-submit']");
    By lblLoginSuccesffully = By.xpath("//div[text()='Congratulations. You have successfully completed the assignment.']");


    public By getLbtnSectionFive() {
        return lbtnSectionFive;
    }
    public By getLblGoal() {
        return lblGoal;
    }
    public By getLblLoginTest() {
        return lblLoginTest;
    }
    public By getLblRegisterTest() { return lblRegisterTest;}
    public By getLblUserExists() {
        return lblUserExists;
    }
    public By getLblLoginSuccesffully() {return lblLoginSuccesffully;}
    public By getTxtUsernameReg() {return txtUsernameReg;}
    public By getTxtEmail() {return txtEmail;}
    public By getTxtPasswordReg() {return txtPasswordReg;}
    public By getTxtPasswordConfirm() {return txtPasswordConfirm;}
    public By getBtnRegister() {
        return btnRegister;
    }
    public By getBtnLogin() {return btnLogin;}
    public By getTxtUserNameLog() {return txtUserNameLog;}
    public By getTxtPasswordLog() {return txtPasswordLog;}

}
