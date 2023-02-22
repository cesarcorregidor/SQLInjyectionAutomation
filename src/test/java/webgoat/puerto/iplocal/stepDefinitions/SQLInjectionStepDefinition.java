package webgoat.puerto.iplocal.stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import webgoat.puerto.iplocal.steps.MainPageStep;
import webgoat.puerto.iplocal.steps.RegisterStep;
import webgoat.puerto.iplocal.steps.SQLInjectionSectionStep;

public class SQLInjectionStepDefinition {
    @Steps
    MainPageStep mainPageStep;
    @Steps
    RegisterStep registerStep;
    @Steps
    SQLInjectionSectionStep sqlInjectionSectionStep;

    @When("^He registers correctly and he validates that he is already on the home page$")
    public void heRegistersCorrectlyAndHeValidatesThatHeIsAlreadyOnTheHomePage() {
        mainPageStep.OpenBrowser();
        registerStep.ClickRegister();
        registerStep.EnterRegistrationInfo();
        registerStep.AgreeTerms();
        mainPageStep.ValidateWebGoatTag();
    }

    @When("^He goes to section five of the injection advanced section$")
    public void heGoesToSectionFiveOfTheInjectionAdvancedSection() {
        mainPageStep.GoToSQLInjenctionAdvanced();
        sqlInjectionSectionStep.GoToSectionFive();
    }

    @When("^He verifies that he is in the test login$")
    public void heVerifiesThatHeIsInTheTestLogin() {
        sqlInjectionSectionStep.validateSectionSQL();

    }

    @When("^He queries until he finds the key$")
    public void heQueriesUntilHeFindsTheKey() {
        sqlInjectionSectionStep.registerClic();
        sqlInjectionSectionStep.queryIteration();
    }

    @Then("^He verifies that he has successfully logged$")
    public void heVerifiesThatHeHasSuccessfullyLogged() {
        sqlInjectionSectionStep.validationLogin();
    }

}
