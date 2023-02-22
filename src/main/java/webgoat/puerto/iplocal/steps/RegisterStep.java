package webgoat.puerto.iplocal.steps;

import net.thucydides.core.annotations.Step;
import webgoat.puerto.iplocal.models.DataInjection;
import webgoat.puerto.iplocal.pageObjects.LoginPageObject;
import webgoat.puerto.iplocal.pageObjects.MainPageObject;
import webgoat.puerto.iplocal.pageObjects.RegisterPageObject;
import webgoat.puerto.iplocal.utils.ImplicitWait;

public class RegisterStep {
    MainPageObject mainPageObject  = new MainPageObject();
    RegisterPageObject registerPageObject = new RegisterPageObject();
    LoginPageObject loginPageObject = new LoginPageObject();
    DataInjection dataInjection = new DataInjection();
    ImplicitWait implicitWait = new ImplicitWait();

    @Step
    public void ClickRegister(){
        mainPageObject.getDriver().findElement(loginPageObject.getHlkRegistration())
                .click();
    }

    @Step
    public void EnterRegistrationInfo(){
        mainPageObject.getDriver().findElement(registerPageObject.getTxtUser())
                .sendKeys(dataInjection.getUser());
        mainPageObject.getDriver().findElement(registerPageObject.getTxtPassword())
                .sendKeys(dataInjection.getPassword());
        mainPageObject.getDriver().findElement(registerPageObject.getTxtMatchingPassword())
                .sendKeys(dataInjection.getPassword());
    }

    @Step
    public void AgreeTerms(){
        mainPageObject.getDriver().findElement(registerPageObject.getCbAgreeTerms())
                .click();
        mainPageObject.getDriver().findElement(registerPageObject.getBtnSubmit())
                .click();
        implicitWait.ImplicitWait(3);
    }


}
