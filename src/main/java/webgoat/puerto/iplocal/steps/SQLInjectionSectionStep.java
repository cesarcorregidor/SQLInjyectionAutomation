package webgoat.puerto.iplocal.steps;

import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import webgoat.puerto.iplocal.models.QueryIteration;
import webgoat.puerto.iplocal.pageObjects.MainPageObject;
import webgoat.puerto.iplocal.pageObjects.SQLAdvancedPageObject;
import webgoat.puerto.iplocal.utils.ImplicitWait;

import java.util.concurrent.TimeUnit;

public class SQLInjectionSectionStep {
    MainPageObject mainPage = new MainPageObject();
    SQLAdvancedPageObject SQLSection= new SQLAdvancedPageObject();
    ImplicitWait wait = new ImplicitWait();
    QueryIteration queryIteration = new QueryIteration();

    int value = 0;
    boolean locator = false;
    boolean continueFunction = true;
    boolean flag = false;

    String queryResult;
    @Step
    public void GoToSectionFive() {
        mainPage.getDriver().findElement(SQLSection.getLbtnSectionFive()).click();
    }

    @Step
    public void validateSectionSQL() {
        Assert.assertThat(mainPage.getDriver().findElement(SQLSection.getLblGoal())
                .isDisplayed(), Matchers.is(true));
        mainPage.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        wait.ImplicitWait(1);
    }

    @Step
    public void registerClic(){
        mainPage.getDriver().findElement(SQLSection.getLblRegisterTest()).click();
            }

    @Step
    public void queryIteration(){
        while(continueFunction) {
            queryResult = queryIteration.QueriesProcess(value, flag);
            if (queryResult == null) {return;}
            mainPage.getDriver().findElement(SQLSection.getTxtUsernameReg()).sendKeys(queryResult);
            mainPage.getDriver().findElement(SQLSection.getTxtEmail()).sendKeys("cesar@email.com");
            mainPage.getDriver().findElement(SQLSection.getTxtPasswordReg()).sendKeys("a");
            mainPage.getDriver().findElement(SQLSection.getTxtPasswordConfirm()).sendKeys("a");
            mainPage.getDriver().findElement(SQLSection.getBtnRegister()).click();
            mainPage.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
            wait.ImplicitWait(1);
            try {
                locator = mainPage.getDriver().findElement(SQLSection.getLblUserExists()).isEnabled();
                if (value == 1) {
                    value += 1;
                } else if (value == 2) {
                    flag = true;
                }
            } catch (Exception e) {
                if (value == 0) {
                    value += 1;
                }
                flag = false;
            }
        }
    }
    @Step
    public void validationLogin(){
        mainPage.getDriver().findElement(SQLSection.getLblLoginTest()).click();
        mainPage.getDriver().findElement(SQLSection.getTxtUserNameLog()).sendKeys("Tom");
        mainPage.getDriver().findElement(SQLSection.getTxtPasswordLog()).sendKeys(queryIteration.getPassword());
        mainPage.getDriver().findElement(SQLSection.getBtnLogin()).click();
        mainPage.getDriver().findElement(SQLSection.getLblLoginTest()).isDisplayed();
    }

}
