package webgoat.puerto.iplocal.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import webgoat.puerto.iplocal.steps.MainPageStep;
import webgoat.puerto.iplocal.steps.RegisterStep;
import webgoat.puerto.iplocal.steps.SQLInjectionSectionStep;

public class RegisterStepDefinition {
    @Steps
    MainPageStep mainPageStep;
    @Steps
    RegisterStep registerStep;
    @Steps
    SQLInjectionSectionStep sqlInjectionSectionStep;


    @Given("^He is on the web page$")
    public void heIsOnTheWebPage() {
        mainPageStep.OpenBrowser();
    }

    @When("^he goes to register a user$")
    public void heGoesToRegisterAUser() {
        registerStep.ClickRegister();
    }

    @When("^he enters the user data, password and password verification$")
    public void heEntersTheUserDataPasswordAndPasswordVerification() {
        registerStep.EnterRegistrationInfo();
    }

    @When("^he agree the terms and conditions and he registers$")
    public void heAgreeTheTermsAndConditionsAndHeRegisters() {
        registerStep.AgreeTerms();
    }

    @Then("^he validates that he is already on the home page$")
    public void heValidatesThatHeIsAlreadyOnTheHomePage() {
        mainPageStep.ValidateWebGoatTag();
    }

}
